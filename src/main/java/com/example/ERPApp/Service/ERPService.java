package com.example.ERPApp.Service;

import com.example.ERPApp.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class ERPService {
    private static List<Student> students = new ArrayList<>();
    private static int roll_No = 0;
    static{
        Student s1 = new Student(++roll_No,"abc", "male", List.of(20.3,35.0,60.8,90.0,50.7),"Allahabad");
        Student s2 = new Student(++roll_No,"Neelima", "female", List.of(56.3,67.0,80.8,30.0,40.7),"Haryana");
        Student s3 = new Student(++roll_No,"Ganesh", "male", List.of(50.3,30.0,78.8,39.0,98.7),"Aamer");
        Student s4 = new Student(++roll_No,"Yogant", "male", List.of(58.3,20.0,60.8,68.0,97.7),"Jaipur");
        Student s5 = new Student(++roll_No,"Mulethi", "female", List.of(45.3,89.0,40.8,95.0,40.7),"Goa");
    }
}
