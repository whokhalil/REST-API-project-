package com.springrest.springrest.services;
import com.springrest.springrest.entities.Courses;

import java.util.*;
public interface CourseService {
    public List<Courses> getCourses();

    public Courses getCourse(int id);

   public Courses put(Courses name);

    public void delete(int id);

    public Courses add(Courses c);
}
