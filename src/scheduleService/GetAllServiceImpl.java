package scheduleService;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.Schedule;

public class GetAllServiceImpl extends HibernateDaoSupport implements
		GetAllService {

	public List<Schedule> getAll(int userId) {
		// TODO Auto-generated method stub
		String hql = "from Schedule where userId = '"+userId+"'";
		List<Schedule> list = getHibernateTemplate().find(hql);
		return list;
	}

}
