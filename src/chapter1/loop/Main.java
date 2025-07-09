package chapter1.loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //로봇한테 10번 인사 반복 시키기
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");
//        System.out.println("안녕하세요!");

        //for문
//        int customers = 5;
//        for(int i = 1; i <= customers; i++){
//            if(i == 4){
//                break;
//            }
//            if(i == 2){
//                continue;
//            }
//            System.out.println(i + "번째 손님, 안녕하세요!");
//        }

        //while문
        int i = 1, j = 1;
        while(i <= 3){
            System.out.println("안녕하세요!");
            i++;
        }
        //do while문
        do{
            System.out.println("안녕하세요");
            j++;
        }while(j <= 3);


        //실습 과제
        //1. 입력한 숫자의 구구단 출력하기
        //사용자로부터 2~9 사이의 숫자를 입력받아 해당 숫자의 구구단을 출력하세요 사용자가 3을 입력하면 3단을 출력해야 합니다.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("출력할 구구단 단수를 입력하세요(2~9): ");
//        int input = sc.nextInt();
//        if(input >= 2 && input <= 9){
//            for(int a = 1; a <= 9; a++){
//                System.out.println(input + " X " + a + " = " + (input * a));
//            }
//        }

        //2. 2단부터 9단까지 구구단을 출력하는 프로그램

        for(int x = 2; x <= 9; x++){
            System.out.println("\n==== " + x + "단 ====");
            for(int y =  1; y <= 9; y++){
                System.out.println(x + " X " + y + " = " + (x * y));
            }
        }





    }
}
