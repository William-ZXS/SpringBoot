package com.william.server.service.impl;

import com.william.server.entity.db.User;
import com.william.server.mapper.UserMapper;
import com.william.server.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author william
 * @since 2021-03-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
