package com.ypy.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ypy.pojo.TUser;
import com.ypy.service.IUserService;
@Controller
public class UserAction extends ActionSupport implements ModelDriven<TUser>{
	@Autowired
	private IUserService service;
	private List<TUser> list;
	private TUser user;
	
	public String query() {
		setList(service.queryAll(null));
		return SUCCESS;
	}

	public List<TUser> getList() {
		return list;
	}

	public void setList(List<TUser> list) {
		this.list = list;
	}

	@Override
	public TUser getModel() {
		return user;
	}

}
