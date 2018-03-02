package scheduleAction;

import pojo.Schedule;
import scheduleService.ScheduleUpdateServeice;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateSchedule2 extends ActionSupport {
	private Schedule schedule;
	private ScheduleUpdateServeice scheduleUpdateServeice;
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public ScheduleUpdateServeice getScheduleUpdateServeice() {
		return scheduleUpdateServeice;
	}
	public void setScheduleUpdateServeice(
			ScheduleUpdateServeice scheduleUpdateServeice) {
		this.scheduleUpdateServeice = scheduleUpdateServeice;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		scheduleUpdateServeice.updateSchedule(schedule);
		userId = schedule.getUserId();
		return SUCCESS;
	}
}
