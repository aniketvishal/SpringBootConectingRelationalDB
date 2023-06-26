package com.API.demo_restapi.course.Service.Impl;

import com.API.demo_restapi.course.models.entities.CourseEntity;
import com.API.demo_restapi.course.repository.CourseDao;
import com.API.demo_restapi.course.Service.CourseService;
import com.API.demo_restapi.models.responses.DemoRestApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {   //declaring the interface class i.e abstract function

    @Autowired
    private CourseDao coursedao;

    //List<Course> list;   //list that is declared globally

    @Override         //this function was already declared in the interface function overriding it
    public DemoRestApiResponse getoneCourse(String CourseId) {
        try{
            return DemoRestApiResponse.success("Success",coursedao.getOne(Long.valueOf(CourseId)));
        } catch (Exception e){

            return DemoRestApiResponse.failed("course not found",null);

        }
    }

    @Override //overriding the function declared in interface function to add new courses
    public DemoRestApiResponse addCourse(CourseEntity course) {
        return DemoRestApiResponse.success("Success",coursedao.save(course));
    }

    @Override  //overriding the function declared in the interface function to get the list of the course
    public DemoRestApiResponse<List<CourseEntity>> getCourse() {
        return DemoRestApiResponse.success("SUCCESS",coursedao.findAll());
        //return list;
    }
}
