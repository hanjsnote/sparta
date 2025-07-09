package chapter2.interfaceexample;

public class LuxuryCar implements Car{
    @Override
    public void drive() {
        System.out.println("멋지게 이동합니다.");
    }

    @Override
    public void stop() {
        System.out.println("멋지게 정지합니다.");
    }
    //전기차로써 charge기능 추가
    void charge(){
        System.out.println("차량을 충전합니다.");
    }


//    void move() {
//        System.out.println("멋지게 이동합니다.");
//    }
//
//    void stop(){
//        System.out.println("멋지게 정지합니다.");
//    }



}
