package com.xz.x.SpringTest.DAO;

import com.zx.x.SpringTest.DAO.Impl.UserDaoImpl;

public class UserDao implements UserDaoImpl {

	@Override
	public void save(String arg) {
		// TODO Auto-generated method stub
		System.out.println("save: " + arg);
	}

}
