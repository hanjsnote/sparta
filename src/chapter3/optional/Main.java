package chapter3.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Camp camp = new Camp(); //Camp객체 생성 -> 내부에 student 필드는 null로 초기화(기본값)

        //Optional 객체 활용
        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent(); //isPresent는 반환타입이 boolean이며 studentOptional객체 안에 데이터가 들어있는지 또는 null인지 확인해주는 기능

        if(flag){
            Student student = studentOptional.get();//get는 안에 감싸고 있는 데이터를 반환한다.
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생 데이터가 없습니다.");
        }


        //1.student = null
//        Student student = camp.getStudent(); //getStudent()는 단순히 this.student를 리턴
//        System.out.println("student = " + student); //그런데 아직 setStudent()로 아무것도 안 넣었으니 null 리턴

        //직접적인 null 처리 방법
//        String studentName;
//        if(student != null){
//            studentName = student.getName();
//        } else {
//            studentName = "등록된 학생이 아닙니다.";
//        }
//        System.out.println("studentName: " + studentName);


        //2.NullPointerException
//        String studentName = student.getName(); //student는 현재 null인데 getName()을 호출하고 있다 null은 객체가 아니기 때문에 거기서 메서드 호출하면 JVM이 죽는다(NPE)
//        System.out.println("studentName = " + studentName);


    }

}

