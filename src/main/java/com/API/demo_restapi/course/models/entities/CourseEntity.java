package com.API.demo_restapi.course.models.entities;   //to import the package

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class CourseEntity {     //created class Course
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @Size(min = 1,message = "Title should be more than atleast 1 character")
    private String title;
    @Size(min=5,message = "description should be atleast 5 character")
    private String description;



    public CourseEntity(long id, String title, String desc) {    //parameterized Constructor
        this.id = id;
        this.title = title;
        this.description = desc;
    }

    public CourseEntity() {   //default Constructor
        super();
    }

    public long getId() {
        return id;
    }   //getter for Id

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
