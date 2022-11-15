package com.paulobarbosa.foxlibrary.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    @GetMapping
    public String index() {
        return "Hello Word v2!!!";
    }
}
