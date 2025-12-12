public class CarEx {

  public static void main(String[] args) {

//    CarEx 클래스가 Car 클래스를 사용
//    Car 클래스 myCar객체 생성
    Car myCar = new Car();
//    myCar 객체의 메소드 호출
    myCar.keyTurnOn();
    myCar.run();

    int speed = myCar.getSpeed();
    System.out.println("현재 속도 : " + speed + "km/h");
  }
}















