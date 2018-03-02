package service;

import java.util.List;

import pojo.User;

public interface UserService {
	List<User> show(String userName,String password);
	void update(User user);
	User findById(int id);
	
}
