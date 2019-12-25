package com.atguigu.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.AlbumPic;
import com.atguigu.gmall.pms.service.AlbumPicService;
import com.atguigu.pms.mapper.AlbumPicMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author datou
 * @since 2019-12-24
 */
@Component
@Service
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
