import java.util.Scanner;

public class ForEx {

  public static void main(String[] args) {

    System.out.println("\n ----- for 문 사용하기 -----\n");

//    for : java 및 js 에서 제공하는 반복문으로 조건식이 만족할 경우 사용자 대신 반복 실행하는 명령어
//    가장 많이 사용하는 반복문
//    초기화 변수, 조건식, 증감식을 미리 선언하고 반복 실행할 소스 코드를 코드 블럭에 입력하는 방식
//    사용법 :
//    for (초기화변수 ; 조건식 ; 증감식 ) {
//      반복 실행할 소스코드 ...;
//    }
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    System.out.println();

    int total = 0;

    for (int i = 1; i <= 10; i++) {
      total = total + i;
      System.out.println("i : " + i + ", total : " + total);
    }

//    정수뿐 아니라 실수를 사용한 for 문도 사용 가능함

    for (double i = 0.1; i <= 1.0; i+=0.1) {
      System.out.println("i : " + i);
    }

//    문제 1) 사용자 입력을 통해서 2 ~ 9까지의 정수 중 하나를 입력받고, 입력받은 숫자에 해당하는 구구단을 출력하는 프로그램을 작성하세요
//    # 3 * 1 = 3
//    # 3 * 2 = 6
//    # 3 * 9 = 27
    Scanner sc = new Scanner(System.in);

    System.out.print("출력할 구구단의 단수를 입력하세요(2 ~ 9) : ");
    int dan = sc.nextInt();

    System.out.println("----- " + dan + "단 -----");
    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " * " + i + " = " + dan * i);
    }
  }
}















