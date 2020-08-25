package com.hzw.zookeeper.leaderselect;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.leader.LeaderSelector;
import org.apache.curator.framework.recipes.leader.LeaderSelectorListenerAdapter;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author: huangzuwang
 * @date: 2019-08-08 11:24
 * @description:
 */
public class LeaderSelectorClient extends LeaderSelectorListenerAdapter implements Closeable {

    /**
     * 当前线程名
     */
    private String name;

    /**
     * leader选举客户端
     */
    private LeaderSelector leaderSelector;


    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public LeaderSelectorClient(String name) {
        this.name = name;
    }

    public LeaderSelector getLeaderSelector() {
        return leaderSelector;
    }

    public void setLeaderSelector(LeaderSelector leaderSelector) {
        this.leaderSelector = leaderSelector;
    }

    /**
     * 开始竞争Leader
     */
    public void start(){
        //打开 自动重复参与选举的开关
        leaderSelector.autoRequeue();
        leaderSelector.start();
    }

    /**
     * 该方法为当前线程获得锁【leader权限】之后的回调方法，此方法执行结束，当前线程释放锁【leader权限】
     * @param client
     * @throws Exception
     */
    @Override
    public void takeLeadership(CuratorFramework client) throws Exception {
        System.out.println("---->> " + name + " 现在是Leader了");
        //阻塞当前进程，防止丢失
        countDownLatch.await();
    }

    @Override
    public void close() throws IOException {
        leaderSelector.close();
    }
}
