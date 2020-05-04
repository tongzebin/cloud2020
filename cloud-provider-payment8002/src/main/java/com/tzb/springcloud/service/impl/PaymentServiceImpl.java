package com.tzb.springcloud.service.impl;

import com.tzb.springcloud.dao.PaymentDao;
import com.tzb.springcloud.entities.Payment;
import com.tzb.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: zxb
 * @create: 2020-05-03 17:36
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
