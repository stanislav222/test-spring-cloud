package com.example.userservice.service;

import com.example.userservice.model.JustInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Slf4j
@Component
public class Fallback implements FallbackFactory<ServiceFeignClient> {
        @Override
    public ServiceFeignClient create(Throwable cause) {
        return new ServiceFeignClientFallback(cause);
    }
}
