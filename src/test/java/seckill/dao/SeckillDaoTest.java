package seckill.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import seckill.entity.Seckill;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kason_zhang on 4/19/2017.
 */

/**
 * 配置Spring与Junit整合,junit启动时加载springIOC容器
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉Junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class SeckillDaoTest {
    //注入DAO实现依赖
    @Resource
    private SeckillDao seckillDao;
    @org.junit.Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int i = seckillDao.reduceNumber(1000L, killTime);
        System.out.println(i);
    }

    @org.junit.Test
    public void queryById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        //Seckill{seckillId=1000, name='1000??iphone6', number=100, startTime=Sun Nov 01 00:00:00 CST 2015, endTime=Mon Nov 02 00:00:00 CST 2015, createTime=Wed Apr 19 11:29:43 CST 2017}Apr 19, 2017 5:26:57 PM
        System.out.print(seckill);
    }

    @org.junit.Test
    public void queryAll() throws Exception {

        //java没有保存形参的记录：queryAll(int offset,int limit) -> queryAll(arg0,arg1)
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        for(Seckill s : seckills){
            System.out.print(s);
        }
    }

}