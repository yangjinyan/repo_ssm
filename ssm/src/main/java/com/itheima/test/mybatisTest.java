package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class mybatisTest {
    @Test
    public void testMy() throws Exception {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println("account = " + account);
        }
        sqlSession.close();
        is.close();
    }
    @Test
    public void testSave() throws Exception {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);


        Account account=new Account();
        account.setName("王二小");
        account.setMoney(1000);
        accountDao.save(account);
        sqlSession.commit();
        sqlSession.close();
        is.close();
    }
}
