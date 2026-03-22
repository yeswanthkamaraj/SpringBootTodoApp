package com.codeio.helloworld.demo.HelloWorld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.misc.NotNull;
@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    Long id;
    String title;
    String description;
    Boolean isCompleted;
    String email;
}
