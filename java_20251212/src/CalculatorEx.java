public class CalculatorEx {

  public static void main(String[] args) {

//    Calculator 클래스 타입의 변수 myCal 선언
//    new 연산자와 Calculator() 생성자를 사용하여 객체 생성 후 주소 가져옴
//    Calculator 클래스 타입의 변수 myCal 에 주소를 저장
//    Calculator 클래스 타입의 객체(인스턴스) 생성 완료
    Calculator myCal = new Calculator();
//    myCal 객체(인스턴스)의 멤버 메소드 powerOn() 를 호출
    myCal.powerOn();

//    myCal 객체(인스턴스)의 멤버 메소드 plus() 를 호출
//    멤버 메소드 plus() 호출 시 매개변수로 정수 데이터 10, 30 을 전달
//    멤버 메소드 plus() 의 결과값을 반환받아 변수 result1 에 저장
    int result1 = myCal.plus(10, 30);
    System.out.println("result1 : " + result1);

//    byte 타입의 변수 2개 선언과 동시에 데이터 입력
    byte x = 10;
    byte y = 3;
//    myCal 객체의 멤버 메소드 divide() 를 호출
//    divide() 호출 시 byte 데이터 10, 3 을 전달
//    메소드 호출 결과값으로 double 데이터를 받아서 result2 에 저장
    double result2 = myCal.divide(x, y);
    System.out.println("result2 : " + result2);

    myCal.powerOff();
  }
}















