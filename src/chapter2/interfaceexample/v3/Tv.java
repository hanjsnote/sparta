package chapter2.interfaceexample.v3;

public class Tv implements PublicFunction {
    @Override
    public void turnOn() {
        System.out.println("Tv를 킵니다");
    }
    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다.");
    }
    public void volumeUp(){
        System.out.println("볼륨을 올립니다.");
    }
    public void volumeDown(){
        System.out.println("볼륨을 내립니다.");
    }
}
