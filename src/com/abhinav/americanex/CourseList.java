package com.abhinav.americanex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseList {

    public static void main(String args[]){
        List<Course> empList = new ArrayList<>();

        createEmployeeList(empList);

        Map<String, List<Course>> empMap =  empList.stream().collect(Collectors.groupingBy(Course::getId));

        List<Course> courseList =empList.stream().filter(Course -> Course.getCname().contains("Architecture")).collect(Collectors.toList());
        empMap.forEach((key,value) -> System.out.println("Cname : " + key + "Desc" + value));


    }

    public static void createEmployeeList(List<Course> empList){
        Course course1 = new Course();
        course1.setId("1");
        course1.setCname("Architecture");
        course1.setDesc("first sem");

        Course course2 = new Course();
        course2.setId("1");
        course2.setCname("Architecture");
        course2.setDesc("second sem");

        Course course3 = new Course();
        course3.setId("1");
        course3.setCname("Architecture");
        course3.setDesc("third sem");
        Course course4 = new Course();
        course4.setId("1");
        course4.setCname("Architecture");
        course4.setDesc("fourth sem");

        empList.add(course1);
        empList.add(course2);
        empList.add(course3);
        empList.add(course4);
    }
}
