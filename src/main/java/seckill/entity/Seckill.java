package seckill.entity;

/**
 * Created by kason_zhang on 4/19/2017.
 */

import java.util.Date;

/**
 * 秒杀
 * create table seckill(
 `seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
 `name` varchar(120) NOT NULL COMMENT '商品名称',
 `number` int NOT NULL COMMENT '库存数量',
 `start_time` timestamp NOT NULL COMMENT '秒杀开始时间',
 `end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
 `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 PRIMARY KEY(seckill_id),
 key idx_start_time(start_time),
 key idx_end_time(end_time),
 key idx_create_time(create_time)
 )ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf-8 COMMENT='秒杀库存表'
 */
public class Seckill {
    private long seckillId;
    private String name;
    private int number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
