package chapter2.capsulation.v2;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();

        //무분별한 setter
//        robot.setLeftLeg(true);
//        robot.setLeftLeg(true);
//        robot.setLeftArm(true);
//        robot.setRightArm(true);

        //의미 있는 setter
        robot.walk(true);


    }
}
