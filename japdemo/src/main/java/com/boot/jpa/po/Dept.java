package com.boot.jpa.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Dept implements Serializable {
	@Id
	@GeneratedValue
	private Integer deptid;
	@Column(length = 100)
	private String deptname;
	@Column(length = 100)
	private String createuser;
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getCreateuser() {
		return createuser;
	}
	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptname=" + deptname
				+ ", createuser=" + createuser + "]";
	}
	
}
