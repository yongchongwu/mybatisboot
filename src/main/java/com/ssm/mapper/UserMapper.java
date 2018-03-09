package com.ssm.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ssm.domain.User;

public interface UserMapper extends BaseMapper<User> {

  User selectByPrimaryKey(Integer id);
}
