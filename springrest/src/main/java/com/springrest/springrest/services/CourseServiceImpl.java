package com.springrest.springrest.services;

import com.springrest.springrest.CoursesDao;
import com.springrest.springrest.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
@Autowired
    private CoursesDao courseDao;
    @Override
    public List<Courses> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Courses getCourse(int id) {
        return courseDao.findById(id).get();
    }

    @Override
    public Courses put(Courses name) {
        courseDao.save(name);
        return name;
    }

    @Override
    public void delete(int id) {
    Courses entity =  courseDao.findById(id).get();
      courseDao.delete(entity);
    }

    @Override
    public Courses add(Courses c) {
       return courseDao.save(c);

    }
}
