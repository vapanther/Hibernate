package com.crosscode.spring_Oracle.config;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.crosscode.spring.dao"),
	      @ComponentScan("com.crosscode.spring.service") })
public class AppConfig {

   @Bean
   @Qualifier(value = "entityManager")
   public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
      LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
      factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");
      try {
		System.out.println("inside the doPost  factoryBean "+factoryBean.getPersistenceUnitName()+"factoryBean.Datasource"+factoryBean.getJpaPropertyMap());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return factoryBean;
   }

   @Bean
   public JpaTransactionManager geJpaTransactionManager() {
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
      return transactionManager;
   }
}
