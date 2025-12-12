public class Car {

//  필드 (멤버 변수)
  int speed;

//  메소드
  int getSpeed() {
    return speed;
  }

  void keyTurnOn() {
    System.out.println("키를 돌립니다.");
  }

  void run() {
    for (int i = 10; i <= 50; i+=10) {
//      같은 멤버인 필드 speed 에 데이터 저장
      speed = i;
      System.out.println("자동차가 달립니다.(시속 : " + speed + "km/h)");
    }
  }
}















