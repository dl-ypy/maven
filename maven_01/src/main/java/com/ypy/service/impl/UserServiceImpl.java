package com.ypy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ypy.dao.IUserDao;
import com.ypy.pojo.TUser;
import com.ypy.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;
	
	@Override
	public void save(TUser user) throws RuntimeException {
		// TODO Auto-generated method stub
		dao.save(user);
	}

	@Override
	public void update(TUser user) throws RuntimeException {
		// TODO Auto-generated method stub
		dao.update(user);
	}

	@Override
	public void remove(TUser user) throws RuntimeException {
		// TODO Auto-generated method stub
		dao.remove(user);
	}

	@Override
	public TUser findUserById(int id) {
		// TODO Auto-generated method stub
		return dao.findUserById(id);
	}

	@Override
	public List<TUser> queryAll(TUser user) {
		// TODO Auto-generated method stub
		return dao.queryAll(user);
	}

}
