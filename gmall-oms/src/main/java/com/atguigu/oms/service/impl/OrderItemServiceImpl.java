package com.atguigu.oms.service.impl;

import com.atguigu.gmall.oms.entity.OrderItem;
import com.atguigu.gmall.oms.service.OrderItemService;
import com.atguigu.oms.mapper.OrderItemMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author datou
 * @since 2019-12-24
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
