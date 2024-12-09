package com.kh.practiceEx.arraypre.oopArrayPre;

import java.util.Scanner;

public class PersonService {
    public static void main(String[] args) {
        //Person 배열 생성
        Person[] people = new Person[4];

        Scanner sc = new Scanner(System.in);

        //Scanner 객체를 이용해서 사용자에게 키보드로 정보를 입력하고 배열 초기화

        //for문을 이용해서
        for (int i = 0; i < people.length; i++) {
            System.out.println(i + "번 째 이름을 입력하세요 : ");
            String name=sc.nextLine();
            System.out.println(i + "번 째 나이를 입력하세요 : ");
            int age = sc.nextInt();;
            sc.nextLine();
            people[i] = new Person(name, age);
        }
        System.out.println("\n모든 사람이 등록되었습니다.");
        //ㅇㅇ번째 사람의 이름을 입력하세요

        //ㅇㅇ번째 사람의 나이를 입력하세요 이름입력 입력한 내용이

        //Person 번째 객체 생성 및 배열에 저장

        //저장을 완료할 경우 for문을 탈출해서 모든 사람이 등록되었습니다 출력문 결과 출력
        /*
        //Person 배열의 각 값을 객체로 초기화
        people[0] = new Person("홍길동",20);
        people[1] = new Person("박길자",30);
        people[2] = new Person("오성순",40);
        people[3] = new Person("강하석",50);

        //각 배열의 값을 출력
        //일반 for문
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        //향상된 for문(for-each문)
        for (Person p : people) {
            System.out.println(p);
        }
        */
    }
}
