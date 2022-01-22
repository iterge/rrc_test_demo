package com.iterge.rrc_test_demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.iterge.rrc_test_demo.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author LiuPanHui
 * @date 2022/1/18
 */
@RestController
@Slf4j
@Api("HealthController|一个用来测试swagger注解的控制器")
public class HealthController {
    @Autowired
    private TestService service;

    @ApiOperation("探活")
    @GetMapping("/health")
    public String health(){
        return "ok";
    }

    @ApiOperation("测试")
    @GetMapping("test")
    public String test(){
        List list = service.selectAll();
        return JSONObject.toJSONString(list);
    }

    public static void main(String[] args) {

        String property = System.getProperty("user.dir");
        log.info(property);
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/pricing", "root", "12345678")
                .globalConfig(builder -> {
                    builder.author("LiuPanHui") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(property+"/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.iterge") // 设置父包名
                            .moduleName("rrc_test_demo") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, property+"/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("pricing_order") // 设置需要生成的表名
                            .addTablePrefix("pricing_"); // 设置过滤表前缀
                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                //.templateEngine(new FreemarkerTemplateEngine())
                .execute();

    }
}
