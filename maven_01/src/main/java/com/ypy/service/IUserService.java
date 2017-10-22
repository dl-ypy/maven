package com.ypy.service;

import java.util.List;

import com.ypy.pojo.TUser;

public interface IUserService {
	/**
	 * 保存用户信息
	 * @param user
	 */
	void save(TUser user) throws RuntimeException;
	/**
	 * 更新用户操作
	 * @param user
	 * @throws RuntimeException
	 */
	void update(TUser user) throws RuntimeException;
	/**
	 * 删除用户信息
	 * @param user
	 * @throws RuntimeException
	 */
	void remove(TUser user) throws RuntimeException;
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	TUser findUserById(int id) ;
	/**
	 * 查询所有用户
	 * @return
	 */
	List<TUser> queryAll(TUser user);
}
