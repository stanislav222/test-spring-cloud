package com.example.userservice.service;

import com.example.userservice.model.JustInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient(name = "info-service", fallbackFactory = Fallback.class)
public interface ServiceFeignClient {

    @GetMapping("/getAll")
    public List<JustInfo> getAll();
}
