package com.codeio.helloworld.demo.HelloWorld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    Long id;
    String title;
    @NotNull
    String description;
    Boolean isCompleted;
    String email;
}
