package com.ypy.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ypy.dao.IUserDao;
import com.ypy.pojo.TUser;
import com.ypy.utils.BaseDao;
@Repository
public class UserDaoImpl extends BaseDao implements IUserDao {
	
	@Override
	public void save(TUser user) throws RuntimeException {
		super.getSession().save(user);

	}

	@Override
	public void update(TUser user) throws RuntimeException {
		super.getSession().update(user);
	}

	@Override
	public void remove(TUser user) throws RuntimeException {
		super.getSession().delete(user);
	}

	@Override
	public TUser findUserById(int id) {
		return (TUser) super.getSession().get(TUser.class, id);
	}

	@Override
	public List<TUser> queryAll(TUser user) {
		String hql = "from TUser";
		return super.getSession().createQuery(hql).list();
	}

}
