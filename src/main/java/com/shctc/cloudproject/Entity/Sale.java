package com.shctc.cloudproject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lepdou 2017-06-18
 */
@Entity
@Table(name = "sale")
public class Sale {

  @Id
  @GeneratedValue
  @Column(name = "Id")
  private int id;

  @Column(name = "house")
  private String house;

  @Column(name = "price")
  private int price;

  @Column(name = "create_date")
  private String createDate;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  @Override
  public String toString() {
    return "Sale{" +
           "id=" + id +
           ", house='" + house + '\'' +
           ", price=" + price +
           ", createDate=" + createDate +
           '}';
  }
}
