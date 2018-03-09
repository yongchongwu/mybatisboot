package com.ssm;

import com.ssm.domain.User;
import com.ssm.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		User user=userMapper.selectByPrimaryKey(1);
		System.out.println(user.toString());

		user=userMapper.selectById(2);
		System.out.println(user.toString());
	}

}
