package chapter2.clazz;

//실습 과제
//자동차 클래스를 상상해서 만들어 보고 활용해 보세요
//요구사항
//    Car 클래스를 만든다.
//        속성 - 자동차의 속성을 저장할 변수를 만든다.
//        생성자 - 조립할 속성을 골라 객체화 시킨다.
//        기능 - 다양한 기능을 만들어보고 활용해본다.
//    ->drive() 주행기능
//    ->accelerate() 가속 기능
public class Car{
    private int speed;

    Car(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }

    public void drive(){
        if(this.speed <= 50){
            System.out.println("차가 천천히 출발합니다.");
        }
    }
    public void accelerate(){
        if(speed > 50){
            System.out.println("차가 가속합니다!");
        }
    }

}
