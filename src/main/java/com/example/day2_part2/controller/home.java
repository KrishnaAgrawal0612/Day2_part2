package com.example.day2_part2.controller;

import com.example.day2_part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class home {
    @GetMapping("/")
    public List<StudentModel> getStudent(){
        List<StudentModel> student=new ArrayList<>();
       student.add(new StudentModel(1,"Krishna","krishna@gmail.com"));
       student.add(new StudentModel(2,"awasthi","awasthi@gmail.com"));
       student.add(new StudentModel(3,"ayush","ayush@gmail.com"));
        student.add(new StudentModel(4,"Asutosh","ashutosh@gmail.com"));
        student.add(new StudentModel(5,"Lalkesh","lalkesha@gmail.com"));
       return student;
    }
}
