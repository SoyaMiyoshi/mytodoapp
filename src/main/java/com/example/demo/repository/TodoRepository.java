package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.demo.domein.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {   

    List<Todo> findTodosByName(String name);

}