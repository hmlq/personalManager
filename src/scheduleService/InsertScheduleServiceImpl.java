package scheduleService;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.Schedule;

public class InsertScheduleServiceImpl extends HibernateDaoSupport implements
		InsertScheduleService {

	public void saveSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(schedule);
	}

}
