package com.william.server.controller;


import com.william.server.entity.request.NewOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author william
 * @since 2021-03-10
 */

@Api(value = "订单",tags = "dingdan")
@RestController
@RequestMapping("/order")
public class OrderController {

    @ApiOperation(value = "创建订单")
    @PostMapping("/new")
    Object newOrder(@RequestBody NewOrder newOrder){
        System.out.print("newOrder======"+newOrder);
        return newOrder;
    }
}
