package com.hzw.springboot.jdbc.repository;

import com.hzw.springboot.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * @author: huangzuwang
 * @date: 2019-09-10 18:00
 * @description:
 */
@Repository
public class UserRepository {

    @Autowired
    private DataSource masterDataSource;


    @Autowired
    private PlatformTransactionManager platformTransactionManager;

    @Autowired
    private UserMapper userMapper;

    private JdbcTemplate jdbcTemplate;

    /**
     * 构造器形式注入
     * @param jdbcTemplate
     */
    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Transactional(rollbackFor = Throwable.class)
    public boolean save(User user){
        userMapper.insert(user);
//        System.out.printf(">>>>>>>>[%s] UserRepository Save User:[%s]\n",Thread.currentThread().getName(), user.toString());
//        System.out.println("masterDataSource : " + masterDataSource.toString());
//                jdbcTemplate.execute("insert into user (`age`, `birth`, `name`,`updated_at`) values ( ?, ?, ?, ?)", (PreparedStatementCallback<Boolean>) preparedStatement -> {
//                    preparedStatement.setInt(1, 26);
//                    preparedStatement.setString(2, "1993-01-01");
//                    preparedStatement.setString(3, "hzw");
//                    preparedStatement.setString(4,"20191029");
//                    return preparedStatement.executeUpdate() > 0;
//                });
        return true;
    }

    /**
     * 使用API进行事务操作
     * @author: huangzuwang
     * @date: 2019-10-30 11:55
     * @param user
     * @return
     **/
    public boolean platformTransactionSave(User user){
        DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        //开始事务
        TransactionStatus transactionStatus = platformTransactionManager.getTransaction(transactionDefinition);
        try {
            System.out.printf(">>>>>>>>[%s] UserRepository Save User:[%s]\n",Thread.currentThread().getName(), user.toString());
            System.out.println("masterDataSource : " + masterDataSource.toString());
            jdbcTemplate.execute("insert into user (`age`, `birth`, `name`,`updated_at`) values ( ?, ?, ?, ?)", (PreparedStatementCallback<Boolean>) preparedStatement -> {
                preparedStatement.setInt(1, 26);
                preparedStatement.setString(2, "1993-01-01");
                preparedStatement.setString(3, "hzw");
                preparedStatement.setString(4,"20191029");
                return preparedStatement.executeUpdate() > 0;
            });
            //提交
            platformTransactionManager.commit(transactionStatus);
        }catch (Throwable e){
            //回滚
            platformTransactionManager.rollback(transactionStatus);
        }
        return true;
    }
}
