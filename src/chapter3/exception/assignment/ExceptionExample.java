package chapter3.exception.assignment;

public class ExceptionExample {

    String id;
    String password;

    public ExceptionExample(String id, String password) {
        this.id = id;
        this.password = password;
    }

    void loginException(String inputId, String inputPassword){
        try {
            if (!this.id.equals(inputId) && !this.password.equals(inputPassword)) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e){
            System.out.println("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");

        }
    }

}
