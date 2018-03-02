package scheduleAction;

import java.util.List;

import pojo.Schedule;
import pojo.User;
import scheduleService.GetAllService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ScheduleAction extends ActionSupport {
	private int userId;           
	private List<Schedule> list;
	private GetAllService getAllService;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<Schedule> getList() {
		return list;
	}
	public void setList(List<Schedule> list) {
		this.list = list;
	}
	public GetAllService getGetAllService() {
		return getAllService;
	}
	public void setGetAllService(GetAllService getAllService) {
		this.getAllService = getAllService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		user = (User) ActionContext.getContext().getSession().get("user1");
		System.out.println(user.getId()+user.getBirth()+user.getEdu()+user.getEmail());
		int uid = user.getId();
		list = getAllService.getAll(uid);
		return SUCCESS;
	}
}
