package com.kh.practiceEx.arraypre.oopArrayPre;

public class Product {
    private String name;
    private int price;
    private String description;
    private String category;

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //setter의 경우 저장
    //선택적으로 상품설명과 카테고리는 선택사항으로 저장유무 결정


    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //getter의 경우 매개변수생성자(파라미터생성자)나
    //setter로 가져온 정보 반환


    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "제품명=" + name + "\n제품가격=" + price + "\n제품설명=" + description
                + "\n카테고리='" + category;
    }
}
