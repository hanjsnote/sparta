package chapter2.fanalexample;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //final 활용 방법
        final int a = 1;
//        a = 2;
        System.out.println("a = " + a);

        //상수 활용 방법
        System.out.println("상수 활용: " + Circle.PI);

        //불변 객체 활용
        final Circle c1 = new Circle(2);
        //참조 변경은 막아주지만 내부 객체의 값은 막지 못한다. 그러므로 필드에 선언된 radius도 final로 선언해야 한다
//        c1 = new Circle(5);
//        c1.radius = 5;
        System.out.println("c1 = " + c1.radius);

        //불변 객체의 내부 상태가 변경이 필요한 경우
        Circle c2 = new Circle(10); //생성자를 이용해서 변경
        Circle c3 = c2.changeRadius(20);  //기능을 활용해서 변경

        System.out.println(c2.radius);
        System.out.println(c3.radius);

    }
}
