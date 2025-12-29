package com.demo.dao;

import com.demo.beans.RegisterUser;
import com.demo.beans.User;

public interface LoginDao {

	User authentication(String uname, String password);

	void registeruser(RegisterUser user);

}
