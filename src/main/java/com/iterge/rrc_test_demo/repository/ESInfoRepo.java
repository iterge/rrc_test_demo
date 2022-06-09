package com.iterge.rrc_test_demo.repository;

import com.iterge.rrc_test_demo.entity.ESInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author liuph
 * @date 2022/6/7 19:10:58
 */

public interface ESInfoRepo extends ElasticsearchRepository<ESInfo,String> {
}
