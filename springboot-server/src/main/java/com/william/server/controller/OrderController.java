package com.william.server.controller;



import com.william.server.entity.db.Order;
import com.william.server.entity.request.OrderNew;
import com.william.server.entity.response.ApiResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author william
 * @since 2021-03-10
 */

@Api(tags = "订单")
@RestController
@RequestMapping("/order")
public class OrderController {

    @ApiOperation(value = "创建订单")
    @PostMapping("/new")
    ApiResp<OrderNew> newOrder(@RequestBody OrderNew orderNew ){
        System.out.print("newOrder======"+orderNew);

        return ApiResp.ok(orderNew);
    }
}
