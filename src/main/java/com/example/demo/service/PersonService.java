package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonDao personDao;
	
	public void addPerson(Person entity) {
		personDao.save(entity);
	}
	
	public Person findById(Integer id) {
		return personDao.findById(id).get();
	}
	
	public Person findByName(String name) {
		return personDao.findByName(name);
	}
	
	public List<Person> findByNameLikeAndRentDate(String name, String rentDate) {
		return personDao.findByNameLikeAndRentDate(name, rentDate);
	}
	
	public List<Person> findByNameLikeAndRentSpec(String name, String rentSpec) {
		return personDao.findByNameLikeAndRentSpec(name, rentSpec);
	}
	
	public void deleteByid(Integer id) {
		personDao.deleteById(id);
	}
	
}
