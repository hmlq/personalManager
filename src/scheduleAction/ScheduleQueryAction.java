package scheduleAction;

import java.util.List;

import pojo.Schedule;
import scheduleService.ScheduleQueryService;

import com.opensymphony.xwork2.ActionSupport;

public class ScheduleQueryAction extends ActionSupport {
	private String name;
	private List<Schedule> list;
	private ScheduleQueryService scheduleQueryService;
	private int userId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Schedule> getList() {
		return list;
	}
	public void setList(List<Schedule> list) {
		this.list = list;
	}
	public ScheduleQueryService getScheduleQueryService() {
		return scheduleQueryService;
	}
	public void setScheduleQueryService(ScheduleQueryService scheduleQueryService) {
		this.scheduleQueryService = scheduleQueryService;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list = scheduleQueryService.query(name, userId);
		return SUCCESS;
	}
	
}
