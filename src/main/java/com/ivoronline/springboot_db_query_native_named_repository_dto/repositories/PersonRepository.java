package com.ivoronline.springboot_db_query_native_named_repository_dto.repositories;

import com.ivoronline.springboot_db_query_native_named_repository_dto.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Person returnPerson (String name, Integer age);
  Object returnArray  (String name, Integer age);
  Integer returnScalar(String name, Integer age);
  String returnString (String name, Integer age);
}


