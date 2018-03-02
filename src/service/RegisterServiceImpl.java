package service;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.User;

public class RegisterServiceImpl extends HibernateDaoSupport implements	RegisterService {

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}

}
