import java.util.Scanner;

public class Quiz01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
//    책 89페이지 10번 문제
//    System.out.println("\n ----- 문제 9 ----- \n");
//
//
//    System.out.print("커피 주문하세요>>");
//    String coffee = sc.next();
//    int count = sc.nextInt();
//
//    switch (coffee) {
//      case "에스프레소":
//
//        if (count < 10) {
//          System.out.println(2000 * count + "원입니다.");
//        }
//        else {
////          할인 금액 5% : 전체 금액 * 0.05;
////          할인 받은 금액 : 전체 금액 - 할인 금액;
//          int pay = (int)((2000 * count) - (2000 * count * 0.05));
//          System.out.println(pay + "원 입니다.");
//        }
//        break;
//
//      case "아메리카노":
//        System.out.println(2500 * count + "원입니다.");
//        break;
//
//      case "카푸치노":
//        System.out.println(3000 * count + "원입니다.");
//        break;
//
//      case "카페라떼":
//        System.out.println(3500 * count + "원입니다.");
//        break;
//    }
//
////    1번. 짝수/홀수 판단하기
////    사용자로부터 정수를 입력받아, 해당 수가 짝수인지 홀수인지 출력하는 프로그램을 작성하세요.
////    조건: % 연산자를 사용할 것.
//    System.out.println("\n----- 과제 1 -----\n");
//    System.out.print("정수 하나를 입력하세요 >> ");
//    int num = sc.nextInt();
//
//    if (num % 2 == 0) {
//      System.out.println("num1 의 값인 " + num + "은 짝수 입니다.");
//    }
//    else {
//      System.out.println("num1 의 값인 " + num + "은 홀수 입니다.");
//    }
//
////    2번. 성인 여부 판별
////    나이를 입력받아 만 19세 이상이면 “성인입니다.”, 그렇지 않으면 **“미성년자입니다.”**라고 출력하세요.
//    System.out.println("\n----- 과제 2 -----\n");
//    System.out.print("나이를 입력하세요 >> ");
//    int age = sc.nextInt();
//
//    if (age < 19) {
//      System.out.println("미성년자 입니다.");
//    }
//    else {
//      System.out.println("성인입니다");
//    }
//
////    3번. 세 수의 합 비교
////    정수 3개를 입력받아 세 수의 합이 100 이상이면 “100 이상입니다.”,
////    그렇지 않으면 **“100 미만입니다.”**라고 출력하세요.
//    System.out.println("\n----- 과제 3 -----\n");
//    System.out.println("정수 3개를 입력하세요.");
//    System.out.print("첫번째 정수 : ");
//    int num1 = sc.nextInt();
//    System.out.print("두번째 정수 : ");
//    int num2 = sc.nextInt();
//    System.out.print("세번째 정수 : ");
//    int num3 = sc.nextInt();
//
//    if (num1 + num2 + num3 < 100) {
//      System.out.println("100 미만입니다.");
//    }
//    else {
//      System.out.println("100 이상입니다.");
//    }

