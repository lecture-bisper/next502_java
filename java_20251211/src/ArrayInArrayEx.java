public class ArrayInArrayEx {

  public static void main(String[] args) {

    System.out.println("----- 1차원 배열 -----");
    int[] iArr11 = new int[3];
    iArr11[0] = 10;
    iArr11[1] = 20;
    iArr11[2] = 30;

    System.out.println("1차원 배열 iArr11[0] : " + iArr11[0]);
    System.out.println("1차원 배열 iArr11[1] : " + iArr11[1]);
    System.out.println("1차원 배열 iArr11[2] : " + iArr11[2]);

    System.out.println("----- 1차원 배열 선언과 동시에 데이터 입력 -----");

    int[] iArr12 = {10, 20, 30, 40, 50};
    System.out.println("iArr12[0] : " + iArr12[0]);
    System.out.println("iArr12[3] : " + iArr12[3]);

//    배열 : 하나의 변수명으로 동일한 데이터타입의 데이터를 여러개 저장하는 데이터 타입
//    1차원 배열 : 배열의 요소가 데이터 자체인 배열
//    2차원 배열 : 배열의 요소가 1차원 배열인 배열
//    사용법 (선언) :
//      데이터타입[][] 배열명 = new 데이터타입[줄크기][칸크기];
//    사용법 (사용) :
//      배열명[줄번호][칸번호];

//    3차원 배열 : 배열의 요소가 2차원 배열인 배열

//    배열의 요소를 검색하거나 모두 출력하고자 할 경우 반복문을 사용함
//    2차원 배열의 요소를 모두 출력 시 2중 반복문을 사용
//    3차원 배열의 요소를 모두 출력 시 3중 반복문을 사용

    System.out.println("\n ----- 2차원 배열 -----");
    int[][] iArr21 = new int[2][3];
    iArr21[0][0] = 10;
    iArr21[0][1] = 20;
    iArr21[0][2] = 30;
    iArr21[1][0] = 40;
    iArr21[1][1] = 50;
    iArr21[1][2] = 60;

    System.out.println("2차원 배열 iArr21[0][0] : " + iArr21[0][0]);
    System.out.println("2차원 배열 iArr21[0][1] : " + iArr21[0][1]);
    System.out.println("2차원 배열 iArr21[0][2] : " + iArr21[0][2]);
    System.out.println("2차원 배열 iArr21[1][0] : " + iArr21[1][0]);
    System.out.println("2차원 배열 iArr21[1][1] : " + iArr21[1][1]);
    System.out.println("2차원 배열 iArr21[1][2] : " + iArr21[1][2]);

    System.out.println("\n ----- 2차원 배열 선언과 동시에 데이터 입력 -----");

    int[][] iArr22 = {
        { 1,  2,  3,  4,  5},
        { 6,  7,  8,  9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
    };

    System.out.println("2차원 배열 iArr22[1][1] : " + iArr22[1][1]);
    System.out.println("2차원 배열 iArr22[2][3] : " + iArr22[2][3]);
    System.out.println("2차원 배열 iArr22[4][1] : " + iArr22[4][1]);

    System.out.println("----- 반복문으로 2차원 배열 요소 출력 -----");
//    iArr22.length : iArr22 은 2차원 배열, 2차원 배열에서 length 를 사용 시 2차원 배열이 가지고 있는 1차원 배열의 요소 수를 출력
//    iArr22[i].length : 2차원 배열인 iArr22 의 i 번째 index 에 위치한 1차원 배열의 크기를 출력
    for (int i = 0; i < iArr22.length; i++) {
      for (int j = 0; j < iArr22[i].length; j++) {
        System.out.println("2차원 배열 iArr22[" + i + "][" + j + "] : " + iArr22[i][j]);
      }
    }

    System.out.println("\n ----- 3차원 배열 -----");
    int[][][] iArr31 = new int[2][2][2];
    iArr31[0][0][0] = 10;
    iArr31[0][0][1] = 20;
    iArr31[0][1][0] = 30;
    iArr31[0][1][1] = 40;
    iArr31[1][0][0] = 50;
    iArr31[1][0][1] = 60;
    iArr31[1][1][0] = 70;
    iArr31[1][1][1] = 80;
    System.out.println("3차원 배열 iArr31[0][0][0] : " + iArr31[0][0][0]);
    System.out.println("3차원 배열 iArr31[0][0][1] : " + iArr31[0][0][1]);
    System.out.println("3차원 배열 iArr31[0][1][0] : " + iArr31[0][1][0]);
    System.out.println("3차원 배열 iArr31[0][1][1] : " + iArr31[0][1][1]);
    System.out.println("3차원 배열 iArr31[1][0][0] : " + iArr31[1][0][0]);
    System.out.println("3차원 배열 iArr31[1][0][1] : " + iArr31[1][0][1]);
    System.out.println("3차원 배열 iArr31[1][1][0] : " + iArr31[1][1][0]);
    System.out.println("3차원 배열 iArr31[1][1][1] : " + iArr31[1][1][1]);

    System.out.println("\n ----- 3차원 배열 선언과 동시에 데이터 입력 -----");

    int[][][] iArr32 = {
        {
            { 1,  2,  3},
            { 4,  5,  6}
        },
        {
            { 7,  8,  9},
            {10, 11, 12}
        },
        {
            {13, 14, 15},
            {16, 17, 18}
        }
    };

    System.out.println("3차원 배열 iArr32[2][0][1] : " + iArr32[2][0][1]);
    System.out.println("3차원 배열 iArr32[0][1][2] : " + iArr32[0][1][2]);

    System.out.println("----- 반복문으로 3차원 배열 요소 출력 -----");

    for (int i = 0; i < iArr32.length; i++) {
      for (int j = 0; j < iArr32[i].length; j++) {
        for (int k = 0; k < iArr32[i][j].length; k++) {
          System.out.println("iArr32[" + i + "][" + j + "][" + k + "] : " + iArr32[i][j][k]);
        }
      }
    }

  }
}















