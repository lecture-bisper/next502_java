public class BikeEx {

  public static void main(String[] args) {

//    Bike 클래스 타입의 변수 myBike 선언
//    new 연산자를 사용하여 Bike클래스의 생성자 호출
//    new 연산자가 힙 메모리 영역에 Bike 클래스 타입의 객체 생성 후 주소 가져옴
//    가져온 메모리 주소를 Bike 클래스 타입의 변수 myBike 에 저장
    Bike myBike = new Bike();

//    객체 myBike 의 멤버 변수가 가지고 있는 데이터 출력
    System.out.println("제작회사 : " + myBike.company);
    System.out.println("모델명 : " + myBike.model);
    System.out.println("색상 : " + myBike.color);
    System.out.println("최고속도 : " + myBike.maxSpeed);
    System.out.println("현재속도 : " + myBike.speed);

//    객체 myBike 의 멤버 변수 speed 에 데이터 저장
    myBike.speed = 50;
    System.out.println("수정된 현재 속도 : " + myBike.speed);

    Bike yourBike = new Bike();
    yourBike.company = "혼다";
    System.out.println(yourBike.company);
  }
}















