package seckill.dao;

import org.apache.ibatis.annotations.Param;
import seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by kason_zhang on 4/19/2017.
 */

/**
 * 多个参数需要使用@Param
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据id进行查询
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
