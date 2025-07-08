package chapter1.method;

public class Main {
    public static void main(String[] args) {
        //1. 객체를 객체화(소환)
        Calculator calculator = new Calculator();

        //1. sum 메서드(함수)를 호출
        int result = calculator.sum(10, 20);
        System.out.println(result);

        calculator.mul(2, 3);

        int a = 5;
        int b = ++a + a++;
        System.out.println(b);


    }
}
