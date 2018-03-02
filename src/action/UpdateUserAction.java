package action;

import java.io.UnsupportedEncodingException;

import pojo.User;
import service.UpdateUserService;
import service.UserService;
import service.UserServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport {
	private User user;
	private User user1;
	private UserService userService;
	private UpdateUserService updateUserService;
	
	public User getUser1() {
		return user1;
	}
	public void setUser1(User user1) {
		this.user1 = user1;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public UpdateUserService getUpdateUserService() {
		return updateUserService;
	}
	public void setUpdateUserService(UpdateUserService updateUserService) {
		this.updateUserService = updateUserService;
	}
	@Override
	public String execute() throws Exception {

		user1.setEdu(new String(user.getEdu().getBytes("iso-8859-1"),"utf-8"));
		user1.setName(new String(user.getName().getBytes("iso-8859-1"), "utf-8"));
		user1.setNation(new String(user.getNation().getBytes("iso-8859-1"),"utf-8"));
		user1.setPlace(new String(user.getPlace().getBytes("iso-8859-1"),"utf-8"));
		user1.setSex(new String(user.getSex().getBytes("iso-8859-1"),"utf-8"));
		user1.setWork(new String(user.getWork().getBytes("iso-8859-1"),"utf-8"));
		
		updateUserService.updateUser(user1);
		return SUCCESS;
	}
	public String updateUserPass() throws Exception{
		
		User user2 = userService.findById(user1.getId());
		
		user1.setUserName(new String(user.getUserName().getBytes("iso-8859-1"),"utf-8"));
		
		user2.setUserName(user.getUserName());
		user2.setPassword(user.getPassword());
		updateUserService.updateUser(user2);
		return SUCCESS;
	}
}
