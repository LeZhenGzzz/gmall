package com.atguigu.pms.service.impl;

import com.atguigu.gmall.pms.entity.ProductLadder;
import com.atguigu.gmall.pms.service.ProductLadderService;
import com.atguigu.pms.mapper.ProductLadderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author datou
 * @since 2019-12-24
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
