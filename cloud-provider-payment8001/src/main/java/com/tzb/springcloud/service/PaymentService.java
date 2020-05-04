package com.tzb.springcloud.service;

import com.tzb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: zxb
 * @create: 2020-05-03 17:36
 */
public interface PaymentService {
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
