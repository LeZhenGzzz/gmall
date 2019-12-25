package com.atguigu.pms.service.impl;

import com.atguigu.gmall.pms.entity.Comment;
import com.atguigu.gmall.pms.service.CommentService;
import com.atguigu.pms.mapper.CommentMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author datou
 * @since 2019-12-24
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
