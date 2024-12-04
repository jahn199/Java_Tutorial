package com.kh.practice.todolist;

import java.io.*;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = System.getProperty("user.home") + "/Desktop/";
        String FILE_NAME = "";
        String EXT_NAME = "";


        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요: ");
        String firstChoice = scanner.nextLine();


        switch (firstChoice) {
            case "1":
                System.out.print("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                break;
            case "2":
                System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                System.out.println("새로운 파일이 생성됩니다: " + FILE_NAME + EXT_NAME);
                break;
            default:
                System.out.println("잘못된 선택입니다. 기본 파일로 시작합니다: " + FILE_NAME + EXT_NAME);
        }


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("\n==== To-Do 리스트 ====");
            System.out.println("1. 할 일 목록 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 종료");
            System.out.print("옵션을 선택하세요: ");
            String choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    System.out.print("확인할 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                    String fileName = scanner.nextLine() + EXT_NAME;
                    File fileCheck = new File(path + fileName);
                    if (fileCheck.exists()) {
                        try (BufferedReader reader = new BufferedReader(new FileReader(fileCheck))) {
                            String line;
                            System.out.println("--- " + fileName + " ---");
                            while ((line = reader.readLine()) != null) {
                                System.out.println("- " + line);
                            }
                        } catch (IOException e) {
                            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
                        }
                    } else {
                        System.out.println("파일을 찾을 수 없습니다: " + fileName + ". 새로운 파일을 생성하거나 확인하세요.");
                    }
                    break;
                case "2":
                    System.out.print("새로운 할 일을 입력하세요: ");
                    String newTask = scanner.nextLine();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + FILE_NAME, true))) {
                        writer.write(newTask);
                        writer.newLine();
                        System.out.println("할 일이 추가되었습니다: " + FILE_NAME);
                    } catch (IOException e) {
                        System.out.println("파일을 저장하는 중 오류가 발생했습니다.");
                    }
                    break;
                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    isTrue = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    break;
            }
        }
    }
}