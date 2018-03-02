package scheduleAction;

import scheduleService.ScheduleDeleteService;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteSchedule extends ActionSupport {
	private int id;
	private int userId;
	private ScheduleDeleteService scheduleDeleteService;
	
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
	public ScheduleDeleteService getScheduleDeleteService() {
		return scheduleDeleteService;
	}
	public void setScheduleDeleteService(ScheduleDeleteService scheduleDeleteService) {
		this.scheduleDeleteService = scheduleDeleteService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		scheduleDeleteService.deleteSchedule(id);
		return SUCCESS;
	}
}
