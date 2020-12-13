package com.sxt;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sxt.dao.UserMapper;
import com.sxt.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void queryAll() {

		Page<User> page = PageHelper.startPage(1,5);
		List<User> userList = this.userMapper.selectAll();
		System.out.println("总条数："+page.getTotal()+"，当前页："+page.getPageNum());
		for (User user : userList) {
			System.out.println(user);
		}
	}
}
