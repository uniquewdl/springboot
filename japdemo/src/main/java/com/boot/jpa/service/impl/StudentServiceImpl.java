package com.boot.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.jpa.dao.StudentDao;
import com.boot.jpa.po.Student;
import com.boot.jpa.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public void add(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
	}
}
