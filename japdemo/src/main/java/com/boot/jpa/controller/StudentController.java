package com.boot.jpa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.jpa.po.Student;
import com.boot.jpa.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	/**
	 * 添加图书
	 * 
	 * @param book
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/add")
	public String add(@Valid Student student, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return bindingResult.getFieldError().getDefaultMessage();
		} else {
			studentService.add(student);
			return "添加成功！";
		}
	}
}
