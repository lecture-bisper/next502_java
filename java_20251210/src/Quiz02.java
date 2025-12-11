import java.util.Scanner;

public class Quiz02 {

  public static void main(String[] args) {
//    키보드 입력 : Scanner sc = new Scanner(System.in);
//    랜덤 숫자 발생 : int rnd = (int)(Math.random() * 랜덤숫자최대값) + 1;

    Scanner sc = new Scanner(System.in); // 사용자 키보드 입력을 위한 객체

//    문제 1) int 타입의 배열을 선언하고, 사용자 입력으로 정수 5개를 입력 후 모두 출력하는 프로그램을 작성하세요
    System.out.println("----- 문제 1 -----");
    int[] iArr01 = {10, 20, 30, 40, 50};
//    int[] iArr01 = new int[]{10, 20, 30, 40, 50};
//    int[] iArr01 = new int[5];
    for (int i = 0; i < iArr01.length; i++) {
      System.out.println("iArr01[" + i + "] : " + iArr01[i]);
    }


//    문제 2) int 타입의 배열(크기 10)을 선언하고 1 ~ 10 까지의 데이터를 모두 입력 후 다시 출력하는 프로그램을 작성하세요
//    for 문을 사용하여 데이터 출력
    System.out.println("\n----- 문제 2 -----");
    int[] iArr02 = new int[10];
    iArr02[0] = 1;
    iArr02[1] = 2;
    iArr02[2] = 3;
    iArr02[3] = 4;
    iArr02[4] = 5;
    iArr02[5] = 6;
    iArr02[6] = 7;
    iArr02[7] = 8;
    iArr02[8] = 9;
    iArr02[9] = 10;

    for (int i = 0; i < iArr02.length; i++) {
      System.out.println("iArr02[" + i + "] : " + iArr02[i]);
    }

//    문제 3) 1 ~ 10 까지의 데이터가 저장된 배열을 사용하여 1 ~ 10 까지의 데이터의 총합을 구하는 프로그램을 작성하세요
//    for 문을 사용
    System.out.println("\n----- 문제 3 -----");
    int[] iArr03; // 배열을 선언만 진행
    iArr03 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 필요한 부분에서 데이터 저장

    int total = 0; // 배열의 요소 총합을 저장할 변수
    for (int i = 0; i < iArr03.length; i++) {
      total = total + iArr03[i];
      System.out.println("iArr03[" + i + "] : " + iArr03[i] + ", total : " + total);
    }
    System.out.println("배열 iArr03 모든 요소의 총합 : " + total);

//    문제 4) 사용자 입력을 받아 배열에 5개의 정수를 입력하고, 해당 배열의 내용을 모두 출력하는 프로그램을 작성하세요
//    for 문 사용
    System.out.println("\n----- 문제 4 -----");
    int[] iArr04 = new int[5]; // 사용자 입력 데이터를 저장할 배열 선언

//    사용자 입력 정보를 반복문을 이용하여 연속으로 입력 받음
    for (int i = 0; i < iArr04.length; i++) {
      System.out.print((i + 1) + "번째 정수를 입력해주세요 : ");
      iArr04[i] = sc.nextInt();
    }

//    배열의 내용 모두 출력
    for (int i = 0; i < iArr04.length; i++) {
      System.out.println("iArr04[" + i + "] : " + iArr04[i]);
    }

//    문제 5) 1 ~ 50 까지의 임의의 숫자를 10 개 발생 시킨 후 해당 숫자를 모두 배열에 저장 후 짝수만 모두 출력하는 프로그램을 작성하세요
    System.out.println("\n----- 문제 5 -----");
    int[] iArr05 = new int[10];

//    배열의 크기만큼 1 ~ 50 까지의 랜덤 숫자를 발생 시키고 배열에 저장
    for (int i = 0; i < iArr05.length; i++) {
//      int rnd = (int)(Math.random() * 50) + 1;
//      iArr05[i] = rnd;
      iArr05[i] = (int)(Math.random() * 50) + 1;
    }

    System.out.println("**배열에 저장된 데이터 중 짝수만 출력**");
    for (int i = 0; i < iArr05.length; i++) {
//      배열에 저장된 데이터를 2로 나눈 나머지가 0인지 확인
      if (iArr05[i] % 2 == 0) {
        System.out.println("iArr05[" + i + "] : " + iArr05[i]);
      }
    }

//    문제 6) 1 ~ 20 까지의 임의의 숫자를 10개 발생 시킨 후 배열에 저장하고, 추가로 사용자가 입력한 숫자와 동일한 숫자가 배열에 몇개 존재 하는지 출력하는 프로그램을 작성하세요
    System.out.println("\n----- 문제 6 -----");
    int[] iArr06 = new int[10];

    System.out.print("1 ~ 20 까지의 숫자 중 하나를 입력하세요 : ");
    int userNumber = sc.nextInt();
    int count = 0;

//    배열의 크기만큼 1 ~ 20까지의 숫자를 랜덤 발생시킨 후 배열에 저장
    for (int i = 0; i < iArr06.length; i++) {
      iArr06[i] = (int)(Math.random() * 20) + 1;
    }

//    배열의 요소를 순서대로 모두 확인하여 사용자가 입력한 데이터와 같은 데이터가 몇개 있는지 확인
    for (int i = 0; i < iArr06.length; i++) {
      if (userNumber == iArr06[i]) {
        count++;
      }
    }

    System.out.println("배열 iArr06 에 저장된 데이터 중 사용자가 입력한 숫자 " + userNumber + "와 동일한 숫자의 수는 " + count + "개 입니다.");

//    문제 7) 크기가 5인 2개의 배열의 생성하고, 임의의 숫자를 5개 생성 후 첫번째 배열에 저장하고, 두번째 배열에는 첫번째 배열의 반대 순서로 데이터를 저장후 첫번째 배열과 두번째 배열의 내용을 모두 출력하는 프로그램을 작성하세요
    System.out.println("\n----- 문제 7 -----");
    int[] iArr71 = new int[5];
    int[] iArr72 = new int[5];

//    1 ~ 20까지의 랜덤 숫자를 배열 iArr71 에 저장
    for (int i = 0; i < iArr71.length; i++) {
      iArr71[i] = (int)(Math.random() * 20) + 1;
    }

//    배열 iArr71 에 저장된 데이터를 거꾸로 출력
    for (int i = 0 ; i< iArr71.length; i++) {
      iArr72[i] = iArr71[iArr71.length - 1 - i];
    }

//    배열 iArr71, iArr72 의 내용을 모두 출력
    for (int i = 0; i < iArr71.length; i++) {
      System.out.println("iArr71[" + i + "] : " + iArr71[i] + ", iArr72[" + i + "] : " + iArr72[i]);
    }

//    문제 8) 1 ~ 50 까지의 임의의 숫자 10개를 배열에 저장 후 배열의 평균값을 구하고, 해당 평균값보다 큰 숫자만 출력하는 프로그램을 작성하세요
    System.out.println("\n----- 문제 8 -----");
    int[] iArr08 = new int[10];
    int sum = 0; // 총합을 저장할 변수
    int avg = 0; // 평균값을 저장할 변수

//    배열에 랜덤 숫자 10개 입력 및 총합 계산
    for (int i = 0; i < iArr08.length; i++) {
      iArr08[i] = (int)(Math.random() * 50) + 1;
      sum = sum + iArr08[i];
    }

    avg = sum / iArr08.length; // 평균

    System.out.println("배열에 저장된 데이터의 평균 : " + avg);
    System.out.println("평균보다 큰 값 출력");
    for (int i = 0; i < iArr08.length; i++) {
      if (iArr08[i] > avg) { // 평균보다 큰 숫자만 출력
        System.out.println("iArr08[" + i + "] : " + iArr08[i]);
      }
    }
  }
}















