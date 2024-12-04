package com.kh.practiceTotal;

public class 과제2 {
    public void names() {
        String[] names = {"Alice", "Bob", "Andrew", "Eve"};

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name + "");
            }
        }
    }
}
