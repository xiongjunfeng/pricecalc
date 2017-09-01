package com.shctc.cloudproject.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
public class Order_info {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "ordernum")
  private String ordernum;

  @Column(name = "custid")
  private String custid;

  @Column(name = "loginid")
  private String loginid;

  @Column(name = "orderdt")
  private java.sql.Timestamp orderdt;

  @Column(name = "rsstartdt")
  private java.sql.Timestamp rsstartdt;

  @Column(name = "rsenddt")
  private java.sql.Timestamp rsenddt;

  @Column(name = "orderduration")
  private Long orderduration;

  @Column(name = "price")
  private Double price;

  @Column(name = "discount")
  private Double discount;

  @Column(name = "finishdt")
  private java.sql.Timestamp finishdt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getOrdernum() {
    return ordernum;
  }

  public void setOrdernum(String ordernum) {
    this.ordernum = ordernum;
  }

  public String getCustid() {
    return custid;
  }

  public void setCustid(String custid) {
    this.custid = custid;
  }

  public String getLoginid() {
    return loginid;
  }

  public void setLoginid(String loginid) {
    this.loginid = loginid;
  }

  public java.sql.Timestamp getOrderdt() {
    return orderdt;
  }

  public void setOrderdt(java.sql.Timestamp orderdt) {
    this.orderdt = orderdt;
  }

  public java.sql.Timestamp getRsstartdt() {
    return rsstartdt;
  }

  public void setRsstartdt(java.sql.Timestamp rsstartdt) {
    this.rsstartdt = rsstartdt;
  }

  public java.sql.Timestamp getRsenddt() {
    return rsenddt;
  }

  public void setRsenddt(java.sql.Timestamp rsenddt) {
    this.rsenddt = rsenddt;
  }

  public Long getOrderduration() {
    return orderduration;
  }

  public void setOrderduration(Long orderduration) {
    this.orderduration = orderduration;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public java.sql.Timestamp getFinishdt() {
    return finishdt;
  }

  public void setFinishdt(java.sql.Timestamp finishdt) {
    this.finishdt = finishdt;
  }
}
