package com.mydatabase.dbproject.controller;

import com.mydatabase.dbproject.domain.Student;
import com.mydatabase.dbproject.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
public class MainAppController {

    private final StudentServiceImpl studentService;

    @Autowired
    public MainAppController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String index() {

        return "home";
    }
    @GetMapping("/main")
    public String mainPage() {

        return "mainPage";
    }
    @GetMapping("/main/allstudents")
    public String showAll(Model model) {
        List<Student> allStudents = StreamSupport.stream(studentService.findAll()
                .spliterator(), false)
                .collect(Collectors.toList());
        model.addAttribute("studentsInfo", allStudents);
        return "students";
    }
    @GetMapping("/main/allstudents/{id}")
    public String showStudent(@PathVariable("id") Long id, Model model) {
        model.addAttribute("student", studentService.findById(id).orElse(new Student()));
        return "student";
    }
    @GetMapping("main/allstudents/new")
    public String newPerson(Model model) {
        model.addAttribute("student", new Student());

        return "new";
    }

    @PostMapping("/main/allstudents/")
    public String create(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/main/allstudents";
    }
    @GetMapping("/main/allstudents/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findById(id).orElse(new Student()));
        return "edit";
    }
    @PatchMapping("/main/allstudents/{id}")
    public String update(@ModelAttribute Student student, @PathVariable Long id) {
        studentService.update(id, student);
        studentService.save(student);
        return "redirect:/main/allstudents";
    }
    @DeleteMapping("/main/allstudents/{id}")
    public String delete(@ModelAttribute("student") Student student) {
        studentService.delete(student);
        return "redirect:/main/allstudents";
    }


}
