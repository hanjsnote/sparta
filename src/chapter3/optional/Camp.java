package chapter3.optional;

import java.util.Optional;

public class Camp {
    //속성
    private Student student;

    //생성자

    //기능
    public Optional<Student> getStudent(){ //이 메서드를 호출할때 NPE이 발생하므로 student객체를 Optional로 감싼다
        return Optional.ofNullable(student); //student가 null이면 optional이 null을 감싸서 반환하고 값이 있으면 해당 데이터를 감싸서 반환한다.
//        return student;
    }

    public void setStudent(Student student){
        this.student = student;
    }

}
