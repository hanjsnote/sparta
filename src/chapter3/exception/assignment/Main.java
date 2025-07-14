package chapter3.exception.assignment;

import java.util.Scanner;
//사용자로부터 아이디와 비밀번호를 입력받습니다.
//아이디가 "admin", 비밀번호가 "1234"가 아니면 로그인 실패 예외를 발생
//로그인 실패시 "로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다" 출력 후 다시 입력을 받습니다.
public class Main {

    public static void main(String[] args) {

        ExceptionExample ex = new ExceptionExample("admin", "1234");
        Scanner sc = new Scanner(System.in);


        while(true) {
            System.out.print("ID를 입력해주세요: ");
            String inputId = sc.nextLine();

            System.out.print("비밀번호를 입력해주세여: ");
            String inputPassword = sc.nextLine();

            if(inputId.equals(ex.id)){
                break;
            } else {
                ex.loginException(inputId, inputPassword);
            }
        }
        System.out.println("로그인 성공!");
    }
}
