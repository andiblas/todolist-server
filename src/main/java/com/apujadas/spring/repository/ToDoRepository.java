package com.apujadas.spring.repository;

import com.apujadas.spring.domain.ToDo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface ToDoRepository extends PagingAndSortingRepository<ToDo, Long> {

}
