package service;

import javax.transaction.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.User;

public class UpdateUserServiceImpl extends HibernateDaoSupport implements UpdateUserService {
	public void updateUser(User user) {
		// TODO Auto-generated method stub+
		this.getHibernateTemplate().update(user);
	}

}
