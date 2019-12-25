package com.atguigu.oms.service.impl;

import com.atguigu.gmall.oms.entity.CartItem;
import com.atguigu.gmall.oms.service.CartItemService;
import com.atguigu.oms.mapper.CartItemMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author datou
 * @since 2019-12-24
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
