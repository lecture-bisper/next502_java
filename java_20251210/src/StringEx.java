public class StringEx {

  public static void main(String[] args) {

//    String 타입은 클래스 타입이기 때문에 사용하려면 new 키워드를 사용하여 객체를 생성 후 사용해야 함
//    String 타입은 특수한 타입이기 때문에 기본 데이터 타입처럼 사용하는 것을 허용
//    2 개 이상의 String 타입의 변수를 선언하고 서로 동일한 문자열을 각각 저장할 경우 두 String 타입의 변수에 저장되는 메모리 주소는 동일하게 저장
    String name1 = "아이유"; // 기본 데이터 타입처럼 사용함
    String name2 = "아이유"; // name1 과 같은 메모리 주소를 공유
//    클래스 타입을 사용하는 기본 방식
    String name3 = new String("아이유");
    String name4 = new String("아이유");

    System.out.println("name1 : " + name1);
    System.out.println("name2 : " + name2);
    System.out.println("name3 : " + name3);
    System.out.println("name4 : " + name4);


//    name1 의 주소와 name2 의 주소를 비교
    if (name1 == name2) {
      System.out.println("name1 과 name2 는 참조가 같음");
    }
    else {
      System.out.println("name1 과 name2 는 참조가 다름");
    }

//    equals() : 문자열 비교 메소드
//    name1이 저장하고 있는 메모리 주소의 데이터와 name2가 저장하고 있는 메모리 주소의 데이터를 비교
    if (name1.equals(name2)) {
      System.out.println("name1 과 name2 의 문자열이 같음");
    }
    else {
      System.out.println("name1 과 name2 의 문자열이 다름");
    }

//    name3 이 가지고 있는 메모리 주소와 name4 가 가지고 있는 메모리 주소를 비교
    if (name3 == name4) {
      System.out.println("name3 과 name4 는 참조가 같음");
    }
    else {
      System.out.println("name3 과 name4 는 참조가 다름");
    }

//    name3이 저장하고 있는 메모리 주소의 데이터와 name4가 저장하고 있는 메모리 주소의 데이터를 비교
    if (name3.equals(name4)) {
      System.out.println("name3 과 name4 의 문자열이 같음");
    }
    else {
      System.out.println("name3 과 name4 의 문자열이 다름");
    }

//    참조 변수에서 == 기호는 해당 참조 변수가 저장하고 있는 메모리 주소를 비교
    if (name1 == name3) {
      System.out.println("name1 과 name3 는 참조가 같음");
    }
    else {
      System.out.println("name1 과 name3 는 참조가 다름");
    }

//    String 타입의 변수가 가지고 있는 문자열을 비교 시 equals() 메소드를 사용
    if (name1.equals(name3)) {
      System.out.println("name1 과 name3 의 문자열이 같음");
    }
    else {
      System.out.println("name1 과 name3 의 문자열이 다름");
    }
  }
}















