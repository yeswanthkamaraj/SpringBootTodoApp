package com.codeio.helloworld.demo.HelloWorld;

import com.codeio.helloworld.demo.HelloWorld.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TodoApp")
public class TodoController {
    @Autowired
    private TodoService todoService;


    // path variable
    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable long id){
        try{
            Todo createdTodo=todoService.getTodoById(id);
            return  new ResponseEntity<>(createdTodo,HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping
    ResponseEntity<List<Todo>> getTodos(){
        return new ResponseEntity<List<Todo>>(todoService.getTodos(),HttpStatus.OK);
    }
  @GetMapping("/page")
  ResponseEntity<Page<Todo>> getTodosPaged(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(todoService.getAllTodoPages(page,size),HttpStatus.OK);
  }


    @PostMapping("/create")
    ResponseEntity<Todo> createUser(@RequestBody Todo todo){
        return new  ResponseEntity<>(todoService.createTodo(todo),HttpStatus.CREATED);
    }


    @PutMapping
    ResponseEntity<Todo> updateUser(@RequestBody Todo todo){
       return new  ResponseEntity<>(todoService.updateTodo(todo),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable long id){
        todoService.deleteTodoById(id);
    }

}
