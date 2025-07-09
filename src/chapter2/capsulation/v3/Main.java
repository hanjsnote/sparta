package chapter2.capsulation.v3;

class Person{
    private String secret;

    public Person(String secret){
        this.secret = secret;
    }

    public String getSecret(){
        return this.secret;     //객체의 secret 반환
    }
    public void setSecret(String secret){
        this.secret = secret;   //secret 속성 설정 및 변경
    }
}
public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("1234");
//        p1.secret;  //직접 접근 불가능
        String Secret = p1.getSecret();  //게터를 활용해 접근 가능
        System.out.println("비밀번호: " + Secret);

//        p1.secret; = "password"; //직접 접근 불가능
        p1.setSecret("1234567");  //세터를 활용해 접근 변경 가능
        String newSecret = p1.getSecret();
        System.out.println("바뀐 비밀번호: " + newSecret);
    }
}
