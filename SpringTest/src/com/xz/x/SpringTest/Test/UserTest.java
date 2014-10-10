package com.xz.x.SpringTest.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.zx.x.SpringTest.Handler.UserHandler;

public class UserTest {
	
	private static UserHandler userHandler = new UserHandler();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		userHandler.saveUserInfo("user");
	}

}
