package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        //객체 생성(인스턴스화)
        //--- personA ---
        // - name = "gygim";
        // - age = 20;
        // - address = XXXX;
        Person personA = new Person("gygim", 20, "뉴욕");
        Person personB = new Person("Steve", 15, "파리");
        System.out.println("name: " + personA.name + ", age:" + personA.age);
        System.out.println("name: " + personB.name + ", age:" + personB.age);
        //속성에 직접 접근
//        System.out.println("설정전 personA 이름: " + personA.name);
//        System.out.println("설정전 personB 이름: " + personB.name);
//        personA.name = "gygim";
//        personB.name = "Steve";
//        System.out.println("설정전 personA 이름: " + personA.name);
//        System.out.println("설정전 personB 이름: " + personB.name);

//        기능 활용
        //getter 활용
        String name = personA.getName();
        System.out.println("name: " + name);
        //setter활용
        System.out.println(personA.getName() + "의 주소 :" + personA.address);
        personA.setAddress("서울");
        System.out.println(personA.name + "의 주소 :" + personA.address);
        System.out.println(personB.getName() + "의 주소 :" + personB.address);


        Car car = new Car(100);
        car.drive();
        car.accelerate();

    }


}
