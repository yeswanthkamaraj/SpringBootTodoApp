package com.codeio.helloworld.demo.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TodoApp")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/get")
    String getTodo(){
        todoService.printTodos();
        return "Todo";
    }
    // path variable
    @GetMapping("/{id}")
    String getTodoById(@PathVariable long id){
        return "Todo by Id"+id;
    }

    //Request Param
    @GetMapping("")
    String getTodoByIdParam(@RequestParam("todoid") long id){
        return "Todo by Id "+id;
    }

    @PostMapping("/create")
    String createUser(@RequestBody String body){
        return body;
    }
    @PutMapping("/{id}")
    String updateUser(@PathVariable long id){
        return "User updated with Id No : "+id;
    }
    @DeleteMapping("/{id}")
    String deleteUser(@PathVariable long id){
        return "User deleted with Id No : "+id;
    }
}
