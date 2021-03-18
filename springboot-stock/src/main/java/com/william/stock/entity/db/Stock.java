package com.william.stock.entity.db;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 库存表
 * </p>
 *
 * @author william
 * @since 2021-03-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Stock implements Serializable {


    /**
     * 库存
     */
    private Integer num;


}
