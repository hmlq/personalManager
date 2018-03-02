package scheduleService;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.Schedule;

public class ScheduleQueryServiceImpl extends HibernateDaoSupport implements
		ScheduleQueryService {

	public List<Schedule> query(String name, int userId) {
		// TODO Auto-generated method stub
		String hql = "from Schedule where (date like '%"+name+"%' or thing like '%"+name+"%') and userId = '"+userId+"'";
		List<Schedule> list = getHibernateTemplate().find(hql);
		return list;
	}
	
	public Schedule querySchedule(int id,int userId) {
		// TODO Auto-generated method stub
		System.out.println("sssssssssss");
		String hql = "from Schedule where id='"+id+"' and userId = '"+userId+"'";
		Schedule schedule = (Schedule) getHibernateTemplate().find(hql).get(0);
		return schedule;
	}
}
