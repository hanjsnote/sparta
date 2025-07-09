package chapter2.interfaceexample.v3;

public class Aircon implements PublicFunction{
    @Override
    public void turnOn() {
        System.out.println("에어컨을 킵니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("에어컨을 끕니다.");
    }
    public void powerUp(){
        System.out.println("온도를 올립니다.");
    }
    public void powerDown(){
        System.out.println("온도를 내립니다.");
    }
}
