package com.zx.x.SpringTest.Handler;

import com.xz.x.SpringTest.Service.Impl.UserServiceImpl;
import com.zx.x.SpringTest.Service.UserService;

public class UserHandler {
	
	public void saveUserInfo(String name) {
		UserServiceImpl userService = new UserService();
		userService.save(name);
	}
}
