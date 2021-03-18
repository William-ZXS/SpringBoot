package com.william.stock.entity.request;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "订单")
@Data
public class OrderNew {


    /**
     * 数量
     */
    @ApiModelProperty(value = "数量",example = "10")
    private Integer num;

    /**
     * 用户编号
     */
    @ApiModelProperty(value = "用户编号",example = "10000000001")
    private String userNo;
}
