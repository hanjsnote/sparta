package chapter1.io;

import java.util.Scanner;

public class UserInfoPrinter {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        sc.nextLine();  //버퍼에 남아 있는 "\n" 제거

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.println("\n이름은 " + name + "이며 나이는 " + age + "입니다.");

    }
}
