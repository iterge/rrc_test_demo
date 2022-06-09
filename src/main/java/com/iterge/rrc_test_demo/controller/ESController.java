package com.iterge.rrc_test_demo.controller;

import com.alibaba.fastjson.JSON;
import com.iterge.rrc_test_demo.entity.ESInfo;
import com.iterge.rrc_test_demo.repository.ESInfoRepo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author liuph
 * @date 2022/6/7 19:27:43
 */
@RestController
@RequestMapping("/rrc_test_demo/es")
@Api(tags = "ESController|es测试接口")
public class ESController {
    @Autowired
    private ESInfoRepo esInfoRepo;

    @GetMapping("find/{id}")
    public String find(@PathVariable String id){
        Optional<ESInfo> byId = esInfoRepo.findById(id);
        return JSON.toJSONString(byId);

    }
}
