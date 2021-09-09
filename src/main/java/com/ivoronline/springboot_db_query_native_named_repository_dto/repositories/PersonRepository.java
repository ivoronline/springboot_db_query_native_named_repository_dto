package com.ivoronline.springboot_db_query_native_named_repository_dto.repositories;

import com.ivoronline.springboot_db_query_native_named_repository_dto.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Object returnObjectArray(String name);
}


