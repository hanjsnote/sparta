package chapter2.interfaceexample.v1;

import chapter1.operater.main;

class Animals implements Flyable, Animal{
    @Override
    public void eat() {
        System.out.println("냠냠 먹습니다.");
    }
    @Override
    public void fly() {
        System.out.println("훨훨 날아다닙니다.");
    }
}
class Animals1 implements FlyableAnimal {
    @Override
    public void land() {
        System.out.println("새가 착륙합니다.");
    }
    @Override
    public void eat() {
        System.out.println("새가 모이를 먹습니다.");
    }
    @Override
    public void fly() {
        System.out.println("새가 훨훨 날아다닙니다.");
    }
}
public class Bird{
    public static void main(String[] args) {

        Animals a = new Animals();
        a.eat();
        a.fly();

        Animals1 b = new Animals1();
        b.land();
        b.eat();
        b.fly();
    }
}
