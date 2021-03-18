package com.william.order.entity.db;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author william
 * @since 2021-03-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Order implements Serializable {


    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 用户编号
     */
    private String userNo;


}
