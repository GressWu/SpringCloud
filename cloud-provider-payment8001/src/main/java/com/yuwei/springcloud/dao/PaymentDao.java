package com.yuwei.springcloud.dao;

import com.yuwei.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper //与数据库交互的接口
public interface PaymentDao {
    public int create(Payment payment);    //写

    public  Payment getPaymentById(@Param("id") Long id); //读
}
