public class PromotionEx {

  public static void main(String[] args) {

//    자동 타입 변환 : 자바 프로그램에서 작은 타입의 데이터를 큰 타입의 변수에 저장하는 것, 자동으로 타입이 변환 됨
//    자바에서 연산 시 정수는 자동으로 int 타입으로 변환되어 연산됨
    
//    byte 타입의 변수 bValue 에 정수 10 저장
    byte bValue = 10;
//    int 타입의 변수 iValue 에 byte 타입의 변수 bValue 를 저장
    int iValue = bValue;
    System.out.println("iValue : " + iValue);

//    char 타입의 변수 cValue 에 문자 '가' 저장
    char cValue = '가';
//    int 타입의 변수 iValue 에 char 타입의 변수 cValue 를 저장
    iValue = cValue;
    System.out.println("가의 유니코드 : " + iValue);

//    int 타입의 변수 iValue 에 정수 500 저장
    iValue = 500;
//    long 타입의 변수 lValue 에 int 타입의 변수 iValue 를 저장
    long lValue = iValue;
    System.out.println("lValue : " + lValue);

//    int 타입의 변수 iValue 에 정수 200 저장
    iValue = 200;
//    double 타입의 변수 dValue 에 int 타입의 변수 iValue 를 저장
    double dValue = iValue;
    System.out.println("dValue : " + dValue);
  }
}















