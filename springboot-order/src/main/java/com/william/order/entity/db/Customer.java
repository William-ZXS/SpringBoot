package com.william.order.entity.db;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author william
 * @since 2021-03-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Customer implements Serializable {


    /**
     * 姓名
     */
    private String name;

    /**
     * 用户编号
     */
    private String userNo;


}
