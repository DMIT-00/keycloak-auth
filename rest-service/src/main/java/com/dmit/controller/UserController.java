package com.dmit.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping
    public List<String> getUsers() {
        return List.of("John", "Adam", "Kate");
    }
}
