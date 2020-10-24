package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer> {
	// 模糊查找name 精確查找rentDate
	List<Person> findByNameLikeAndRentDate(String name, String rentDate);
	// 模糊查找name 精確查找rentSpec
	List<Person> findByNameLikeAndRentSpec(String name, String rentSpec);
	// 精確查找name
	Person findByName(String name);
	
}
