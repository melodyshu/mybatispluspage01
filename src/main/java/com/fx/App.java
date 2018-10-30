package com.fx;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<String,Object> columnMap=new HashMap<String,Object>();
        columnMap.put("district","Kabol2");
        List<City> cityList=cityMapper.selectByMap(columnMap);
        System.out.println(cityList);
        List<Integer> idList=new ArrayList<Integer>();
        //idList.add(1);
        //idList.add(2);
        /*for (int i = 1; i <=10001 ; i++) {
            idList.add(i);
        }
        int count=cityMapper.deleteBatchIds(idList);
        System.out.println("删除记录数:"+count);*/
        List<City> cityList2=cityMapper.selectList(new QueryWrapper<City>().gt("id",2000));
        System.out.println(cityList2);
    }
}
