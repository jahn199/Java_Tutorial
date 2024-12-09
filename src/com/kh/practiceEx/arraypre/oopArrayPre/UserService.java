package com.kh.practiceEx.arraypre.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void setSaveAllUser() {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("사용자를 등록합니다.");
        System.out.print("이름을 입력하세요.(2자이상 5자 이하 작성가능) : ");

        String inputName = sc.nextLine();
        if(inputName != null && inputName.length() < 6 && inputName.length() >= 2) {        // username 빈칸이거나 6글자 이상 저장 x return 시키기
            u.setUsername(inputName); // String 변수명 = u.setUserName 형식으로 변수명에 저장 불가
            System.out.println(" [ "+ u.getUsername() + " ] 저장되었습니다.");
        } else {
            System.out.println("이름은 빈 칸이거나 1글자 미만 6글자 이상 작성할 수 없습니다.");
            return; //이메일,  나이 작성 못하게 돌려보내기
        }

        // 나이를 입력하세요 ( 0 ~ 100 입력가능) 아무값도 입력이 안됐을 때 생기는
        // 예외 처리 빈칸으로 입력 할 수 없습니다.

        System.out.print("나이를 입력하세요(1세 ~ 99세 작성가능 : )");
        int inputAge = sc.nextInt();
        sc.nextLine();
        try {
            if(inputAge > 0 && inputAge < 100) {  // 나이는 0세 초과 100세 미만 으로 작성하고 초과면 나이는 1이상 100미만으로 작성 가능합니다.
                u.setAge(inputAge);           // int 변수명 = u.setAge 형식으로 변수명에 저장 불가
                System.out.println(" [ "+ u.getAge() + " ] 저장되었습니다.");
            } else {
                System.out.println("나이는 1이상 100미만으로 작성 가능합니다.");
                return; //이메일 작성 못하게 돌려보내기
            }
        } catch (Exception e) {
            System.out.println("나이는 숫자만 입력 가능합니다.");
            return;
        }

        // 8글자 이상 30글자 미만 이메일을 입력하세요
        System.out.print("이메일을 입력하세요. : ");
        String inputEmail = sc.nextLine();
        if(inputEmail != null && inputEmail.length() < 30 && inputEmail.length() >= 2) {
            u.setEmail(inputEmail);  // String 변수명 = u.setEmail 형식으로 변수명에 저장 불가
            System.out.println(" [ "+ u.getEmail() + " ] 저장되었습니다.");
        } else {
            System.out.println("이메일은 빈 칸이거나 30글자 이상 작성할 수 없습니다.");
            return; //저장 못하게 돌려보내기
        }
        // set으로 저장된 값은 변수명에 넣어주는 것이 아니라 get으로 정보 반환할 수 있음

        System.out.println("------------- 저장된 사용자 정보 -------------");
        // ArrayList 이용해서 정보 저장하고
        // toString 을이용해서 저장된 사용자 정보 가져오기
        ArrayList<User> users = new ArrayList<User>();
        users.add(u);

        for (User u1 : users) {
            System.out.println(u1);
        }
    }

    public void paramNameEmail() {
        Scanner sc = new Scanner(System.in);
        User u1 = new User();

        System.out.print("나이를 입력하시겠습니까?(yes or no: ");
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes")) {
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();
            sc.nextLine();
            if(age >=1 && age < 100){
                u1.setAge(age);
                System.out.println("나이가 성공적으로 저장되었습니다.");
            }
        }

    }
}