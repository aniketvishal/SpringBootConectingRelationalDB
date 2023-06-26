//package com.API.demo_restapi.course.models.responses;
//
//import com.API.demo_restapi.course.models.entities.Course;
//
//public class CourseResponse {   //created Class CourseResponse for the clear response in return
//    boolean status;
//    String message;
//    Course course;
//
//    public CourseResponse(boolean status, String message, Course course) {   //parameterized Constructor
//        this.status = status;
//        this.message = message;
//        this.course = course;
//    }
//
//    public CourseResponse() {    //setting default Constructor
//
//    }
//
//    public boolean isStatus() {
//        return status;
//    }    //getter for Status
//
//    public String getMessage() {
//        return message;
//    }  //getter for message
//
//    public Course getCourse() {
//        return course;
//    }  //getter for course
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }  //setter for status
//
//    public void setMessage(String message) {  //setter for message
//        this.message = message;
//    }
//
//    public void setCourse(Course course) {
//        this.course = course;
//    }  //setter for course
//
//    @Override
//    public String toString() {        //to String Function
//        return "CourseResponse{" +
//                "status=" + status +
//                ", message='" + message + '\'' +
//                ", course=" + course +
//                '}';
//    }
//}
//
//
