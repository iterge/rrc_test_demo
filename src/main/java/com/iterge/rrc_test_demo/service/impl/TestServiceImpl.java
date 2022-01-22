package com.iterge.rrc_test_demo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.iterge.rrc_test_demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiuPanHui
 * @date 2022/1/19
 */
@Service
@DS("master")
public class TestServiceImpl implements TestService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List selectAll() {
        return jdbcTemplate.queryForList("select * from pricing_log");
    }
}
