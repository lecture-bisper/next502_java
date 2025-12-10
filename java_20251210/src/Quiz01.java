import java.util.Scanner;

public class Quiz01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


//    문제 2) 2중 for 문을 사용하여 구구단을 2단부터 9단까지 모두 출력하는 프로그램을 작성하세요
    System.out.println("\n ----- 문제 2 -----\n");

    for (int i = 2; i < 10; i++) {
      System.out.println("\n----- " + i + "단 -----");
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + i * j);
      }
    }

//    문제 3) 2중 for 문을 사용하여 구구단을 2단부터 9단까지 구구단 출력 시 지정한 구구단부터 출력을 멈추는 프로그램을 작성하세요
//    구구단까지 출력 후 멈추는
//    break 사용
    System.out.println("\n ----- 문제 3 -----\n");

    System.out.print("정수를 입력해주세요(2 ~ 9) : ");
//    Scanner 을 통해서 사용자 키보드로 정수 입력받기
    int stopDan = sc.nextInt();

    for (int i = 2; i < 10; i++) {

//      사용자가 입력한 정수와 외부 for 문의 초기화변수 i 의 값 비교
      if (stopDan == i) {
//        서로 같을 경우 반복문 정지
        break;
      }

      System.out.println("\n----- " + i + "단 -----");
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + i * j);
      }

//      지정한 단수의 구구단 출력 후 반복문 정지
//      if (stopDan == i) {
//        break;
//      }
    }

//    문제 4) 2중 while 문을 사용하여 구구단을 2단부터 9단까지 구구단 출력 시 지정한 단수의 구구단만 제외하고 나머지는 모두 출력하는 프로그램을 작성하세요
//    continue 사용
    System.out.println("\n ----- 문제 4 -----\n");

    System.out.print("정수를 입력하세요 (2 ~ 9) : ");
    stopDan = sc.nextInt();

    int x = 1; // 외부 while 문의 초기화 변수
    while (x < 9) {
      x++; // 외부 while 문의 증감식

      if (stopDan == x) {
        continue;
      }

      System.out.println("\n----- " + x + "단 -----");

      int y = 1; // 내부 while 문의 초기화 변수
      while (y < 10) {
        System.out.println(x + " * " + y + " = " + x * y);
        y++; // 내부 while 문의 증감식
      }
    }


//    문제 5) 아래와 같은 모양으로 화면에 출력하는 프로그램을 작성하세요
//    *
//    **
//    ***
//    ****
//    *****
    System.out.println("\n ----- 문제 5 -----\n");
    String star = ""; // * 문자를 저장한 변수
    for (int i = 0; i < 5; i++) {
      star = star + "*"; // 변수에 * 문자를 추가함
      System.out.println(star);
    }

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

//    문제 6) 아래와 같은 모양으로 화면에 출력하는 프로그램을 작성하세요
//        *
//       **
//      ***
//     ****
//    *****
    System.out.println("\n ----- 문제 6 -----\n");
    for (int i = 1; i <= 5; i++) {
      for (int j = i; j <= 5 - 1; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }


//    문제 7) 아래와 같은 모양으로 화면에 출력하는 프로그램을 작성하세요
//    *****
//    ****
//    ***
//    **
//    *
    System.out.println("\n ----- 문제 7 -----\n");
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}















