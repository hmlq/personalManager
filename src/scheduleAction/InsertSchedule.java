package scheduleAction;

import pojo.Schedule;
import scheduleService.InsertScheduleService;

import com.opensymphony.xwork2.ActionSupport;

public class InsertSchedule extends ActionSupport {
	private InsertScheduleService insertScheduleService;
	private Schedule schedule;
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

	public InsertScheduleService getInsertScheduleService() {
		return insertScheduleService;
	}

	public void setInsertScheduleService(InsertScheduleService insertScheduleService) {
		this.insertScheduleService = insertScheduleService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(schedule.getDate());
		System.out.println(schedule.getThing());
		System.out.println(schedule.getUserId());
		schedule.setUserId(userId);
		insertScheduleService.saveSchedule(schedule);
		return SUCCESS;
	}
}
