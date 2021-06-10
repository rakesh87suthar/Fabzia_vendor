package com.rakesh.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rakesh.bean.UserBean;
import com.rakesh.util.HibernateUtil;

public class UserDao {

	private static SessionFactory factory=HibernateUtil.getSessionFactory();
	
	public static List<UserBean> getUserBean(String username,String password){
		Session session=null;
		try {
			session=factory.openSession();
			Query query=session.createQuery("FROM UserBean where name=:name1 and password=:password1");
			query.setParameter("name1", username);
			query.setParameter("password1", password);
			List<UserBean> beans=query.list();
			
			if(null !=beans && beans.size()>0) {
				return beans;
			}
			
		}catch (Exception e) {
			System.out.println("exception occured  while fetching user "+e);
			System.out.println(e);
		}finally {
			if(null !=session && session.isOpen()) {
				session.close();
			}
		}
		
		return null;
	}
	
	public static int addUserBean(UserBean bean){
		Session session=null;
		Transaction transaction=null;
		try {
			session=factory.openSession();
			transaction=session.beginTransaction();
			int id=	(Integer) session.save(bean);
			transaction.commit();
			session.close();
			return id;
		}catch (Exception e) {
			System.out.println("exception occured  while adding user "+e);
			System.out.println(e);
		}finally {
			if(null !=session && session.isOpen()) {
				session.close();
			}
		}
		
		return 0;
	}
	
	
}
