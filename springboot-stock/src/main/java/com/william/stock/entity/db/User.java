package com.william.stock.entity.db;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class User implements Serializable {


    /**
     * 姓名
     */
    private String name;

    /**
     * 用户编号
     */
    private String userNo;


}
