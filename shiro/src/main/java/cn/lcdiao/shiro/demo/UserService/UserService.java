package cn.lcdiao.shiro.demo.UserService;

import cn.lcdiao.shiro.demo.domain.User;

public interface UserService {
    public User findByName(String name);

    public User findById(int id);
}
