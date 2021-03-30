package com.example.userservice.controller;

import com.example.userservice.model.JustInfo;
import com.example.userservice.service.ServiceFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {

    public final ServiceFeignClient serviceFeignClient;

    @RequestMapping(path = "/getAll")
    public List<JustInfo> getDataByFeignClient() {
        List<JustInfo> list = serviceFeignClient.getAll();
        return list;
    }

    public UserController(ServiceFeignClient serviceFeignClient) {
        this.serviceFeignClient = serviceFeignClient;
    }

}
