public class WhileEx {

  public static void main(String[] args) {

    System.out.println("\n ----- while 문 -----\n");
//    while : for 문과 같은 기능을 하는 반복문
//    가장 기초적인 형태의 반복문
//    조건식의 결과가 true 이면 코드 블럭의 내용을 반복 실행함
//    초기화 변수가 while 문 밖에 존재함
//    증감식은 while 문의 코드 블럭 안에 존재함
//    사용법 :
//    초기화 변수 선언;
//    while (반복 조건식) {
//      반복 실행할 소스코드 ... ;
//      증감식;
//    }
    
//    주의사항
//    1. 증감식의 위치가 코드 블럭 안에 존재하기 때문에 증감식의 위치에 따라서 while 문의 결과가 달라짐
//    2. 초기화 변수의 초기값을 반드시 설정하고 사용
//      초기화 변수가 while 문 밖에 존재하기 때문에 다른 곳에서 해당 초기화 변수를 사용할 수 있음
//    3. while 문에 대한 탈출 조건을 반드시 입력해야 함(무한 루프 발생)
//      증감식이 while 문의 코드 블럭에 있기 때문에 생략하는 경우가 종종 발생함

//    while 문에서 사용할 초기화 변수 선언
    int count = 0;

//    while 문에서 사용하는 조건식 선언
    while (count < 10) {
//      while 문 조건식의 결과가 true 일 경우 실행할 소스코드
      System.out.println("count : " + count);
//      while 문의 증감식
      count++;
    }

    System.out.println();

    int i = 1;
    int total = 0;

    while (i < 11) {
      total = total + i;
      System.out.println("i : " + i + ", total : " + total);

      i++;
    }

    System.out.println("\n ----- while 문 주의사항 1 -----\n");

    int j = 0;

    while (j < 10) {
//      코드 블럭의 내용을 실행하기 전에 초기화 변수의 값을 증가
//      j++;
      System.out.println(j + "부터 9까지의 숫자를 출력하는 반복문");
//      코드 블럭의 내용을 실행하는 도중에 초기화 변수의 값을 증가
//      j++;
      System.out.println("현재 j의 값 : " + j + "\n");
//      코드 블럭의 내용을 모두 실행한 후 초기화 변수의 값을 증가
      j++;
    }

    System.out.println("\n ----- while 문 주의사항 2 -----\n");

//    while 문 외부에 선언된 초기화 변수
//    다른 while 문에서 해당 초기화 변수를 사용할 수 있음
    int k = 0;

    System.out.println("-----첫번째 while 문-----");
    while (k < 10) {
      System.out.println("현재 k의 값 : " + k);
      k++;
    }

//    위에서 초기화변수 k 값을 사용했으므로 다른 while 문에서 해당 초기화변수 k를 사용하려면 k 의 값을 초기화 해줘야 함
    k = 0; // 다시 k 의 값을 0 으로 수정
    System.out.println("-----두번째 while 문-----");
    while (k < 10) {
      System.out.println("두번째 while 문의 k 값 : " + k);
      k++;
    }

    System.out.println("\n ----- while 문 주의사항 3 -----\n");

    int l = 0;

    while (l < 10) {
      System.out.println("l : " + l);
//      증감식을 생략할 경우 while 문은 무한루프에 빠짐
      l++;
    }

    System.out.println();

    l = 0;

//    반복문의 조건식에 true 만 입력하면 조건식의 결과값이 언제나 true 임
    while (true) {
      l++;
      System.out.println("l : " + l);

      if (l >= 10) {
        System.out.println("if 문을 사용한 while 문 종료");
        break;
      }
    }

    System.out.println("\n ----- do ~ while 문 ------ \n");
//    do ~ while : 기본적으로 while 문과 동일한 반복문
//    do ~ while 문은 while 문과 달리 반복 조건을 나중에 확인함
//    do ~ while 문은 반복 조건의 결과값이 false 가 되더라도, 무조건 1번은 실행하는 while 문
//    while 문은 반복 조건의 결과값이 처음부터 false 일 경우 while 문을 한번도 실행하지 않을 수 있음
//    do ~ while 문은 반복 조건의 결과값 확인을 do ~ while 문은 1회 실행 후 확인하기 때문에 반복 조건의 결과값이 처음부터 false 일 경우라도 해당 do ~ while 문을 최소한 1번은 실행함

    System.out.println("----- 기존 while 문 -----");
    int m = 0; // 초기화 변수 선언
//    while 문 선언
    while (m < 5) {
      System.out.println("m : " + m);
      m++;
    }

    System.out.println("----- do ~ while 문 -----");
    int n = 0;
    do {
      System.out.println("n : " + n);
      n++;
    } while (n < 5);
  }
}















