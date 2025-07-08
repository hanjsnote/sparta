package chapter2.clazz;

public class Person {

    //1. 속성 - 변수 선언으로 표현할 수 있습니다.
    String name;
    int age;
    String address;

    //2. 생성자 - 조립설명서
    //Person(){} Object클래스에 의한 기본생성자
    //생성자의 특징:
    //1. 클래스와 이름이 같다.
    //2. 반환 타입이 존재하지 않다.
    //3. 여러개가 존재할 수 있다.
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //getter
    String getName(){
        return this.name;
    }
    //setter
    void setAddress(String address){
        this.address = address;
    }
}



