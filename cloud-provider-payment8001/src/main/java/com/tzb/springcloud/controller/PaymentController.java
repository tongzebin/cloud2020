package com.tzb.springcloud.controller;

import com.netflix.discovery.DiscoveryClient;
import com.tzb.springcloud.entities.CommonResult;
import com.tzb.springcloud.entities.Payment;
import com.tzb.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: TZB
 * @create: 2020-05-03 17:53
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentServiceImpl paymentServiceImpl;
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentServiceImpl.create(payment);
//        log.info("***插入结果" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功 服务端口号"+serverPort, result);
        } else {
            return new CommonResult(404, "插入数据失败 服务端口号"+serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        Payment payment = paymentServiceImpl.getPaymentById(id);
//        log.info("***查询结果" + payment);
        if (null != payment) {
            return new CommonResult(200, "查询数据成功 服务端口号"+serverPort, payment);
        } else {
            return new CommonResult(404, "查询ID为"+id+"的数据失败服务端口号"+serverPort, null);
        }
    }
}
