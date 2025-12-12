
//  실행용 클래스 StudentEx 정의
public class StudentEx {

//  프로그램을 실행하기 위한 시작점
  public static void main(String[] args) {

//    Student 클래스 타입의 변수 s1 을 선언
//    new 연산자를 사용하여 Student 클래스 타입의 객체를 힙 메모리에 생성
//    생성된 객체의 힙 메모리 상의 주소를 가져옴
//    Student 클래스 타입의 변수 s1 에 가져온 주소를 저장
    Student s1 = new Student();
    System.out.println("s1 변수가 Student 객체를 참조합니다.");

//    Student 클래스 타입의 변수 s2 를 선언
//    new 연산자를 사용하여 Student 클래스 타입의 객체를 힙 메모리에 새로 생성
//    생성된 객체의 메모리 주소를 반환받아 클래스 변수인 s2 에 저장
    Student s2 = new Student();
    System.out.println("변수 s2 가 또 다른 Student 객체를 참조합니다.");
  }
}















