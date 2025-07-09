package chapter2.interitance;

public class Child extends Parent{

    public String familyName = "Jim";

    public Child(){
        super();
        System.out.println("자식 생성자");
    }

    public void superTest(){
        System.out.println(super.familyName);
    }

    public void showSocialMedia(){
        System.out.println("SNS에서 소개드립니다.");
    }

    @Override
    public void introduceFamily(){
        System.out.println("우리 " + this.familyName + "가문은 대대로 스파르타 집안이다!");
    }

}
