package com.jwt.hibernate.dao3;

import java.util.Iterator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Table;
import com.jwt.hibernate.bean.Book;
import com.jwt.hibernate.bean.Stock;
import com.jwt.hibernate.bean.User;

public class UserDAO {
	private Configuration configuration ;
	
	SessionFactory sessionFactory;

	public UserDAO() {
		// 1. configuring hibernate
		configuration=new Configuration().configure();

					// 2. create sessionfactory
					sessionFactory = configuration.buildSessionFactory();
		// TODO Auto-generated constructor stub
	}

	public void addUserDetails(String userName, String password, String email,
			String phone, String city) {
		try {
			// 1. configuring hibernate
			/*Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			*/
			
			
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
			
			
			

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			User user = new User();
			user.setUserName(userName);
			user.setPassword1(password);
			user.setEmail(email);
			user.setCity(city);
			user.setPhone(phone);
			session.saveOrUpdate(user);
			transaction.commit();
			System.out.println("\n\n Details Added \n");
			session.close();
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}
	
	public void addStockDetails(String stockName, String stockCode) {
		try {
			/*// 1. configuring hibernate
			Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();*/
			
			
			
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
			
			
			

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			Stock stock = new Stock();
			//stock.setStockId(stockId);
			stock.setStockCode(stockCode);
			stock.setStockName(stockName);
			session.save(stock);
			transaction.commit();
			System.out.println("\n\n Details Added \n");
			session.close();
		} 
		catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}
	}
		
		
		public void addBookkDetails(String bookisbn, String bookname,
				String bookaurthor, String bookpublisher,int bookprice) {
			try {
				/*// 1. configuring hibernate
				Configuration configuration = new Configuration().configure();

				// 2. create sessionfactory
				SessionFactory sessionFactory = configuration.buildSessionFactory();*/
				
				
				
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
				
				
				

				// 3. Get Session object
				Session session = sessionFactory.openSession();

				// 4. Starting Transaction
				Transaction transaction = session.beginTransaction();
				Book book = new Book();
				//book.setId(bookId);
				book.setIsbn(bookisbn);
				book.setName(bookname);
				book.setAuthor(bookaurthor);
				book.setPublisher(bookpublisher);
				book.setPrice(bookprice);
				session.save(book);
				transaction.commit();
				System.out.println("\n\n Details Added \n");
				session.close();
				

			} catch (HibernateException e) {
				System.out.println(e.getMessage());
				System.out.println("error");
			}

	}

}
