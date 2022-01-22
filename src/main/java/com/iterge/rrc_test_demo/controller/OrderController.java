package com.iterge.rrc_test_demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.iterge.rrc_test_demo.entity.Order;
import com.iterge.rrc_test_demo.service.IOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * '定价工单表|liupanhui|2021-11-22' 前端控制器
 * </p>
 *
 * @author LiuPanHui
 * @since 2022-01-20
 */
@RestController
@RequestMapping("/rrc_test_demo/order")
@Api(tags = "OrderController|一个用来测试swagger注解的控制器")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;

    @ApiOperation("查询列表")
    @GetMapping("/list")
    public String getList(){
        List<Order> list = iOrderService.list();
        System.out.println(list.size());
        return JSONObject.toJSONString(list);
    }

    @PostMapping("add")
    public String add(){
        Order order = new Order();
        order.setOrderId("eeeeee")
                .setCarId("12")
                .setBusinessLine("1")
                .setRequestNo("12")
                .setCarBrand("宝马")
                .setCarSeries("13")
                .setCarModel("132")
                .setStatus(1)
                .setPrice(123.12)
                .setSuggestPrice(55555.0)
                .setDealPrice(66666.0)
                .setBusinessType(1)
                .setShopName("五方")
                .setCity("bj")
                .setBuyCarType(1)
                .setRecheckReport("1");
        boolean save = iOrderService.save(order);
        return "ok";
    }
}

