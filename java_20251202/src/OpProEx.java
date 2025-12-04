public class OpProEx {

  public static void main(String[] args) {

//    byte 타입의 변수 bValue1, bValue2 을 선언하고 byte 타입 데이터 저장
    byte bValue1 = 10;
    byte bValue2 = 20;
//    자바에서 작은 데이터 타입끼리 연산 시 자동 타입 변환이 발생하여 int 타입으로 변환됨
//    작은 데이터 타입의 연산식을 괄호로 감싸고, 강제 타입 변환을 시켜서 저장
    byte bValue3 = (byte)(bValue1 + bValue2);
    System.out.println("bValue3 : " + bValue3);

//    byte 타입의 두 변수를 더하여 int 타입의 변수에 저장
    int iValue1 = bValue1 + bValue2;
    System.out.println("iValue1 : " + iValue1);

//    char 타입의 변수 cValue1, cValue2 을 선언하고 각각 'A' 와 1 을 저장
    char cValue1 = 'A';
    char cValue2 = 1;
//    연산 후 강제 타입 변환
    char cValue3 = (char)(cValue1 + cValue2);
    System.out.println("cValue3 : " + cValue3);

//    char + char 연산 시 int 타입으로 자동 타입 변환이 발생함
//    char 타입의 문자 'A' 는 정수로 65 이므로 cValue1 + cValue2 는 65 + 1 이 됨
    int iValue2 = cValue1 + cValue2;
    System.out.println("iValue2 유니코드 : " + iValue2);
//    char 타입으로 강제 타입 변환하여 문자로 출력
    System.out.println("iValue2 문자 출력 : " + (char)iValue2);

//    int 타입의 변수 iValue3, iValue4를 선언하고 iValue3에 10을 저장
    int iValue3 = 10;
//    int 타입은 정수만 저장하기 때문에 10 / 4 의 결과인 2.5 에서 소수점 자리를 제외한 정수 2만 저장
    int iValue4 = iValue3 / 4;
    System.out.println("iValue4 : " + iValue4);

//    int 타입은 정수만 저장하는데, 10 / 4.0 은 실수인 4.0 에 의해서 정수 10 이 double 타입인 10.0 으로 자동 타입 변환됨
//    연산에 의한 큰 데이터 타입으로 자동 타입 변환되었기 때문에, 결과값이 double 타입인데, int 타입의 변수에 저장하려고 하기 때문에 오류가 발생
    int iValue5 = 10;
    int iValue6 = (int)(10 / 4.0);
    System.out.println("iValue6 : " + iValue6);
//    연산에 의한 자동 타입 변환의 결과를 double 타입의 변수에 저장
    double dValue = iValue5 / 4.0;
    System.out.println("dValue : " + dValue);
  }
}















