package cn.lcdiao.shiro.demo.mapper;

import cn.lcdiao.shiro.demo.domain.User;

public interface UserMapper {
    /**
     * 通过name找到user对象
     * @param name
     * @return
     */
    public User findByName(String name);
}
