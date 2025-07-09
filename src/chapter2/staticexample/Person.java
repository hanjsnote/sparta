package chapter2.staticexample;

public class Person {

    // 인스턴스 변수
    static String name;

    //static(클래스)변수
    static int population = 0;

    Person(){   //이 생성자가 호출될때마다 population을 1씩 증가시킨다.
        population++;
    }

    //인스턴스 메서드
    void printName(){
        System.out.println("나의 이름은 " + this.name + "입니다.");
    }

    //static(클래스)메서드
    static void printPopulation() {
        System.out.println("현재 인구 수: " + population);
    }

}
