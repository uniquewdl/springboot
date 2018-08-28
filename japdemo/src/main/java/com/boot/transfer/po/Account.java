package com.boot.transfer.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="t_account")
@Entity
public class Account{
@Id
@GeneratedValue
private Integer id;
 
@Column(length=50)
private String userName;
 
private float balance;

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public float getBalance() {
    return balance;
}

public void setBalance(float balance) {
    this.balance = balance;
}
 
}
