package service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.User;

public class LoginServiceImpl extends HibernateDaoSupport implements LoginService {

	public User isLogin(String userName, String password) {
		// TODO Auto-generated method stub
		String hql = "from User where userName='"+userName+"' and password='"+password+"'";
		List<User> list = getHibernateTemplate().find(hql);
		return list.get(0);
	}

}
