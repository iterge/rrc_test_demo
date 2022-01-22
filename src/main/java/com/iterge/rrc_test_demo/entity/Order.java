package com.iterge.rrc_test_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * '定价工单表|liupanhui|2021-11-22'
 * </p>
 *
 * @author LiuPanHui
 * @since 2022-01-20
 */
@TableName("pricing_order")
@ApiModel(value = "Order对象", description = "'定价工单表|liupanhui|2021-11-22'")
@Accessors(chain = true)
@Setter
@Getter
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id|liupanhui|2021-11-22")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("工单号|liupanhiu|2021-11-22")
    private String orderId;

    @ApiModelProperty("车源编号|liupanhui|2021-11-22")
    private String carId;

    @ApiModelProperty("业务线|liupanhui|2021-11-22")
    private String businessLine;

    @ApiModelProperty("请求流水号|liupanhui|2021-11-22")
    private String requestNo;

    @ApiModelProperty("车辆品牌|liupanhui|2021-11-22")
    private String carBrand;

    @ApiModelProperty("车系|liupanhui|2021-11-22")
    private String carSeries;

    @ApiModelProperty("车型|liupanhui|2021-11-22")
    private String carModel;

    @ApiModelProperty("工单状态 1:初检已定价；2:复检已定价；3:初检待定价；4:复检待定价；5:初检待核价；6:复检待核价；7:初检核价拒绝待定价；8:复检核价拒绝待定价；|liupanhui|2021-11-22")
    private Integer status;

    @ApiModelProperty("价格|liiupanhui|2021-11-22")
    private Double price;

    @ApiModelProperty("总部建议收车价|liupanhui|2021-11-22")
    private Double suggestPrice;

    @ApiModelProperty("合同成交价|liupanhui|2021-11-22")
    private Double dealPrice;

    @ApiModelProperty("业务类型 1:nc;2:nb|liupanhui|2021-11-22")
    private Integer businessType;

    @ApiModelProperty("所属门店|liupanhui|2021-11-22")
    private String shopName;

    @ApiModelProperty("所属城市|liupanhui|2021-11-22")
    private String city;

    @ApiModelProperty("收车类型 1:零售；2:批发|liupanhui|2021-11-22")
    private Integer buyCarType;

    @ApiModelProperty("复检报告|liupanhui|2021-11-22")
    private String recheckReport;

    @ApiModelProperty("创建时间|liupanhui|2021-11-22")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间|liupanhui|2021-11-22")
    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "Order{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", carId=" + carId +
        ", businessLine=" + businessLine +
        ", requestNo=" + requestNo +
        ", carBrand=" + carBrand +
        ", carSeries=" + carSeries +
        ", carModel=" + carModel +
        ", status=" + status +
        ", price=" + price +
        ", suggestPrice=" + suggestPrice +
        ", dealPrice=" + dealPrice +
        ", businessType=" + businessType +
        ", shopName=" + shopName +
        ", city=" + city +
        ", buyCarType=" + buyCarType +
        ", recheckReport=" + recheckReport +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
