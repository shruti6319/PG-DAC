package com.demo.service;

import com.demo.beans.RegisterUser;
import com.demo.beans.User;

public interface LoginService {

	User validateUser(String uname, String password);

	void registerUser(RegisterUser user);

}
