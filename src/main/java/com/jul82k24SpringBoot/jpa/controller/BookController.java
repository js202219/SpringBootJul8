package com.jul82k24SpringBoot.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {


    @GetMapping("/getBook")
    public String getBook(){
        return "This is a Book..";
    }

    @GetMapping("/getBooks")
    public List<String> getBooks(){
        return List.of("This is book 1 ","This is Book 2");
    }

}
