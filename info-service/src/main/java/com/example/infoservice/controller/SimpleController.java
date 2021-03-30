package com.example.infoservice.controller;

import com.example.infoservice.model.JustInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class SimpleController {

    @GetMapping("/")
    public String mainRout() {
        return "Hello";
    }

    @GetMapping("/getAll")
    public List<JustInfo> getAll() {
        List<JustInfo> a = new LinkedList<>();
        a.add(new JustInfo(1l, "1", "1"));
        a.add(new JustInfo(1l, "2", "2"));
        a.add(new JustInfo(1l, "3", "3"));
        a.add(new JustInfo(1l, "4", "4"));
        a.add(new JustInfo(1l, "5", "5"));
        return a;
    }

}
