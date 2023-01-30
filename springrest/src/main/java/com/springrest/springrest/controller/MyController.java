package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MyController {
    @Autowired
   private CourseService service;
    List<Courses> ans;
    @GetMapping ("/home")
    public String home(){
        String q = "This is home page";
        return q;
    }
    @GetMapping ("/courses")
    public List<Courses> getCourses(){
        return this.service.getCourses();
    }
    @GetMapping ("/courses/{id}")
    public Courses getCourse(@PathVariable ("id") int did){
       return this.service.getCourse(did);
    }
@PutMapping ("/courses/{name}")
    public Courses put(@RequestBody Courses name){
        return this.service.put(name);
    }
    @DeleteMapping ("/courses/{id}")
    public void delete(@PathVariable String id){
        this.service.delete(Integer.parseInt(id));
    }
    @PostMapping ("/courses")
    public Courses add(@RequestBody Courses c){
       return this.service.add(c);
    }
}
