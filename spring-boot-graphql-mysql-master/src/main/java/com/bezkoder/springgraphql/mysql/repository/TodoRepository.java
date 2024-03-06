package com.bezkoder.springgraphql.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springgraphql.mysql.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}