package com.codeio.helloworld.demo.HelloWorld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    long id;
    String title;
    String Description;
    Boolean isCompleted;
}
