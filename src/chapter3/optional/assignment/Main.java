package chapter3.optional.assignment;

import java.util.*;
//수강생의 이름을 입력받고 해당 이름이 캠프에 등록되어 있는지 확인하는 프로그램을 만드세요.
//Student , CampService , Main 클래스를 활용하세요.
//캠프에는 3 명의 학생이 존재합니다. Spartan, Steve, John
//private static Student[] students = {
//        new Student("Spartan"),
//        new Student("Steve"),
//        new Student("John")
//};
//Optional.ofNullable() 로 Optional 객체를 만드세요.
//isPresent() 로 Optional 에 값이 있는지 확인하세요.
//get() 으로 안전하게 데이터를 꺼내오세요.
public class Main {
    public static void main(String[] args) {

        CampService camp = new CampService();

        Scanner scanner = new Scanner(System.in);
        System.out.print("수강생의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        Optional<Student> studentOptional = camp.findStudentByName(name);
        if(studentOptional.isPresent()){
            Student student = studentOptional.get();
            System.out.println("캠프에 " + student.getName() + "수강생이 있습니다.");
        } else {
            System.out.println("해당 수강생은 캠프에 존재하지 않습니다.");
        }


//        for (Student s : camp.getStudent()){
//            if(input.equals(s.getName())){
//                System.out.println("해당 학생이 존재합니다.");
//            } else {
//                System.out.println("해당 학생이 존재 하지 않습니다.");
//            }
//        }


    }
}
