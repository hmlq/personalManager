package scheduleService;

import java.util.List;

import pojo.Schedule;

public interface ScheduleQueryService {
	List<Schedule> query(String name,int userId);
	Schedule querySchedule(int id,int userId);
}
