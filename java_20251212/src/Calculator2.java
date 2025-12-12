public class Calculator2 {

//  메소드 선언
//  리턴 타입을 int 타입으로 선언
//  int 타입의 매개변수 2개를 선언
  int plus(int x, int y) {
    int result = x + y;
//    return : 리턴 타입으로 선언한 int 타입의 데이터를 반환, 메소드 종료
    return result;
  }

  double avg(int x, int y) {
//    Calculator2 클래스의 멤버 메소드 plus() 를 호출
//    메소드 plus(), avg() 는 둘다 클래스 Calculator2 의 멤버
//    메소드 이름만 사용하여 호출
    double sum = plus(x, y);
    double result = sum / 2;
    return result;
  }

  void execute() {
//    메소드 이름만 사용하여 avg() 를 호출, 매개변수 2개 전달
    double result = avg(7, 10);
    println("실행결과 : " + result);
  }

  void println(String msg) {
    System.out.println(msg);
  }
}















