package action;

import pojo.User;
import service.RegisterService;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private RegisterService registerService;
	private User user;
	public RegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
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
		registerService.saveUser(user);
		return SUCCESS;
	}
}
