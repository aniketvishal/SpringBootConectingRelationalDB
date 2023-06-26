package com.API.demo_restapi.course;
import com.API.demo_restapi.DemoRestapiApplication;
import com.API.demo_restapi.course.Service.CourseService;

import com.API.demo_restapi.course.models.entities.CourseEntity;

import com.API.demo_restapi.models.responses.DemoRestApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/abc")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/Courses")
    public DemoRestApiResponse<List<CourseEntity>> getCourse(){
        return this.courseService.getCourse();
    }

    @GetMapping("/Courses/{courseId}")
    public DemoRestApiResponse getoneCourse(@PathVariable String courseId){
        return this.courseService.getoneCourse( courseId);
    }
    @RequestMapping(value = "/addCourses",method = RequestMethod.POST)
    public DemoRestApiResponse addCourse(@Valid @RequestBody CourseEntity course){
        return this.courseService.addCourse(course);
    }





}
