package com.example.quicklookapplication.Category;

public class Sale {
    private int id;
    private String productId;
    private String productQuantity;

    private String phoneNumber;


    private String productDate;

    public Sale(int id, String productId, String productQuantity, String productDate, String phoneNumber) {
        this.id = id;
        this.productId = productId;
        this.productQuantity = productQuantity;
        this.productDate = productDate;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }


    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
