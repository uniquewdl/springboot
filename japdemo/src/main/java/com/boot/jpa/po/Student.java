package com.boot.jpa.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "t_student")
public class Student {

	@Id
	@GeneratedValue
	private Integer id;

	@NotEmpty(message = "姓名不能为空！")
	@Column(length = 50)
	private String name;

	@NotEmpty(message = "年龄不能为空！")
	@Min(value = 18, message = "年龄必须大于18岁！")
	@Column(length = 50)
	private String age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
