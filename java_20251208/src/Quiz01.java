import java.util.Scanner;

public class Quiz01 {

  public static void main(String[] args) {

//    책 87 페이지 문제 1, 2

    Scanner sc = new Scanner(System.in);

//    nextInt() 를 사용하여 키보드 입력 받기
//    nextInt() 를 두번 사용하여 각각 변수에 입력 받기
    System.out.println("\n ----- 문제 1 -----\n");
    System.out.print("두 정수를 입력하세요>>");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

//    System.out.println(num1 + "+" + num2 + "은 " + (num1 + num2));

    int result = num1 + num2;
    System.out.println(num1 + "+" + num2 + "은 " + result);


    System.out.println("\n ----- 문제 2 -----\n");
    System.out.print("몇 층인지 입력하세요>>");
    int num3 = sc.nextInt();

    int height = num3 * 5;
    System.out.println(height + "m 입니다.");


    System.out.println("\n ----- 문제 3 -----\n");
    System.out.print("x 값을 입력하세요>>");
    int x = sc.nextInt();
    int y = x * x - 3 * x + 7;

    System.out.println("x=" + x + ", y=" + y);

    System.out.println("\n ----- 문제 4 -----\n");
    System.out.print("점 (x, y)의 좌표를 입력하세요>>");
    int inputX = sc.nextInt();
    int inputY = sc.nextInt();

//    x  = 50 ~ 100, y = 50 ~ 100 인지 if 문을 사용하여 확인
    if (inputX >= 50) {
      if (inputX <= 100) {
        if (inputY >= 50) {
          if (inputY <= 100) {
            System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 내에 있습니다.");
          }
          else {
            System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 밖에 있습니다.");
          }
        }
        else {
          System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 밖에 있습니다.");
        }
      }
      else {
        System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 밖에 있습니다.");
      }
    }
    else {
      System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 밖에 있습니다.");
    }

    if (inputX >= 50 && inputX <= 100) {
      if (inputY >= 50 && inputY <= 100) {
        System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 안에 있습니다.");
      }
      else {
        System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 밖에 있습니다.");
      }
    }
    else {
      System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 밖에 있습니다.");
    }


    if ((inputX >= 50 && inputY >= 50) && (inputX <= 100 && inputY <= 100)) {
      System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 내에 있습니다.");
    }
    else {
      System.out.println("점(" + inputX + "," + inputY + ")은 (50,50)과 (100,100)의 사각형 내에 없습니다.");
    }


//    책 88 페이지 6번 문제
    System.out.println("\n ----- 문제 5 -----\n");
    System.out.print("돈의 액수를 입력하세요>>");
//    입력받은 원금
    int money = sc.nextInt();

    int cw50000 = money / 50000;
    int cwn50000 = money % 50000;
    int cw10000 = cwn50000 / 10000;
    int cwn10000 = cwn50000 % 10000;
    int cw1000 = cwn10000 / 1000;
    int cwn1000 = cwn10000 % 1000;
    int cw500 = cwn1000 / 500;
    int cwn500 = cwn1000 % 500;
    int cw100= cwn500 / 100;
    int cwn100 = cwn500 % 100;
    int cw10 = cwn100 / 10;
    int cw1 = cwn100 % 10;

    System.out.println("입력받은 원금 " + money + "원");
    System.out.println("50,000원 권 : " + cw50000 + "장");
    System.out.println("10,000원 권 : " + cw10000 + "장");
    System.out.println("1,000원 권 : " + cw1000 + "장");
    System.out.println("500원 동전 : " + cw500 + "개");
    System.out.println("100원 동전 : " + cw100 + "개");
    System.out.println("10원 동전 : " + cw10 + "개");
    System.out.println("1원 동전 : " + cw1 + "개");

//    책 88 페이지 7번 문제
    System.out.println("\n ----- 문제 6 -----\n");
    System.out.print("학점을 입력하세요>>");
    String grade = sc.next();

    switch (grade) {
      case "A":
      case "B":
        System.out.println("Excellent");
        break;

      case "C":
      case "D":
        System.out.println("Good");
        break;

      case "F":
        System.out.println("Bye");
        break;
    }


//    책 88 페이지 8번 문제
    System.out.println("\n ----- 문제 7 -----\n");
    System.out.println("커피 주문하세요>>");
    String coffee = sc.next();
    int count = sc.nextInt();
    int pay = 0;
    int total = 0;

//    if문
    if (coffee.equals("에스프레소")) {
      pay = 2000;
    }
    else if (coffee.equals("아메리카노")) {
      pay = 2500;
    }
    else if (coffee.equals("카푸치노")) {
      pay = 3000;
    }
    else if (coffee.equals("카페라떼")) {
      pay = 5300;
    }

//    switch 문
    switch (coffee) {
      case "에스프레소":
//        System.out.println(2000 * count + "원 입니다.");

        pay = 2000;
        break;

      case "아메리카노":
//        System.out.println(2500 * count + "원 입니다.");

        pay = 2500;
        break;

      case "카푸치노":
//        System.out.println(3000 * count + "원 입니다.");

        pay = 2500;
        break;

      case "카페라떼":
//        System.out.println(3500 * count + "원 입니다.");

        pay = 2500;
        break;
    }

    total = pay + count;
    System.out.println(total + "원 입니다.");

//    책 89 페이지 9번 문제
    System.out.println("\n ----- 문제 8 -----\n");
    System.out.print("1 ~ 99 사이의 정수를 입력하세요>>");
    int num = sc.nextInt();

    if (num > 0 && num < 100) {
      int first = num / 10;
      int second = num % 10;

      if (first % 3 == 0 && second % 3 == 0) {
        System.out.println("박수 짝짝!!");
      }
//      else if (first % 3 == 0 && second % 3 != 0) {
//        System.out.println("박수 짝!");
//      }
//      else if (first % 3 != 0 && second % 3 == 0) {
//        System.out.println("박수 짝!");
//      }
      else if ((first % 3 == 0 && second % 3 != 0) || (first % 3 != 0 && second % 3 == 0)) {
        System.out.println("박수 짝!");
      }
      else {
        System.out.println("박수 없음");
      }
    }
    else {
      System.out.println("잘못된 입력입니다.");
    }

//    책 89 페이지 10번 문제
    System.out.println("\n ----- 문제 9 -----\n");
  }
}















