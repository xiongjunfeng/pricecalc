package com.shctc.cloudproject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empl_info")
public class Empl_info {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "loginid")
  private String loginid;

  @Column(name = "name")
  private String name;

  @Column(name = "role")
  private String role;

  @Column(name = "password")
  private String password;

  @Column(name ="createtmp" )
  private java.sql.Timestamp createtmp;

  @Column(name = "enddt")
  private java.sql.Timestamp enddt;

  @Column(name = "deptid")
  private String deptid;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLoginid() {
    return loginid;
  }

  public void setLoginid(String loginid) {
    this.loginid = loginid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public java.sql.Timestamp getCreatetmp() {
    return createtmp;
  }

  public void setCreatetmp(java.sql.Timestamp createtmp) {
    this.createtmp = createtmp;
  }

  public java.sql.Timestamp getEnddt() {
    return enddt;
  }

  public void setEnddt(java.sql.Timestamp enddt) {
    this.enddt = enddt;
  }

  public String getDeptid() {
    return deptid;
  }

  public void setDeptid(String deptid) {
    this.deptid = deptid;
  }
}
