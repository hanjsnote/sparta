package chapter2.interfaceexample.v3;

public class Main {
    public static void main(String[] args) {

//        Tv tv = new Tv();
//        Aircon aircon = new Aircon();
//        Computer computer = new Computer();

//        tv.turnOn();
//        tv.turnOff();
//        tv.volumeUp();
//        tv.volumeDown();
//        aircon.turnOn();
//        aircon.turnOff();
//        aircon.powerUp();
//        aircon.powerDown();
//        computer.turnOn();
//        computer.turnOff();
//        computer.gameMode();
//        computer.gameModeOff();

        //중복 제거 배열을 사용하여 더 효율적인 관리
        PublicFunction[] devices = {
                new Tv(),
                new Aircon(),
                new Computer()
        };
        for(PublicFunction device : devices){
            device.turnOn();
            device.turnOff();
        }






    }
}
