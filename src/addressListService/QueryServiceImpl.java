package addressListService;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.Addresslist;

public class QueryServiceImpl extends HibernateDaoSupport implements
		QueryService {

	public List<Addresslist> query(String name,int userId) {
		// TODO Auto-generated method stub  or email like '%"+name+"%' or phone like '%"+name+"%' or workspace like '%"+name+"%' or qq like '%"+name+"%'or place like '%"+name+"%'
	//	String hql = "from Addresslist where name = ?";
		
		String hql = "from Addresslist where (name like '%"+name+"%' or phone like '%"+name+"%' or email like '%"+name+"%' or qq like '%"+name+"%') and userId = '"+userId+"'";
		List<Addresslist> list = getHibernateTemplate().find(hql);
		return list;
	}

}
