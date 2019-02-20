package cn.lcdiao.shiro.demo.UserService.UserServiceImpl;

import cn.lcdiao.shiro.demo.UserService.UserService;
import cn.lcdiao.shiro.demo.domain.User;
import cn.lcdiao.shiro.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    //注入Mapper接口
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
