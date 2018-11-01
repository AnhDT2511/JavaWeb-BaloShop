/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Shado
 */
public class Order {

    private int id;
    private int accountId;
    private String date;
    private double totalPrice;
    private String note;
    private String address;

    public Order(int accountId, double totalPrice, String note, String address) {
        this.accountId = accountId;
        this.totalPrice = totalPrice;
        this.note = note;
        this.address = address;
    }

    public Order(int id, int accountId, String date, double totalPrice, String note, String address) {
        this.id = id;
        this.accountId = accountId;
        this.date = date;
        this.totalPrice = totalPrice;
        this.note = note;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
