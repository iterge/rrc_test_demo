package com.iterge.rrc_test_demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author liuph
 * @date 2022/6/7 19:06:27
 */

@Document(indexName = "test_index0")
@Data
public class ESInfo {

    @Id
    private String id;

    private String username;

    private String password;

    private int age;
}
