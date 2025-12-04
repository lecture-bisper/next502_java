public class LongEx {

  public static void main(String[] args) {

//    long 타입 : int 타입의 최대값보다 더 큰 숫자를 사용하기 위한 정수 데이터 타입
//    입력할 정수 뒤에 접미사 L(대소문자 상관없음, 대문자 L 을 추천)을 붙여야 함

    // long 타입의 변수 val1 에 정수 10 을 저장, 접미사 L을 붙이지 않기 때문에 기본 정수 타입인 int 타입의 정수 10 이 저장
    long val1 = 10;
    // long 타입의 변수 val2 에 정수 20 을 저장, 접미사 L을 붙이기 때문에 long 타입의 정수 20 이 저장
    long val2 = 20L;
//    long 타입의 숫자는 하나의 숫자를 저장할 때 8byte 를 사용
//    int 타입의 변수에 long 타입의 숫자를 저장 시 오류 발생
//    int intNum = 20L;
    
//    long 타입의 변수 val3 에 int 타입의 정수 10000000000 을 저장
//    int 타입의 정수는 -21억 ~ 21억 까지 표현 가능한데, 10000000000 은 int 타입의 최대 표현 크기인 21억은 넘어서기 때문에 표현이 불가능
//    long val3 = 10000000000;
//    long 타입의 변수 val4에 long 타입의 정수 10000000000 을 저장, 문제없음
    long val4 = 10000000000L;

    System.out.println("val1 : " + val1);
    System.out.println("val2 : " + val2);
    System.out.println("val4 : " + val4);
  }
}















