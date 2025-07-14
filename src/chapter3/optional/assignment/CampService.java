package chapter3.optional.assignment;

import java.util.Optional;

public class CampService {
    //속성
    private static Student[] students = {
            new Student("Spartan"),
            new Student("Steve"),
            new Student("John")
    };

    public Optional<Student> findStudentByName(String name){
        for(Student student : students){
            String studentName = student.getName();
            if(studentName.equals(name)){
                return Optional.ofNullable(student);
            }
        }
        return Optional.ofNullable(null);
    }

}
