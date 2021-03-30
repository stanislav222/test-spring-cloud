package com.example.userservice.service;

import com.example.userservice.model.JustInfo;
import feign.FeignException;

import java.util.LinkedList;
import java.util.List;

public class ServiceFeignClientFallback implements ServiceFeignClient {

    private final Throwable cause;

    public ServiceFeignClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public List<JustInfo> getAll() {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404)  {
            System.out.println("404");
        } else {
            System.out.println("Other error");
        }

        return new LinkedList<>();
    }
}
