package com.jusutech.easyshopugserver.Model;

import android.app.AlertDialog;

/**
 * Created by Junior Joseph on 1/16/2019.
 */

public class Order {
    private String OrderID;
    private String OrderName;
    private String Quantity;
    private String Price;
    private String Discount;
    private String Status;
    private String Address;
    private String Phone;

    public Order() {
    }

    public Order(String orderID, String orderName, String quantity, String price, String discount,String status, String address, String phone) {
        OrderID = orderID;
        OrderName = orderName;
        Quantity = quantity;
        Price = price;
        Discount = discount;
        Status = status;
        Address = address;
        Phone = phone;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        OrderName = orderName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
