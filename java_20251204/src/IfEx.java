public class IfEx {

  public static void main(String[] args) {

//    if 문 : 가장 많이 사용되는 조건문
//    단순 if 문, if ~ else 문, elseif 문으로 나누어짐

//    단순 if 문은 조건식의 결과가 true 이면, 추가로 내용을 실행
//    조건식의 결과가 false 이면, 기존의 내용만 실행
//    사용법 : 
//    if (조건식) {
//      if문의 결과가 true 일 때 실행할 소스코드 ... ;
//    }
    int score = 93;

    if (score >= 90) {
      System.out.println("점수가 90점 보다 높습니다.");
      System.out.println("등급은 A 입니다.");
    }

    if (score < 90) {
      System.out.println("점수가 90점 보다 낮습니다.");
      System.out.println("등급은 B 입니다.");
    }


    int money = 10000;

    System.out.println("현재 가지고 있는 금액은 " + money + "원 입니다.");
    System.out.println("중화 요리점에 갑니다.");
    System.out.println("자장면(7,000원)을 주문 합니다.");

    money = money - 7000;

    if (money > 5000) {
      System.out.println("군만두(5,000원)를 주문 합니다.");
      money -= 5000;
    }

    System.out.println("주문한 음식을 맛있게 먹습니다.");
    System.out.println("남은 금액은 " + money + "원 입니다.");

    System.out.println("\n ----- if ~ else 문 -----\n");

//    if ~ esle 문은 조건식의 결과에 따라 실행하는 내용이 달라짐
//    결과가 true 이면, 조건식 바로 다음에 있는 코드 블럭을 실행
//    결과가 false 이면, else 문 다음에 있는 코드 블럭을 실행
//    if ~ else 문은 반드시 true/false 중 하나를 선택해야 함
//    사용법 :
//    if (조건식) {
//      if문의 결과가 true 일 때 실행할 소스코드 ... ;
//    }
//    else {
//      결과가 false 일 때 실행할 소스코드 ... ;
//    }
    boolean bumuck = true;

    System.out.println("중화 요리점에서 탕수육을 주문합니다.");
    System.out.println("탕수육과 소스가 나왔습니다.");
    System.out.println("당신은 부먹파 입니까?? 찍먹파 입니까??");

    if (bumuck == true) {
      System.out.println("탕수육에 소스를 부어서 먹습니다.");
    }
    else {
      System.out.println("탕수육을 소스에 찍어 먹습니다.");
    }

    System.out.println("탕수육 맛있다.");

    System.out.println("\n----- else if 문 -----\n");

//    else if 문 : if 문 사용 시 여러개의 조건식이 존재하여 조건식을 하나씩 차례대로 검사한 후 조건식의 결과가 true 이면 해당 코드 블럭을 실행하는 if 문
//    조건식의 결과가 true 인 코드 블럭 이후의 조건식은 모두 무시
//    주의점 : 
//    1. 조건식은 순서대로 입력해야 함 (오름 차순 혹은 내림 차순 으로 입력)
//    2. else if 문은 if 문이 여러개 있는 것이 아니고 하나의 if 문임
    score = 45;

    System.out.println("오늘 수학 시험을 쳤습니다.");
    System.out.println("모르는 것이 많았습니다.");
    System.out.println("수학 시험지를 채점 합니다.");

    if (score >= 90) {
      System.out.println("나의 점수는 " + score + "점이고, A 등급입니다.");
    }
    else if (score >= 80) {
      System.out.println("나의 점수는 " + score + "점이고, B 등급입니다.");
    }
    else if (score >= 70) {
      System.out.println("나의 점수는 " + score + "점이고, C 등급입니다.");
    }
    else if (score >= 60) {
      System.out.println("나의 점수는 " + score + "점이고, D 등급입니다.");
    }
    else {
      System.out.println("나의 점수는 " + score + "점이고, F 등급입니다.");
    }

    System.out.println("----- 1번 주의 사항 -----");

    score = 85;
    if (score >= 90) {
      System.out.println("나의 점수는 " + score + "점이고, A 등급입니다.");
    }
    else if (score >= 70) {
      System.out.println("나의 점수는 " + score + "점이고, C 등급입니다.");
    }
    else if (score >= 80) {
      System.out.println("나의 점수는 " + score + "점이고, B 등급입니다.");
    }
    else if (score >= 60) {
      System.out.println("나의 점수는 " + score + "점이고, D 등급입니다.");
    }
    else {
      System.out.println("나의 점수는 " + score + "점이고, F 등급입니다.");
    }

    System.out.println("----- 2번 주의 사항 -----");

    score = 85;
    if (score >= 90) {
      System.out.println("나의 점수는 " + score + "점이고, A 등급입니다.");
    }

    if (score >= 80) {
      System.out.println("나의 점수는 " + score + "점이고, B 등급입니다.");
    }

    if (score >= 70) {
      System.out.println("나의 점수는 " + score + "점이고, C 등급입니다.");
    }

    if (score >= 60) {
      System.out.println("나의 점수는 " + score + "점이고, D 등급입니다.");
    }

    if (score < 60) {
      System.out.println("나의 점수는 " + score + "점이고, F 등급입니다.");
    }

  }
}















