package com.API.demo_restapi.course.Service;

import com.API.demo_restapi.course.models.entities.CourseEntity;

import com.API.demo_restapi.models.responses.DemoRestApiResponse;

import java.util.List;

public interface CourseService {

    public DemoRestApiResponse<List<CourseEntity>> getCourse();   //declaring the function that is called in Controller for encapsulation
                                        // to return list of courses
    public DemoRestApiResponse getoneCourse(String CourseId); //declaring the function to return the specific data

    public DemoRestApiResponse addCourse(CourseEntity course);//declaring the function to add the new data


}



