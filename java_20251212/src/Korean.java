public class Korean {

//  필드(멤버 변수) 선언
//  필드 선언과 동시에 데이터 입력
  String nation = "대한민국";
//  필드를 선언만 함, String 타입의 초기값인 null 이 설정됨
  String name;
  String ssn;

//  기본 생성자를 사용자가 코드 블럭 내용을 수정하여 선언
//  생성자를 사용한 필드의 초기화
  public Korean() {
//    생성자에서 필드에 고정된 데이터를 대입하여 초기화
    name = "홍길동";
    ssn = "123456-1234567";
  }

//  사용자 정의 생성자 선언, 매개변수로 2개의 데이터를 받음
  public Korean(String userName) {
//    매개변수로 받아온 데이터를 필드에 대입하여 필드를 초기화
    name = userName;
  }

//  클래스에는 this, super, this(), super() 키워드가 존재함
//  super 상속관계에 있는 부모 객체를 의미
//  this 객체 자신을 의미
//  this 는 클래스 내에서 클래스 자신의 멤버를 호출할 경우 사용함
//  클래스 내의 생성자나 메소드 호출 시 매개변수의 이름과 클래스의 필드(멤버 변수) 의 이름이 동일할 경우 어떤 것이 매개변수이고, 어떤 것이 필드인지 구분할 수 할 수 없음
//  this 를 사용하여 클래스의 멤버를 구분함

  public Korean(String name, String ssn) {
//    this 키워드를 사용하여 클래스의 필드와 생성자의 매개변수 이름을 구분함
    this.name = name;
    this.ssn = ssn;
  }

  public Korean(String nation, String name, String ssn) {
    this.nation = nation;
    this.name = name;
    this.ssn = ssn;
  }


}















