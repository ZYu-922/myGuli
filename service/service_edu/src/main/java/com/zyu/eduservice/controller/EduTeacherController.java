package com.zyu.eduservice.controller;


import com.zyu.eduservice.entity.EduTeacher;
import com.zyu.eduservice.mapper.EduTeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author zyu
 * @since 2023-07-27
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
@CrossOrigin
public class EduTeacherController {
    @Autowired
    EduTeacherMapper eduTeacherMapper;

    @GetMapping("/getAllTeacher")
    public List<EduTeacher> getAllTeacher(){

        List<EduTeacher> res=eduTeacherMapper.selectList(null);
        return res;
    }

    @GetMapping("/testNacos")
    public String testNacos(){
        return "This is service-edu's method!";
    }

}

