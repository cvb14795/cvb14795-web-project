package com.example.demo.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/api/query")
	public ResponseEntity<Person> getPersonByID(
			@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "name", required = false) String name){
		try {
			Person entity = personService.findById(id);
			return new ResponseEntity<Person>(entity, HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
		}
	}
}
