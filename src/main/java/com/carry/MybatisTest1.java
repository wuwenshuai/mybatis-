package com.carry;

import com.carry.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest1 {

    @Test
    public void testMybatis() throws IOException {
        //加载核心文件
        String resource="sqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
        //创建sqlSession
        SqlSession session=sqlSessionFactory.openSession();
        //执行sql语句
         User user = session.selectOne("user.findUserById", 1);
         System.out.println(user);
    }
}