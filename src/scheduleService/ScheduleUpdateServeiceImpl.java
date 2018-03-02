package scheduleService;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.Schedule;

public class ScheduleUpdateServeiceImpl extends HibernateDaoSupport implements
		ScheduleUpdateServeice {

	public void updateSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(schedule);
	}

}
