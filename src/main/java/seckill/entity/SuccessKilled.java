package seckill.entity;

/**
 * Created by kason_zhang on 4/19/2017.
 */

import java.util.Date;

/**
 * 秒杀成功的记录
 *
 */
//create table success_killed(
//        `seckill_id` bigint not null comment '秒杀商品id',
//        `user_phone` bigint not null comment '用户手机号',
//        `state` tinyint not null default -1 comment '状态标识：-1:无效，0：成功，1：已付款，2：已发货',
//        `create_time` timestamp not null comment '创建时间',
//        PRIMARY KEY (seckill_id,user_phone),/**联合主键*/
//        key idx_create_time(create_time)
//        )ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';
public class SuccessKilled {
    private long seckillId;
    private long userPhone;
    private short state;
    private Date create_time;

    //变通;
    //多对一
    private Seckill seckill;
    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", create_time=" + create_time +
                '}';
    }
}

