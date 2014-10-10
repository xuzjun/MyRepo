package com.zx.x.SpringTest.Test;

import org.junit.Test;

import com.zx.x.SpringTest.Service.UserService;
import com.zx.x.SpringTest.Service.Impl.UserServiceImpl;

public class UserTest {

	@Test
	public void test() {
		UserServiceImpl userService = new UserService();
		userService.save("name-xuzjun");
	}

}
