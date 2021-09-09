package com.ivoronline.springboot_db_query_native_named_repository_dto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@NamedNativeQuery(
  name  = "Person.returnObjectArray",
  query = "SELECT name, age FROM Person WHERE name = :name"
)
@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;
}
