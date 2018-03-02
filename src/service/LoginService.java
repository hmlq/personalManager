package service;

import pojo.User;

public interface LoginService {
	User isLogin(String userName,String password);
}
