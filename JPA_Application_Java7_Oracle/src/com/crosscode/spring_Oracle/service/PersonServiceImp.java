package com.crosscode.spring_Oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crosscode.spring_Oracle.dao.PersonDao;
import com.crosscode.spring_Oracle.entity.Person;

@Service
public class PersonServiceImp implements PersonService {

   @Autowired
   private PersonDao personDao;

   @Transactional
   @Override
   public void add(Person person) {
      personDao.add(person);
   }

  /*
   public List<Person> listPersons() {
      return personDao.listPersons();
   }*/

}
