package action;

import org.omg.CORBA.Request;

import pojo.User;
import service.UserService;
import service.UserServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private UserService userService;
	private User user;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		user=userService.show(user.getUserName(), user.getPassword()).get(0);
		return SUCCESS;
	}

}
