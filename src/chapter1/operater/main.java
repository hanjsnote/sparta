package chapter1.operater;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 기본적인 사칙 연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);
        //나눗셈
        double div = a / b;
        System.out.println("div = " + div);

        double div2 = a / (double)b;
        System.out.println("div2 = " + div2);

        //모듈러 연산(나머지 연산)
        int mod = 10 % 3;
        System.out.println("mod = " + mod);

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);

        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3);
        
        //시간 연산
        int mod4 = (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);
        
        //짝수 홀수 연산
        int mod5 = 6 % 2;
        System.out.println("mod5 = " + mod5);
        
        int mod6 = 7 % 2;
        System.out.println("mod6 = " + mod6);
        
        //대입 연산자
        int num = 5;
        //복합 대입 연산자
        num += 3;   //num = num + 3;
        System.out.println("num = " + num);

        num -= 2;   //num = num - 2;
        System.out.println("num = " + num);

        num *= 2;   //num = num * 2;
        System.out.println("num = " + num);

        num /= 3;   //num = num / 3;
        System.out.println("num = " + num);

        num %= 3;   //num = num % 3;
        System.out.println("num = " + num);

        //증감 연산자
        num = 1;
        num++;
        num++;
        num--;
        num--;
        System.out.println("num = " + num);

        //전위 연산 (++i) 연산 후 값이 활용된다
        int intbox = 5;
        System.out.println("(++intbox) = " + (++intbox));

        //후위 연산
        int intbox2 = 5;
        System.out.println("(intbox2++) = " + (intbox2++));
        System.out.println("intbox2 = " + intbox2);



        //전위 후위 연산자 비교
        int i = 0, j = 0, k = 0, l = 0;
        while(i < 3){
            System.out.println("i = " + i); //0, 1, 2
            i++;
        }
        while(j < 3){
            System.out.println("j = " + j); //0, 1, 2
            ++j;
        }
        while(k < 3){
            System.out.println("k = " + (k++)); //0, 1, 2
        }
        while(l < 3){
            System.out.println("l = " + (++l)); //1, 2, 3
        }

        //비교 연산자
        //같음 연산자(=) 같으면 true, 다르면 false
        System.out.println("10 == 10: " + (10 == 10));

        //다름 연산자(!=) 다르면 true, 같으면 false
        System.out.println("10 != 5: " + (10 != 5));

        //크기 비교 연산자
        System.out.println("10 < 5: " + (10 < 5));  //false
        System.out.println("10 >= 10: " + (10 >= 10)); //true
        System.out.println("10 <= 5: " + (10 <= 5)); //false

        //논리 연산자
        //AND 연산(&&) - 두 조건이 모두 참일때 true 반환
        System.out.println("true && ture: " + (true && false));  //flase
        int age = 20;
        boolean isStudent = true;
        System.out.println(":::" + ((age > 18) && isStudent));

        //OR 연산(||) - 두 조건중에 하나라도 참이면 true
        System.out.println("false || true: " + (false || true));    //true

        //NOT 연산자(!) - true -> false, false -> true
        System.out.println("!true: " + (!true));

        //연산자 우선순위
        boolean flag = ((10 + 5) > 12) && true;
        System.out.println(flag);
        //실행 순서: (10 + 5) > 12 && true : 산술
        //-> 15 > 12 && true : 비교
        //-> true && true : 논리
        //-> flag = true 대입

        //논리 연산자 우선순위(! -> && -> ||)
        boolean result = true || false && false;
        System.out.println("result = " + result);   //true

        boolean result2 = true || false && false;
        System.out.println("result2 = " + result2); //true

        System.out.println(10 / 2 + 3 * 2 > 10 || false);
        //실행 순서: ((10 / 2) + (3 * 2)) > 10 || false
        //-> (5 + 6) > 10 || false
        //-> 11 > 10 || false
        //-> true || false
        //-> true

        System.out.println(5 + 3 > 2 * 4 && 10 % 3 == 1);
        //실행 순서: (5 + 3) > (2 * 4) && (10 % 3) == 1
        //-> 8 > 8 && 1 == 1
        //-> false && true
        //-> false

        //문자열 비교(equals()를 사용한다)
        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = new String("Hello");
        System.out.println("text1과 == text2가 같은가? " + (text1 == text2 && text2 == text3));
        System.out.println("text1과 .equals(text2)가 같은가? " + ((text1.equals(text2)) && (text1.equals(text3))));
        System.out.println(System.identityHashCode(text1));
        System.out.println(System.identityHashCode(text2));


        //과제1 두개의 정수 x와 y가 주어졌을 때 두 수의 합, 차, 곱, 나누기 결과를 변수에 저장하는 프로그램 작성(%모듈러도 연산에 포함)
        int x = 7, y = 3;

        //1. 더하기
        System.out.println("더하기: " + (x + y));
        //2. 빼기
        System.out.println("빼기: " + (x - y));
        //3. 곱하기
        System.out.println("곱하기: " + (x * y));
        //4. 나누기
        System.out.println("나누기: " + (x / y));
        //5. 나머지
        System.out.println("나머지: " + (x % y));

        //과제2 두 개의 정수 x와 y가 주어졌을 때 x가 y보다 큰지 (>), x가 y보다 작은지 (<)
        //x와 y가 같은지 (==), x와 y가 다르면 (!=)각각의 결과를 출력하는 프로그램을 작성하세요.
        System.out.println("x가 y보다 큰가? " + (x > y));
        System.out.println("x가 y보다 작은가? " + (x < y));
        System.out.println("x와 y는 같은가? " + (x == y));
        System.out.println("x와 y는 다른가? " + (x != y));

        //과제3 입력한 두 개의 문자열 str1과 str2를 입력받아서 비교한 결과를 result에 담아서 출력하세요
        Scanner sc = new Scanner(System.in);




    }

}
