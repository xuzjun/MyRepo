package com.zx.x.SpringTest.Service;

import com.xz.x.SpringTest.DAO.UserDao;
import com.zx.x.SpringTest.DAO.Impl.UserDaoImpl;
import com.zx.x.SpringTest.Service.Impl.UserServiceImpl;

public class UserService implements UserServiceImpl {

	@Override
	public void save(String arg) {
		// TODO Auto-generated method stub
		System.out.println("Service ’µΩ" + arg);
		arg = arg + this.hashCode();
		UserDaoImpl userDaoImpl =  new UserDao();
		userDaoImpl.save(arg);
	}

}
