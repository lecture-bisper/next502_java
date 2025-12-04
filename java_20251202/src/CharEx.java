public class CharEx {

  public static void main(String[] args) {

//    char : 문자 1개를 저장하는 데이터 타입, 정수 타입(0 ~ 65535 까지 저장)
//    자바에서 char 타입을 사용하여 문자 1개를 표현할 경우 '' 를 사용함

    char c1 = 'A'; // char 타입의 변수 c1 선언과 동시에 'A' 를 저장
    char c2 = 65; // char 타입의 변수 c2 선언과 동시에 정수 65를 저장
    char c3 = '\u0041'; // char 타입의 변수 c3 선언과 동시에 유니코드 '\u0041'을 저장

    char c4 = '가'; // char 타입의 변수 c4 선언과 동시에 '가' 를 저장
    char c5 = 44032; // char 타입의 변수 c5 선언과 동시에 44032 를 저장
    char c6 = '\uac00'; // char 타입의 변수 c6 선언과 동시에 '\uac00' 을 저장

    // int 타입의 변수 unicode 에 char 타입의 변수 c1을 저장
    // int 타입은 정수만 저장할 수 있으므로 'A' 가 아닌 정수 65가 저장됨
    int unicode = c1;

//    char 타입의 변수 저장된 데이터를 출력
    System.out.println("c1 : " + c1);
    System.out.println("c2 : " + c2);
    System.out.println("c3 : " + c3);
    System.out.println("c4 : " + c4);
    System.out.println("c5 : " + c5);
    System.out.println("c6 : " + c6);
    System.out.println("unicode : " + unicode);
  }
}















