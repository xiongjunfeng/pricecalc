package com.shctc.cloudproject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_item_info")
public class Order_item_info {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "ordernum")
  private String ordernum;

  @Column(name = "orderitemid")
  private String orderitemid;

  @Column(name = "resourceid")
  private String resourceid;

  @Column(name = "amount")
  private Long amount;

  @Column(name = "discount")
  private Double discount;

  @Column(name = "ordertp")
  private Long ordertp;

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

  public String getOrderitemid() {
    return orderitemid;
  }

  public void setOrderitemid(String orderitemid) {
    this.orderitemid = orderitemid;
  }

  public String getResourceid() {
    return resourceid;
  }

  public void setResourceid(String resourceid) {
    this.resourceid = resourceid;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public Long getOrdertp() {
    return ordertp;
  }

  public void setOrdertp(Long ordertp) {
    this.ordertp = ordertp;
  }

  public java.sql.Timestamp getFinishdt() {
    return finishdt;
  }

  public void setFinishdt(java.sql.Timestamp finishdt) {
    this.finishdt = finishdt;
  }
}
