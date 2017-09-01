package com.shctc.cloudproject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cust_info")
public class Cust_info {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "custid")
  private String custid;

  @Column(name = "custname")
  private String custname;

  @Column(name = "gender")
  private String gender;

  @Column(name = "area")
  private String area;

  @Column(name = "birthday")
  private String birthday;

  @Column(name = "custtp")
  private String custtp;

  @Column(name = "phone")
  private String phone;

  @Column(name = "work")
  private String work;

  @Column(name = "createtmp")
  private java.sql.Timestamp createtmp;

  @Column(name = "createby")
  private String createby;

  @Column(name = "lstupdtmp")
  private java.sql.Timestamp lstupdtmp;

  @Column(name = "lstupdby")
  private String lstupdby;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCustid() {
    return custid;
  }

  public void setCustid(String custid) {
    this.custid = custid;
  }

  public String getCustname() {
    return custname;
  }

  public void setCustname(String custname) {
    this.custname = custname;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getCusttp() {
    return custtp;
  }

  public void setCusttp(String custtp) {
    this.custtp = custtp;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public java.sql.Timestamp getCreatetmp() {
    return createtmp;
  }

  public void setCreatetmp(java.sql.Timestamp createtmp) {
    this.createtmp = createtmp;
  }

  public String getCreateby() {
    return createby;
  }

  public void setCreateby(String createby) {
    this.createby = createby;
  }

  public java.sql.Timestamp getLstupdtmp() {
    return lstupdtmp;
  }

  public void setLstupdtmp(java.sql.Timestamp lstupdtmp) {
    this.lstupdtmp = lstupdtmp;
  }

  public String getLstupdby() {
    return lstupdby;
  }

  public void setLstupdby(String lstupdby) {
    this.lstupdby = lstupdby;
  }
}
