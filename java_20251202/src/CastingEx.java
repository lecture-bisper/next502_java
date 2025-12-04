public class CastingEx {

  public static void main(String[] args) {

//    강제 타입 변환 : 큰 데이터 타입의 데이터를 작은 데이터 타입의 변수에 강제로 저장하는 것
//    강제 타입 변환 시 데이터의 유실이 발생함
//    실제로 강제 타입 변환을 할 것인지 컴파일러에게 알려줘야 함
//    사용법 : 작은타입 변수명 = (작은타입)큰타입데이터;
    
//    int 타입의 변수 iValue 에 정수 44032 를 입력
    int iValue = 44032;
//    char 타입의 변수 cValue 에 int 타입의 변수 iValue 를 저장, 강제타입변환을 해야 함
    char cValue = (char)iValue;
    System.out.println("cValue : " + cValue);

//    long 타입의 변수 lValue 에 정수 500 을 저장
    long lValue = 500;
//    int 타입의 변수 iValue 에 long 타입의 변수 lValue를 강제 타입 변환하여 저장
    iValue = (int)lValue;
    System.out.println("iValue : " + iValue);

//    double 타입의 변수 dValue 에 실수 3.14 를 저장
    double dValue = 3.14;
//    int 타입의 변수 iValue 에 double 타입의 변수 dValue 를 강제 타입 변환하여 저장
    iValue = (int)dValue;
    System.out.println("iValue : " + iValue);
  }
}















