package com.william.server.service.impl;

import com.william.server.entity.Order;
import com.william.server.mapper.OrderMapper;
import com.william.server.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author william
 * @since 2021-03-10
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
