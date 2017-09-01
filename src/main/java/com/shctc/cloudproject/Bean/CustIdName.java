package com.shctc.cloudproject.Bean;

public class CustIdName {
    private String custid;
    private String custname;

    public CustIdName(String custid, String custname) {
        this.custid = custid;
        this.custname = custname;
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
}
