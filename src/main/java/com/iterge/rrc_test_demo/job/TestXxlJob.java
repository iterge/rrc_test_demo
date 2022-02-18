package com.iterge.rrc_test_demo.job;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.iterge.rrc_test_demo.entity.Order;
import com.iterge.rrc_test_demo.service.IOrderService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author LiuPanHui
 * @date 2022/2/7
 */
@Component
@Slf4j
public class TestXxlJob {
    @Autowired
    private IOrderService iOrderService;

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("demoJobHandler")
    public void demoJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World.");
        log.info("xxl-job测试");
    }

    @XxlJob("paramJobHandle")
    public void paramJobHandle(){
        XxlJobHelper.log("paramJobHandle 成功");
        String param = XxlJobHelper.getJobParam();
        Order order = JSON.parseObject(param,Order.class);
        boolean save = iOrderService.save(order);
        if(save){
            XxlJobHelper.log("成功！");
            log.info("成功！");
        }
    }

    @XxlJob("inputParamJobHandle")
    public ReturnT<String> inputParamJobHandle(String param){
        XxlJobHelper.log("paramJobHandle 成功");
        JSON jobParam = (JSON) JSONObject.toJSON(param);
        Order order =  JSONObject.toJavaObject(jobParam,Order.class);
        boolean save = iOrderService.save(order);
        if(save){
            XxlJobHelper.log("成功！");
            log.info("成功！");
        }
        return ReturnT.SUCCESS;
    }
}
