package com.iterge.rrc_test_demo.mapper;

import com.iterge.rrc_test_demo.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * '定价工单表|liupanhui|2021-11-22' Mapper 接口
 * </p>
 *
 * @author LiuPanHui
 * @since 2022-01-20
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
