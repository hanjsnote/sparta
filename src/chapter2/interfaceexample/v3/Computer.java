package chapter2.interfaceexample.v3;

public class Computer implements PublicFunction{
    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 킵니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끕니다.");
    }
    public void gameMode(){
        System.out.println("게임모드로 바꿉니다.");
    }
    public void gameModeOff(){
        System.out.println("게임모드를 끕니다.");
    }
}
