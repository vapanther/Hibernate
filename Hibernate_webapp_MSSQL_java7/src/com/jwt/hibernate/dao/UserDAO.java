package com.jwt.hibernate.dao;

import java.util.Iterator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Table;
/*import com.jwt.hibernate.bean.Book;
import com.jwt.hibernate.bean.Stock;*/
import com.jwt.hibernate.bean.User;

public class UserDAO {

	public void addUserDetails(String userName, String password, String email,
			String phone, String city) {
		try {
			Configuration configuration = new Configuration().configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Iterator<PersistentClass> classMappings = configuration.getClassMappings();
			while(classMappings.hasNext()) {
				PersistentClass persistentClass = classMappings.next();
				Table table = persistentClass.getTable();
				String tableName = table.getName();
				System.out.println("   tableName  "+tableName);
				String ClassName = persistentClass.getClassName();
				System.out.println("   tableName  "+tableName);
				System.out.println("   ClassName  "+ClassName);
			}
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			user.setEmail(email);
			user.setCity(city);
			user.setPhone(phone);
			session.saveOrUpdate(user);
			transaction.commit();
			System.out.println("\n\n Details Added \n");
			//session.close();
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}
}
