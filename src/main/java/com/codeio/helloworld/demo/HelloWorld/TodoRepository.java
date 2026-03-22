package com.codeio.helloworld.demo.HelloWorld;

import com.codeio.helloworld.demo.HelloWorld.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


//CRUD
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
