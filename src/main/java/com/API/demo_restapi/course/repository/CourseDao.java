package com.API.demo_restapi.course.repository;

import com.API.demo_restapi.course.models.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<CourseEntity,Long> {

}
