package com.shctc.cloudproject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resource_info")
public class Resource_info {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "resourceid")
  private String resourceid;

  @Column(name = "resourcetp")
  private String resourcetp;

  @Column(name = "rssubtp")
  private String rssubtp;

  @Column(name = "price")
  private Double price;

  @Column(name = "unit")
  private String unit;

  @Column(name = "createtmp")
  private java.sql.Timestamp createtmp;

  @Column(name = "enddt")
  private java.sql.Timestamp enddt;

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

  public String getResourceid() {
    return resourceid;
  }

  public void setResourceid(String resourceid) {
    this.resourceid = resourceid;
  }

  public String getResourcetp() {
    return resourcetp;
  }

  public void setResourcetp(String resourcetp) {
    this.resourcetp = resourcetp;
  }

  public String getRssubtp() {
    return rssubtp;
  }

  public void setRssubtp(String rssubtp) {
    this.rssubtp = rssubtp;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
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
