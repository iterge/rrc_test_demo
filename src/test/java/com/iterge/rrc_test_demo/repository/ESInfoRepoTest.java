package com.iterge.rrc_test_demo.repository;

import com.iterge.rrc_test_demo.entity.ESInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author liuph
 * @date 2022/6/7 19:14:15
 */
@SpringBootTest
public class ESInfoRepoTest {
    @Resource
    private ESInfoRepo esInfoRepo;

    @Test
    public void find(){
        Optional<ESInfo> byId = esInfoRepo.findById("1");
        System.out.println(byId);
    }
}
