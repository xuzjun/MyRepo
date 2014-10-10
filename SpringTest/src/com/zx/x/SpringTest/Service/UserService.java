package com.zx.x.SpringTest.Service;

import com.xz.x.SpringTest.DAO.Impl.UserDaoImpl;
import com.xz.x.SpringTest.Service.Impl.UserServiceImpl;
import com.zx.x.SpringTest.DAO.UserDao;

public class UserService implements UserServiceImpl {

	@Override
	public void save(String arg) {
		// TODO Auto-generated method stub
		System.out.println("Sevice: " + arg);
		arg += this.hashCode();
		UserDaoImpl userDaoImpl = new UserDao();
		userDaoImpl.save(arg);
	}
	
}
