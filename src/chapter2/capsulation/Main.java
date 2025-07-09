package chapter2.capsulation;

public class Main {

    public static void main(String[] args) {
        //생성자 호출
        Person person = new Person("gygim");
//        person.name = ""; //생성 시점에 한번 설정하면 바꿀수 없다

        //인스턴스 변수 접근
//        person.name = "gygim";
//        person.secret = "??";

        //인스턴스 메서드 접근
//        person.methodA();
//        person.methodB();

        //게터(getter)
        String name = person.getName();
        System.out.println("이름: " + name);

        //세터(setter)
        person.setName("sam");
        String name2 = person.getName();
        System.out.println("바뀐 이름: " + name2);

    }
}
