package com.shctc.cloudproject.Bean;

import com.shctc.cloudproject.Entity.Order_item_info;

import java.util.List;

public class OrderWithItems {
    private String ordernum;
    private String custid;
    private String loginid;
    private Long orderduration;
    private Double price;
    private List<Order_item_info> orderiteminfolist;

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

    public List<Order_item_info> getOrderiteminfolist() {
        return orderiteminfolist;
    }

    public void setOrderiteminfolist(List<Order_item_info> orderiteminfolist) {
        this.orderiteminfolist = orderiteminfolist;
    }
}
