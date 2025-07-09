package chapter2.capsulation;

public class Person {

    //속성
    private String name;
    private String secret;

    //생성자
    public Person(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
