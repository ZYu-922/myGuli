package com.zyu.aclservice.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient("service-edu")
public interface EduClient {

    @GetMapping("/eduservice/edu-teacher/testNacos")
    public String testNacos();
}
