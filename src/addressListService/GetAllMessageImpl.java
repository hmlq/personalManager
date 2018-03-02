package addressListService;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.Addresslist;

public class GetAllMessageImpl extends HibernateDaoSupport implements
		GetAllMessage {

	public List<Addresslist> allMessage(int userId) {
		String hql = "from Addresslist where userId = '"+userId+"'";
		List<Addresslist> list =this.getHibernateTemplate().find(hql);
		return list;
	}

}
