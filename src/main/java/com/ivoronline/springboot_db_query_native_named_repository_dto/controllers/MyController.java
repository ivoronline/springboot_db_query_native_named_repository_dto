package com.ivoronline.springboot_db_query_native_named_repository_dto.controllers;

import com.ivoronline.springboot_db_query_native_named_repository_dto.entities.Person;
import com.ivoronline.springboot_db_query_native_named_repository_dto.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON
  //================================================================
  @RequestMapping("ReturnPerson")
  Person returnPerson() {
    Person person = personRepository.returnPerson("John", 20);
    return person;
  }

  //================================================================
  // RETURN ARRAY
  //================================================================
  @RequestMapping("ReturnArray")
  Object[] returnArray() {
    Object[] array = (Object[]) personRepository.returnArray("John", 20);
    return   array;
  }

  //================================================================
  // RETURN STRING
  //================================================================
  @RequestMapping("ReturnString")
  String returnString() {
    String nameAge = personRepository.returnString("John", 20);
    return nameAge;
  }

  //================================================================
  // RETURN SCALAR
  //================================================================
  @RequestMapping("ReturnScalar")
  Integer returnScalar() {
    Integer age = personRepository.returnScalar("John", 20);
    return  age;
  }

}


