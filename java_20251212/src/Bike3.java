public class Bike3 {

  String company = "혼다 오토바이";
  String model;
  String color;
  int maxSpeed;

//  생성자 오버로딩을 통해서 여러개의 생성자를 선언
  public Bike3() {
//    this() : 현재 클래스의 생성자에서 다른 생성자를 호출하는 명령어
    this("CB650");
  }

  public Bike3(String model) {
//    this.model = model;
    this(model, "레드");
  }

  public Bike3(String model, String color) {
//    this.model = model;
//    this.color = color;
    this(model, color, 300);
  }

  public Bike3(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}















