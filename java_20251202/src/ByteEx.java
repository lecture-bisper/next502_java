public class ByteEx {

//  main 메서드, 자바 프로그램의 시작점
  public static void main(String[] args) {

//    byte 타입 : 정수를 저장하는 데이터 타입
//    -128 ~ 127 까지 저장 가능
    byte val1 = -128;
    System.out.println("val1 = " + val1);
    byte val2 = -30;
    System.out.println("val2 = " + val2);
    byte val3 = 0;
    System.out.println("val3 = " + val3);
    byte val4 = 30;
    System.out.println("val4 = " + val4);
    byte val5 = 127;
    System.out.println("val5 = " + val5);

//    byte 타입에 저장할 수 있는 최대 크기는 127까지 인데 129 라는 최대 크기를 넘어가는 데이터를 저장하기 때문에 오류 발생
//    byte val6 = 129;

//    byte 타입의 변수를 선언하고 정수 데이터 125를 저장
    byte val7 = 125;
//    int 타입의 변수를 선언하고 정수 데이터 125를 저장
    int val8 = 125;

//    반복문 사용, 5번 반복
    for (int i = 0; i < 5; i++) {
      val7++; // 값 1 증가, 저장할 수 있는 최대값 127을 넘어가면 반대인 최소값이 됨
      val8++; // 값 1 증가, 저장할 수 있는 최대값이 +21억 이므로 정상 출력
//      현재 내용 출력
      System.out.println("val7 = " + val7 + "\tval8 = " + val8);
    }
  }
}















