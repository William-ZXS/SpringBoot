package com.william.server.service.impl;

import com.william.server.entity.Stock;
import com.william.server.mapper.StockMapper;
import com.william.server.service.IStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存表 服务实现类
 * </p>
 *
 * @author william
 * @since 2021-03-10
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements IStockService {

}
