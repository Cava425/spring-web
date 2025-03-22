package com.example.springweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class HelloWordController {

    @GetMapping
    public Object get() {
        Map<String, BigDecimal> map = new HashMap<>();
        map.put("0", BigDecimal.ZERO);
        map.put("1", BigDecimal.ONE);
        map.put("10", BigDecimal.TEN);
        return map;
    }

}

