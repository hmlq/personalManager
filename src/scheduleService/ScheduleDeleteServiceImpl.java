package scheduleService;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.Schedule;

public class ScheduleDeleteServiceImpl extends HibernateDaoSupport implements
		ScheduleDeleteService {

	public void deleteSchedule(int id) {
		// TODO Auto-generated method stub
		String hql = "from Schedule where id = '"+id+"'";
		Schedule schedule = (Schedule) getHibernateTemplate().find(hql).get(0);
		getHibernateTemplate().delete(schedule);
		
	}

}
