package com.example.farmersmarket;

public class CatagoryModel {
    private String CatagoryIconLink;
    private String CatagoryName;

    public CatagoryModel(String catagoryIconLink, String catagoryName) {
        CatagoryIconLink = catagoryIconLink;
        CatagoryName = catagoryName;
    }

    public String getCatagoryIconLink() {
        return CatagoryIconLink;
    }

    public void setCatagoryIconLink(String catagoryIconLink) {
        CatagoryIconLink = catagoryIconLink;
    }

    public String getCatagoryName() {
        return CatagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        CatagoryName = catagoryName;
    }
}
