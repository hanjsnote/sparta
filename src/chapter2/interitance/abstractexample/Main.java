package chapter2.interitance.abstractexample;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal() {} //추상클래스는 객체를 생성할 수 없다.
        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();
        //자식에서 강제 구현된 메서드
        cat.eat();



    }
}
