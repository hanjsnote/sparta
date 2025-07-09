package chapter1.condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //조건문
        //if
        String light = "노란불";

        if(light.equals("초록불")){
            System.out.println("건너세요!");
        } else if(light.equals("빨간불")){
            System.out.println("멈추세요!");
        } else {
            System.out.println("무슨 불이지?");
        }
        System.out.println("...");

        //switch문
        int number = 3;
        switch(number){
            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
            default:
                System.out.println("1도 아니고 2도 아닙니다.");

        }
    //실습 과제
        //1. 신호등 색상을 입력하면 프로그램이 올바른 안내 메시지를 출력하도록 만드세요!
        String green = "초록불", red = "빨간불", yellow = "노란불", blue = "파란불";
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
            String input = sc.nextLine();
            if(input.equals("초록불")){
                System.out.println("건너세요!");
            } else if(input.equals("노란불")){
                System.out.println("주의하세요!");
            } else if(input.equals("빨간불")){
                System.out.println("멈추세요!");
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }







    }
}
