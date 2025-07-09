package chapter2.wrapper;
//실습 과제 double 기본형과 직접 만든 MyDouble 래퍼형의 연산 성능차이 확인하기

class CustomerDouble{
    //속성
    public double cusDouble;
    //생성자
    CustomerDouble(double cusDouble) {
        this.cusDouble = cusDouble;
    }
    //기능
    @Override
    public String toString(){
        return String.valueOf(cusDouble);
    }
}


public class DoubleWrapperPerformance {
    public static void main(String[] args) {

        CustomerDouble cus = new CustomerDouble(10000.123);
        System.out.println(cus.cusDouble);

        double basicDouble = 10000.123;

        //기본형 연산 테스트
        long startTime1 = System.nanoTime();
        double double1 = 0;
        for(int i = 0; i < basicDouble; i++) {
            double1 += i;
        }
        long endTime1 = System.nanoTime();
        long basicTime = endTime1 - startTime1;

        //래퍼형 연산 테스트
        long startTime2 = System.nanoTime();
        Double double2 = 0.0;
        for(int i = 0; i < cus.cusDouble; i++){
            double2 += i;
        }
        long endTime2 = System.nanoTime();
        long wrapperTime = endTime2 - startTime2;

        System.out.println("basicTime = " + basicTime + ", wrapperTime = " + wrapperTime + ", 성능 차이는 " + (wrapperTime / basicTime) + "배이다.");

    }
}
