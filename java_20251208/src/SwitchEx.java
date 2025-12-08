import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class SwitchEx {

  public static void main(String[] args) {

    int num = (int)(Math.random() * 6) + 1;

//    switch ~ case : 자바에서 제공하는 if 문과 같은 역할을 하는 조건문
//    switch 문의 조건값에 변수나 값을 입력하고, switch 문 안의 case 에 해당하는지 확인 후 일치하는 case 의 소스코드를 실행
//    case 와 일치하는 것이 없을 경우 default 의 소스코드를 실행함
//    default 는 if 문의 else 문과 동일한 역할이며 생략 가능함
//    조건 변수 및 값으로 사용할 데이터 타입은 모든 데이터 타입을 지원함
    
//    break : switch ~ case 문과 반복문에서 사용되는 명령어로 해당 명령을 만나면 해당 제어문 및 반복문을 즉시 종료 함
    switch (num) {
      case 1:
        System.out.println("주사위에서 1이 나왔습니다");
        break;

      case 2:
        System.out.println("주사위에서 2가 나왔습니다");
        break;

      case 3:
        System.out.println("주사위에서 3이 나왔습니다");
        break;

      case 4:
        System.out.println("주사위에서 4가 나왔습니다");
        break;

      case 5:
        System.out.println("주사위에서 5가 나왔습니다");
        break;

      default:
        System.out.println("주사위에서 6이 나왔습니다");
        break;
    }

    System.out.println("\n ----- 문자 비교 -----\n");

    Scanner sc = new Scanner(System.in);
    System.out.print("등급을 입력하세요(A | B) : ");
    char grade = sc.next().charAt(0);

//    break 문을 생략하면 break 문을 만날때까지 모든 case 문을 순서대로 계속 실행
    switch (grade) {
      case 'A':
      case 'a':
        System.out.println("우수 회원입니다.");
        break;

      case 'B':
      case 'b':
        System.out.println("일반 회원입니다.");
        break;

      default:
        System.out.println("손님입니다.");
        break;
    }

    System.out.println("\n----- 문자열 비교 -----\n");

    System.out.print("직급을 입력하세요 : ");
    String position = sc.next();

//    switch ~ case 를 통한 문자열 비교 시 equals() 메소드가 필요없음
    switch (position) {
      case "부장":
        System.out.println("700만원");
        break;

      case "차장":
        System.out.println("600만원");
        break;

      case "과장":
        System.out.println("500만원");
        break;

      case "대리" :
        System.out.println("400만원");
        break;

      default:
        System.out.println("300만원");
        break;
    }
    
//    switch ~ case 문 대신 if 문 사용하기
//    switch ~ case 문은 if, if ~ else, else if 문으로 100% 대체가 가능함
    
//    switch ~ case 문과 if 문의 차이점
//    switch ~ case 문은 정해져 있는 값을 비교할 경우 주로 사용함, 값에 대한 비교
//    if 문은 값의 범위에 대해서 비교할 경우 주로 사용, 범위를 기준으로 비교

//    LocalDate : 자바에서 제공하는 현재 지역을 기준으로 한 날짜 관련 클래스
    LocalDate date = LocalDate.of(2025, 12, 25);
//    DayOfWeek : 날짜를 기반으로 지정한 날짜의 요일을 출력하는 클래스
//    getDayOfWeek() : 지정한 날짜에서 요일을 가져옴
    DayOfWeek dayOfWeek = date.getDayOfWeek();
//    getValue() : 요일 정보를 정수로 가져옴, 1 ~ 7(1 : 월, 2 : 화, 7 : 일)
    int dayOfWeekNumber = dayOfWeek.getValue();

    switch (dayOfWeekNumber) {
      case 1:
        System.out.println("월요일 입니다.");
        break;

      case 2:
        System.out.println("화요일 입니다.");
        break;

      case 3:
        System.out.println("수요일 입니다.");
        break;

      case 4:
        System.out.println("목요일 입니다.");
        break;

      case 5:
        System.out.println("금요일 입니다.");
        break;

      default:
        System.out.println("주말입니다.");
        break;
    }

    System.out.println("\n ----- switch ~ case 문을 if 문으로 변경 -----\n");

    if (dayOfWeekNumber == 1) {
      System.out.println("월요일 입니다.");
    }
    else if (dayOfWeekNumber == 2) {
      System.out.println("화요일 입니다.");
    }
    else if (dayOfWeekNumber == 3) {
      System.out.println("수요일 입니다.");
    }
    else if (dayOfWeekNumber == 4) {
      System.out.println("목요일 입니다.");
    }
    else if (dayOfWeekNumber == 5) {
      System.out.println("금요일 입니다.");
    }
//    else if (dayOfWeekNumber > 5 && dayOfWeekNumber < 8) {
//      System.out.println("주말 입니다.");
//    }
    else {
      System.out.println("주말 입니다.");
    }

  }
}