//    4번. 점수에 따른 학점 출력 (if문 활용)
//    0~100 사이의 점수를 입력받아 학점을 출력하세요.
//    90 이상: A
//    80 이상: B
//    70 이상: C
//    60 이상: D
//    나머지: F
//    System.out.println("\n----- 과제 4 -----\n");
//    System.out.print("점수를 입력하세요 : ");
//    int score = sc.nextInt();
//    String grade = "F";
//
//    if (score > 0 && score <= 100) {
//      if (score >= 90) {
//        grade = "A";
//      }
//      else if (score >= 80) {
//        grade = "B";
//      }
//      else if (score >= 70) {
//        grade = "C";
//      }
//      else if (score >= 60) {
//        grade = "D";
//      }
//      System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "입니다.");
//    }
//    else {
//      System.out.println("0 ~ 100 까지의 정수로 입력하세요");
//    }
//
//
//    5번. 가장 큰 수 찾기
//    정수 3개를 입력받아 가장 큰 수를 출력하세요.
//    조건: Math.max()는 사용하지 않고 if문으로 작성할 것.
//    System.out.println("\n----- 과제 5 -----\n");
//    System.out.println("3개의 정수를 입력하세요.");
//    System.out.print("첫번째 정수 : ");
//    int a = sc.nextInt();
//    System.out.print("두번째 정수 : ");
//    int b = sc.nextInt();
//    System.out.print("세번째 정수 : ");
//    int c = sc.nextInt();
//
//    int max = 0;
//
//    if (a < b) {
//      max = b;
//    }
//    else {
//      max = a;
//    }
//
//    if (max < c) {
//      max = c;
//    }
//
//    System.out.println("세 정수 중에서 가장 큰 수는 " + max + "입니다.");
////
////
////    6번. 달의 계절 출력 (switch문)
////    1~12 월을 입력하면 계절을 출력하세요.
////    3~5월: 봄
////    6~8월: 여름
////    9~11월: 가을
////    12·1·2월: 겨울
////    그 외: “잘못된 입력입니다.”
//    System.out.println("\n----- 과제 6 -----\n");
//    System.out.print("1 ~ 12 월 중 하나를 입력하세요 : ");
//    int month = sc.nextInt();
//
//    if (month >= 1 && month <= 12) {
//      switch (month) {
//        case 3:
//        case 4:
//        case 5:
//          System.out.println("봄 입니다.");
//          break;
//
//        case 6:
//        case 7:
//        case 8:
//          System.out.println("여름 입니다.");
//          break;
//
//        case 9:
//        case 10:
//        case 11:
//          System.out.println("가을 입니다.");
//          break;
//
////      case 12:
////      case 1:
////      case 2:
////        System.out.println("겨울 입니다.");
////        break;
//
//        default:
//          System.out.println("겨울 입니다.");
//          break;
//      }
//    }
//    else {
//      System.out.println("1 ~ 12 까지의 정수를 입력하세요");
//    }
////
////
////    7번. 사칙연산 계산기 만들기
////    정수 2개와 연산자(+,-,*,/) 중 하나를 입력받아 계산 결과를 출력하세요.
////    조건: switch 문으로 처리
////    조건: 나눗셈(/)은 정수 나눗셈 방식으로 처리
//    System.out.println("\n----- 과제 7 -----\n");
//    System.out.println("계산할 내용을 입력하세요 (예시 : x + y )");
//    System.out.print(">> ");
//    int first = sc.nextInt();
//    String op = sc.next();
//    int second = sc.nextInt();
//
//    switch (op) {
//      case "+":
//        System.out.println(first + " + " + second + " = " + (first + second));
//        break;
//
//      case "-":
//        System.out.println(first + " - " + second + " = " + (first - second));
//        break;
//
//      case "*":
//        System.out.println(first + " * " + second + " = " + (first * second));
//        break;
//
//      case "/":
//        System.out.println(first + " / " + second + " = " + (first / second));
//        break;
//
//      default:
//        System.out.println("잘못된 입력입니다.");
//        break;
//    }
////
////
////    8번. 로그인 검사
////    아이디와 비밀번호를 입력받아 아래 조건과 일치하면 “로그인 성공”, 아니면 “로그인 실패”를 출력하세요.
////    정답 아이디: admin
////    정답 비밀번호: 1234
//    System.out.println("\n----- 과제 8 -----\n");
//    System.out.println("로그인 정보를 입력하세요.");
//    System.out.print("ID : ");
//    String id = sc.next();
//    System.out.print("PW : ");
//    String pw = sc.next();
//
////    if (id.equals("admin")) {
////      if (pw.equals("1234")) {
////        System.out.println("로그인 성공");
////      }
////      else {
////        System.out.println("로그인 실패");
////      }
////    }
////    else {
////      System.out.println("로그인 실패");
////    }
//
//    if (id.equals("admin") && pw.equals("1234")) {
//      System.out.println("로그인 성공");
//    }
//    else {
//      System.out.println("로그인 실패");
//    }
//
//
//    9번. 윤년 판별하기
//    연도를 입력받아, 아래 조건에 따라 윤년(leap year) 여부를 출력하세요.
//    4의 배수이면 윤년
//    하지만 100의 배수이면 평년
//    하지만 400의 배수이면 다시 윤년
    System.out.println("\n----- 과제 9 -----\n");
    System.out.print("윤년 판단 프로그램\n년도를 입력하세요 : ");
    int year = sc.nextInt();

    if (year % 400 == 0) {
      System.out.println(year + "년도는 윤년 입니다.");
    }
    else if (year % 100 == 0) {
      System.out.println(year + "년도는 평년 입니다.");
    }
    else if (year % 4 == 0) {
      System.out.println(year + "년도는 윤년 입니다.");
    }
    else {
      System.out.println(year + "년도는 평년 입니다.");
    }

//
//
//
//
//    추가 1번. 세 정수 중 ‘중간값’ 구하기
//    정수 3개를 입력받아 **가장 큰 값도 아니고 가장 작은 값도 아닌 ‘중간값’**을 출력하는 프로그램을 작성하세요.
//    단, 정렬 사용 금지
//    모든 비교는 if문으로 직접 구현할 것
//
//    예: 입력 20, 5, 10 → 출력: 10
//
//
//
//    추가 2번. BMI 계산 후 등급 출력하기
//    몸무게(kg)와 키(m)를 입력받아 아래 조건에 따라 BMI 등급을 출력하세요.
//        BMI = 몸무게 / (키 × 키)
//    18.5 미만: 저체중
//    18.5 이상 23 미만: 정상
//    23 이상 25 미만: 과체중
//    25 이상: 비만
//
//    출력 예:
//    BMI = 27.1 → 비만
//
//
//
//    3번. 세 과목 점수의 가중 평균 계산하기
//    국어, 영어, 수학 점수를 입력받아 아래 가중치를 적용한 가중 평균 점수를 계산하고, 등급을 출력하세요.
//        국어: 30%
//        영어: 30%
//        수학: 40%
//        가중 평균 = 국어×0.3 + 영어×0.3 + 수학×0.4
//    등급 조건:
//    90 이상: A
//    80 이상: B
//    70 이상: C
//    60 이상: D
//    나머지: F
//
//
//
//    4번. 간단한 ‘최소 지폐 단위 계산기’ 만들기
//    사용자로부터 금액(정수)을 입력받고, 50000원, 10000원, 5000원, 1000원 지폐가 각각 몇 장 필요한지 계산하세요.
//
//        예:
//    입력: 136000
//    출력:
//    50000원: 2장
//    10000원: 3장
//    5000원: 1장
//    1000원: 1장
//
//※ 반복문 없이 / 연산, % 연산만 활용
//
//
//
//    5번. 간단한 회원 등급 시스템 (switch + if 복합)
//    회원 등급(문자열)을 입력받아 아래 조건에 맞게 혜택을 출력하세요.
//
//    회원등급: VIP, GOLD, SILVER, BRONZE 중 하나
//
//    각 등급별 할인율:
//    VIP: 20%
//        GOLD: 15%
//        SILVER: 10%
//        BRONZE: 5%
//
//        추가 조건:
//    구매 금액이 200,000원 이상이면 추가로 2% 할인
//
//    출력 예시:
//    등급: GOLD
//    할인율: 17%
  }
}















