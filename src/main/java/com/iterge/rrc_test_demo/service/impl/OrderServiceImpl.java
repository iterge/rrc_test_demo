package com.iterge.rrc_test_demo.service.impl;

import com.iterge.rrc_test_demo.entity.Order;
import com.iterge.rrc_test_demo.mapper.OrderMapper;
import com.iterge.rrc_test_demo.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * '定价工单表|liupanhui|2021-11-22' 服务实现类
 * </p>
 *
 * @author LiuPanHui
 * @since 2022-01-20
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
