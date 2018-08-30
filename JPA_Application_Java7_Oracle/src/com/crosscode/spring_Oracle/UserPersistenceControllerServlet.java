package com.crosscode.spring_Oracle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;







import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.crosscode.spring_Oracle.config.AppConfig;
import com.crosscode.spring_Oracle.entity.Person;
import com.crosscode.spring_Oracle.service.PersonService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author ankit
 *
 */

@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.crosscode.spring.dao"),
	      @ComponentScan("com.crosscode.spring.service") })
public class UserPersistenceControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext	
	PersonService personService;
	

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("inside the doPost ");
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("LOCAL_PERSISTENCE");
		 EntityManager em = factory.createEntityManager();
		 em.getTransaction().begin();	
		 em.persist(new Person("Oracle", "Bora", "ajay.bora@example.com"));
		 em.persist(new Person("Crosscode", "Miller", "crosscode.miller@example.com"));			
		 em.persist(new Person("Sameer", "Chutala", "Cheetah.singh@example.com"));
		 em.persist(new Person("Steave", "Smith", "steve.smith@example.com"));
		 em.getTransaction().commit();
         em.close();
      response.sendRedirect("Success");
   }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
