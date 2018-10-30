package com.fx;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        CityMapper cityMapper= applicationContext.getBean(CityMapper.class);
        City city= cityMapper.selectById(1);
        //List<City> cityList=cityMapper.selectList(null);
        System.out.println(city);
    }
}
