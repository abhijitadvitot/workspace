package com.example.demo.webcontroller;


import java.util.Optional;

import javax.xml.validation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.reposirtory.StudentRepository;
import com.example.demo.serviceImp.StudentServiceImpl;

@Controller
@RequestMapping("/students/")
public class MyController {

	@Autowired
	private StudentServiceImpl impl;
	
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("signup")
	public String showSignUpForm(Student student) {
		return "add-student";
	}
	
	@GetMapping("list")
    public String showUpdateForm(Model model) {
		
        model.addAttribute("students", impl.listStudents());
        return "index";
    }

    @PostMapping("add")
    public String addStudent(@Validated Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-student";
        }

        impl.saveStudent(student);
        return "redirect:list";
    }

    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Student student = studentRepository.getById(id);
        model.addAttribute("student", student);
        return "update-student";
    }

    @PostMapping("update/{id}")
    public String updateStudent(@PathVariable("id") Long id, @Validated Student student, BindingResult result,
        Model model) {
        if (result.hasErrors()) {
            student.setId(id);
            return "update-student";
        }

        studentRepository.save(student);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") long id, Model model) {
        Optional<Student> student = studentRepository.findById(id);
        studentRepository.deleteById(id);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
}
