//  계산기 기능을 구현하기 위한 Calculator 클래스 정의
public class Calculator {

//  메소드의 명명법은 변수 명명법과 동일함

//  메소드 선언
//  메소드 선언 시 () 가 필수
//  메소드의 () 안에 들어갈 매개변수가 없을 수 있음
//  void : 반환값 없음
  void powerOn() {
//    코드 블럭, 해당 메소드 호출 시 실행할 소스 코드의 모음
    System.out.println("계산기 전원을 켭니다.");
  }

  int plus(int x, int y) {
    int result = x + y;
    return result;
  }

  double divide(int x, int y) {
    double result = (double)x / (double)y;
    return result;
  }

  void powerOff() {
    System.out.println("계산기 전원을 끕니다.");
  }
}















