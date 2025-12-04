public class CharOpEx {

  public static void main(String[] args) {

    char c1 = 'A' + 1;
    char c2 = 'A';

    System.out.println("c1 : " + c1);
    System.out.println("c2 : " + c2);

//
    char c3 = (char)(c2 + 1);
    System.out.println("c3 : " + c3);

//    문자가 작은 따옴표로 감싸여 있으면 문자(char 타입)
//    문자가 한 글자라도 큰 따옴표로 감싸여 있으면 문자열(String 타입)
    char c4 = '가';
    String s1 = "가";
    System.out.println("문자인 " + c4);
    System.out.println("문자열 " + s1);

    char cResult = (char)(c4 + 1);
//    문자열 : 문자가 여러개 묶여서 있는 데이터 타입
//    String 데이터 타입이며, 참조 타입
//    문자열과 다른 데이터 타입을 연산 시 모두 문자열이 됨
//    큰 따옴표로 감싸여 있으면 무조건 문자열
    
//    + : 문자열 연결 연산자, 두 개 이상의 문자열을 하나의 문자열로 합쳐주는 연산자, 문자열과 관련된 연산자는 + 하나만 존재
    String sResult = s1 + 1;
    System.out.println("cResult : " + cResult);
    System.out.println("sResult : " + sResult);

    String s2 = "안녕하세요. ";
    String s3 = "자바입니다.";
    System.out.println(s2);
    System.out.println(s3);

    String s4 = s2 + s3;
    System.out.println(s4);

//    문자열과 다른 데이터 타입을 연산 시 모두 문자열이 됨
    String s5 = "JDK" + 21.0;
//    문자열이 저장된 변수와 다른 문자열을 문자열 연결 연산자로 연결
    String s6 = s5 + " 특징";
    System.out.println(s6);

//    문자열 연결 연산자로 연산, 연산의 진행방향은 왼쪽 -> 오른쪽
    String s7 = "JDK" + 20 + 1.0;
    String s8 = 20 + 1.0 + "JDK";
    System.out.println(s7);
    System.out.println(s8);
  }
}















