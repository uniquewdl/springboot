package com.boot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.jpa.po.Student;

/**
 * 学生Dao接口
 * 
 * @author user
 * 
 */
public interface StudentDao extends JpaRepository<Student, Integer> {

}