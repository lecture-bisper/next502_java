public class LogicalOpEx {

  public static void main(String[] args) {

//    논리 연산자
//    논리 부정 연산자 : ! 기호 사용, 입력받은 boolean 값을 반대로 출력
//    논리곱 연산자 : && 기호 사용, 양쪽의 결과값이 모두 true 일 경우 전체 출력이 true 가 되는 연산자, false 가 하나라도 있으면 전체가 false
//    논리합 연산자 : || 기호 사용, 양쪽의 결과 중 하나라도 true 일 경우 전체 출력이 true 가 되는 연산자, 양쪽 모두 false 결우 전체가 false

    System.out.println("----- 논리 부정 연산자( ! ) -----");

    boolean bVal1 = true;
    System.out.println("bVal1 = " + bVal1);
    System.out.println("!bVal1 = " + !bVal1);

    System.out.println("\n----- 논리 곱 연산자 ( && ) -----");

//    int 타입 변수에 char 타입의 문자 A (정수로 65) 를 저장
    int charCode = 'b';

    if ((charCode >= 65) && (charCode <= 90)) {
      System.out.println("charCode 는 대문자 입니다.");
    }

    if ((charCode >= 97) && (charCode <= 122)) {
      System.out.println("charCode 는 소문자 입니다.");
    }

    if (!(charCode < 48) && !(charCode > 57)) {
      System.out.println("charCode 는 0 ~ 9 까지의 숫자 입니다.");
    }

    System.out.println("\n----- 논리 합 연산자 ( || ) -----");
    int iVal = 8;
    if ((iVal % 2 == 0) || (iVal % 3 == 0)) {
      System.out.println("iVal 은 2 또는 3의 배수 입니다.");
    }


    System.out.println("\n ----- 대입 연산자 ( =, += ) -----");
    
//    대입 연산자 : 연산된 결과를 변수에 저장하기 위한 연산자
//    연산의 반향이 오른쪽에서 왼쪽으로 수행되고 우선 순위가 가장 낮음
//    복합 대입 연산자 : 기본 대입 연산자와 산술 연산자가 합쳐진 대입 연산자
//    += 만 사용함

    int num1 = 10;
    int result = num1 + 10;
    System.out.println("num1 에 대입 연산자 = 을 사용하여 정수 10을 저장 : " + num1);
    System.out.println("result 에 num1 + 10 의 결과를 대입 연산자를 사용하여 저장 : " + result);

    num1 = num1 + 1;
    System.out.println("일반 대입 연산자로 num1 의 값 1 증가 : " + num1);
    num1 += 1;
    System.out.println("복합 대입 연산자 += 로 num1 의 값 1 증가 : " + num1);
    num1 = num1 - 1;
    System.out.println("일반 대입 연산자로 num1 의 값 1 감소 : " + num1);
    num1 -= 1;
    System.out.println("복합 대입 연산자 -= 로 num1 의 값 1 감소 : " + num1);
    num1 = num1 * 2;
    System.out.println("일반 대입 연산자로 num1 와 정수 2의 곱셈 : " + num1);
    num1 *= 2;
    System.out.println("복합 대입 연산자 *= 로 num1 과 정수 2의 곱셈: " + num1);
    num1 = num1 / 2;
    System.out.println("일반 대입 연산자로 num1 을 정수 2의 나눗셈 : " + num1);
    num1 /= 2;
    System.out.println("복합 대입 연산자 /= 로 num1 을 정수 2의 나눗셈: " + num1);
    num1 = num1 % 3;
    System.out.println("일반 대입 연산자로 num1 을 정수 3으로 나머지 연산 : " + num1);
    num1 %= 3;
    System.out.println("복합 대입 연산자 %= 로 num1 을 정수 3으로 나머지 연산 : " + num1);

  }
}















