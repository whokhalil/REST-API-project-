package com.springrest.springrest;

import com.springrest.springrest.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface CoursesDao extends JpaRepository<Courses,Integer>{

}


