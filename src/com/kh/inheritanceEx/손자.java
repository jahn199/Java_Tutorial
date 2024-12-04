package com.kh.inheritanceEx;

public class 손자 extends 부모 {
    //필드
    private String 장난감;

    public 손자 (){

    }

    public 손자(String 성씨, int money, String car, String 장난감) {
        super(성씨, money, car);
        this.장난감 = 장난감;
    }

    public String get장난감() {
        return 장난감;
    }

    public void set장난감(String 장난감) {
        this.장난감 = 장난감;
    }

    @Override
    public String toString() {
        return "손자{" +
                "장난감='" + 장난감 + '\'' +
                ", 성씨='" + 성씨 + '\'' +
                '}';
    }
}
