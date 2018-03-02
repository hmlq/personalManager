package action;

import pojo.User;
import service.LoginService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private LoginService loginService;
	private User user;
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
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
		user = loginService.isLogin(user.getUserName(),user.getPassword());
		ActionContext.getContext().getSession().put("user1", user);
		if(user.getId()!=null)
			return SUCCESS;
		return ERROR;
	}
}
