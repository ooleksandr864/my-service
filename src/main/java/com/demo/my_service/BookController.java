package com.demo.my_service;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {
        System.out.println("loging");

        return List.of(
                new Book(1L, "Clean Code", "Robert C. Martin"),
                new Book(2L, "Effective Java", "Joshua Bloch"),
                new Book(3L, "Spring in Action", "Craig Walls")
        );
    }
}
