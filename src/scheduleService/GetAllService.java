package scheduleService;

import java.util.List;

import pojo.Schedule;

public interface GetAllService {
	List<Schedule> getAll(int userId);
}
