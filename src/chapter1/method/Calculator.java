package chapter1.method;

public class Calculator {

    //sum메서드
    int sum(int value1, int value2){
        int result = value1 + value2;
        return result;
    }

    void mul(int value1, int value2){
        int result = value1 * value2;
        System.out.println("결과는: " + result);
    }


}
