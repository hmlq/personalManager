package service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.User;

public class UserServiceImpl extends HibernateDaoSupport implements UserService {

	public List<User> show(String userName,String password) {
		// TODO Auto-generated method stub
		String hql = "from User where userName='"+userName+"' and password='"+password+"'";
		List<User> list = getHibernateTemplate().find(hql);
		return list;
	}

	public void update(User user) {
		this.getHibernateTemplate().update(user);	
	}
	
	public User findById(int id) {
		// TODO Auto-generated method stub
		String hql = "from User where id='"+id+"'";
		List<User> list =getHibernateTemplate().find(hql);
		System.out.println(list.get(0).getId());
		System.out.println(hql);
		return list.get(0);
	}
}
