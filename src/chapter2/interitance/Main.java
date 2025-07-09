package chapter2.interitance;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();

        System.out.println("가문 이름: " + child.familyName);
        System.out.println("명예: " + child.honor);

        child.introduceFamily();
        child.superTest();//super를 통해 인스턴스 변수에 직접 접근해서 "Jim"대신 "스파르탄" 출력
        child.showSocialMedia();




    }
}
