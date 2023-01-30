package com.springrest.springrest;

import com.springrest.springrest.entities.Courses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringrestApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);



	}

}
