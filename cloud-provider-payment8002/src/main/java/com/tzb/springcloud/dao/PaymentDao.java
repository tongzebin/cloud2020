package com.tzb.springcloud.dao;

import com.tzb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author TZB
 */
@Mapper
public interface PaymentDao {
    /**
     * 创建
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);




}
