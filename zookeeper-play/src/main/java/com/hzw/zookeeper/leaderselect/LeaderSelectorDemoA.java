package com.hzw.zookeeper.leaderselect;

import com.hzw.zookeeper.CuratorFrameworkConnection;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.leader.LeaderSelector;

import java.io.IOException;

/**
 * @author: huangzuwang
 * @date: 2019-08-08 11:22
 * @description: Leader选举演示 课程 3.5.11
 */
public class LeaderSelectorDemoA {
    public static void main(String[] args) throws IOException {
        CuratorFramework curatorFramework = CuratorFrameworkConnection.get();

        LeaderSelectorClient leaderSelectorClient = new LeaderSelectorClient("");
        LeaderSelector leaderSelector = new LeaderSelector(curatorFramework, "/leaderTest", leaderSelectorClient);
        leaderSelectorClient.setLeaderSelector(leaderSelector);
        leaderSelectorClient.start();
        System.in.read();
    }
}
