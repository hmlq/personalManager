package scheduleAction;

import pojo.Schedule;
import scheduleService.ScheduleQueryService;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateSchedule1 extends ActionSupport {
	private int id;
	private int userId;
	private ScheduleQueryService scheduleQueryService;
	private Schedule schedule;
	
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ScheduleQueryService getScheduleQueryService() {
		return scheduleQueryService;
	}
	public void setScheduleQueryService(ScheduleQueryService scheduleQueryService) {
		this.scheduleQueryService = scheduleQueryService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		schedule = scheduleQueryService.querySchedule(id,userId);
		return SUCCESS;
	}
}
