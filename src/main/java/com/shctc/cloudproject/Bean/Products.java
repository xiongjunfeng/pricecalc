package com.shctc.cloudproject.Bean;

public class Products {
    private String resourcetp;
    private String rssubtp;
    private Double price;
    private String unit;

    public Products(String resourcetp, String rssubtp, Double price, String unit) {
        this.resourcetp = resourcetp;
        this.rssubtp = rssubtp;
        this.price = price;
        this.unit = unit;
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
}
