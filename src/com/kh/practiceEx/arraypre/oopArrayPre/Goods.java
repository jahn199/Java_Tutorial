package com.kh.practiceEx.arraypre.oopArrayPre;

public class Goods {

    //상품번호 이름 가격 수량
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Goods() {
    }

    public Goods(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  "상품번호=" + id +
                "\n 상품이름='" + name +
                "\n 상품가격=" + price +
                "\n 상품수량=" + quantity;
    }
}
