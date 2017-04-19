package seckill.dao;

import org.apache.ibatis.annotations.Param;
import seckill.entity.SuccessKilled;

/**
 * Created by kason_zhang on 4/19/2017.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 如果影响行数>1 标识更新的记录行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据id 和 userPhone (这两个构成了唯一主键) 查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
}
