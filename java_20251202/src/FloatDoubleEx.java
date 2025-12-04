public class FloatDoubleEx {

  public static void main(String[] args) {

//    double 타입 : 소수점이 있는 숫자인 실수를 표현하는 데이터 타입
//    double 이 실수의 기본 데이터 타입
//    접미사로 D 를 사용(기본 타입이기 때문에 접미사 생략 가능)
    double val1 = 3.14;
    
//    실수의 기본 타입은 double 임, float 타입에 double 타입의 데이터를 저장하려고 하기 때문에 오류 발생
//    float val2 = 3.14;
//    float 타입 : 소수점이 있는 숫자인 실수를 표현하는 데이터 타입
//    접미사로 F 를 사용 (대소문자 상관없음)
    float val3 = 3.14F;

//    정확도 확인
    double val4 = 0.12345678901234567890;
    float val5 = 0.12345678901234567890F;

    System.out.println("val1 : " + val1);
    System.out.println("val3 : " + val3);
    System.out.println("val4 : " + val4);
    System.out.println("val5 : " + val5);

//    지수 표현
    int val6 = 3000000;
    double val7 = 3e6;
    float val8 = 3e6F;
    double val9 = 3e-3;

    System.out.println("val6 : " + val6);
    System.out.println("val7 : " + val7);
    System.out.println("val8 : " + val8);
    System.out.println("val9 : " + val9);
  }
}















