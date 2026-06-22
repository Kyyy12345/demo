package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired JdbcTemplate jdbcTemplate;

    @GetMapping("/welcome4")
    @ResponseBody
    public List<Map<String, Object>> home4() { // List, Map, DTO
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from emp");

        return list;
    }

    @GetMapping("/welcome3")
    @ResponseBody
    public List<Integer> home3() { // List, Map, DTO
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(25);
        return list;
    }

    @GetMapping("/welcome2")
    public String home2() {
        return "home";
    }

    @GetMapping("/welcome1")
    @ResponseBody
    public String home1() {
        return "home";
    }
}