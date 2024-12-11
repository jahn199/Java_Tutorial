package com.kh.practiceEx.arraypre.StringEx;

public class StringBuilderPre {
    /*
    Todo
    String str = "Welcome"
    1.작성된 객체를 StringBuilder sb로 변환해서 사용
    2.to Java 이어서 작성
    3. 8번째 자리에 the world of 글자 추가
    4. 4~11 come to 변경
    5. 20,25 삭제
    6. sb 뒤집기
     */
    public static void main(String[] args) {
        StringBuilderPre sbp = new StringBuilderPre();
        sbp.method1();
    }

    public void method1(){

        StringBuilder sb = new StringBuilder("Welcome");

        sb.append("to Java");
        System.out.println("이어쓰기 확인 : " + sb);

        sb.insert(8,"the world of");
        System.out.println("8번째 자리 글자 추가 확인 :" +sb);

        sb.replace(4,11,"come to");
        System.out.println("4~11 come to로 변경 : "+sb);

        sb.delete(20,25);
        System.out.println("20,25 삭제 확인 : "+sb);

        sb.reverse();
        System.out.println("뒤집기 확인 : "+ sb);
    }

}
