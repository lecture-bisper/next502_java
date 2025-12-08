import java.util.Scanner;

public class IfNestedEx {

  public static void main(String[] args) {

//    Math : 자바에서 제공하는 수학관련 유틸리티 클래스
//    random() : 0.0 ~ 0.9까지의 임의의 숫자를 출력하는 메서드
//    랜덤 정수 출력 사용법 : (int)(Math.random() * 최대출력숫자) + 1;
    int score = (int)(Math.random() * 55) + 46;

    System.out.println("점수 : " + score);

    String grade = "F";

    if (score >= 90) {
      if (score >= 95) {
        grade = "A+";
      }
      else {
        grade = "A";
      }
    }
    else if (score >= 80) {
      if (score >= 85) {
        grade = "B+";
      }
      else {
        grade = "B";
      }
    }
    else if (score >= 70) {
      if (score >= 75) {
        grade = "C+";
      }
      else {
        grade = "C";
      }
    }
    else if (score >= 60) {
      grade = "D";
    }

    System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "입니다.");

//    Scanner : 사용자의 키보드 입력을 받는 클래스
    Scanner sc = new Scanner(System.in);

    String like1 = "";
    String like2 = "";

    System.out.println("중국요리점에 방문했습니다.");
    System.out.println("음식을 주문합니다.");

    System.out.print("어떤 음식을 주문하시겠습니까? (자장면, 짬뽕)");
//    next() : 사용자의 키보드 입력을 문자열로 받아옴, 공백 기호를 기준으로 함
//    nextLine() : 사용자의 키보드 입력을 문자열로 받아옴, 줄바꿈 기호를 기준으로함
//    nextInt() : 사용자의 키보드 입력을 정수로 받아옴
//    nextDouble() : 사용자의 키보드 입력을 실수로 받아옴
//    nextBoolean() : 사용자의 키보드 입력을 논리형으로 받아옴 
    like1 = sc.nextLine(); // 사용자의 키보드 입력을 받아옴

//    equals() : 문자열을 비교하는 명령어, 문자열.equals("비교할문자열") 형태로 사용하여 동일하면 true, 아니면 false 를 출력
    if (like1.equals("자장면")) {
      System.out.print("어떤 자장면을 주문하시겠습니까? (간자장면, 삼선자장면)");
      like2 = sc.nextLine();

      if (like2.equals("간자장면")) {
        System.out.println("간자장면을 주문합니다.");
      }
      else {
        System.out.println("삼선자장면을 주문합니다.");
      }
    }
    else if (like1.equals("짬뽕")) {
      System.out.print("어떤 짬뽕을 주문하시겠습니까? (고기짬뽕, 삼선짬뽕)");
      like2 = sc.nextLine(); // 사용자 키보드 입력 받기

      if (like2.equals("고기짬뽕")) {
        System.out.println("고기짬뽕을 주문합니다.");
      }
      else {
        System.out.println("삼선짬뽕을 주문합니다.");
      }
    }
    else {
      System.out.println("저희집은 자장, 짬뽕 전문점입니다.");
      System.out.println("자장, 짬뽕 중에서 주문해 주세요");
      System.exit(0);
    }

    System.out.println("주문한 요리를 맛있게 먹습니다.");
  }
}















