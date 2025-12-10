public class ArrayEx {

  public static void main(String[] args) {

//    배열 : 하나의 변수명으로 동일한 데이터 타입의 데이터 여러개를 저장할 수 있는 데이터 타입
//    한번 생성된 배열은 배열의 크기를 변경할 수 없음
//    [] 기호를 사용, index 를 사용하여 원하는 위치의 데이터를 사용
//    index 는 0부터 시작

//    사용법(선언) : 데이터타입[] 배열명 = new 데이터타입[];
//    사용법(사용) :
//    배열명[index] = 데이터;  // 데이터 저장
//    배열명[index];  // 저장된 데이터 출력

//    1번 방식으로 선언
//    배열 선언과 동시에 데이터 입력
//    {} 안에 동일한 데이터 타입의 데이터를 여러개 입력
//    데이터의 구분은 , 를 사용
//    {} 안의 데이터 수가 해당 배열의 크기가 됨
    int[] array1 = {10, 20, 30};
    System.out.println(array1);
    System.out.println(array1[0]);
    System.out.println(array1[1]);
    System.out.println(array1[2]);

    System.out.println();

//    [] 를 배열명 뒤에 쓰는 방식
//    선언방식만 다르고 사용방식은 동일함
    int array11[] = {10, 20, 30};
    System.out.println(array11);
    System.out.println(array11[0]);
    System.out.println(array11[1]);
    System.out.println(array11[2]);

    System.out.println();

    int a = 10;
    int b;
    b = 20;

//    2번 방식으로 선언
//    배열을 먼저 선언만 진행하고, 필요한 시기에 데이터를 저장하여 사용
//    나중에 배열 초기화 시 반드시 new 키워드와 데이터 타입을 설정해야 함
//    나중에 배열 초기화 시 {데이터1, 데이터2, ... } 만 사용하는 것은 불가능
//    배열을 선언 시에는 크기가 설정되지 않음(배열의 이름만 메모리에 등록)
//    new 키워드로 실제로 배열 생성 시 배열의 크기가 결정 됨
    int[] array2;
    array2 = new int[]{10, 20, 30};
    System.out.println(array2);
    System.out.println(array2[0]);
    System.out.println(array2[1]);
    System.out.println(array2[2]);

    System.out.println();

//    3번 방식으로 선언
//    배열을 선언과 동시에 크기 설정(배열이 실제로 메모리에 생성됨)
//    배열이 생성은 되었지만 데이터는 없음, 기본값으로 초기화 됨
//    설정된 크기의 배열에 데이터만 저장하거나 꺼내서 사용할 수 있음
    int[] array3 = new int[3];
    System.out.println(array3);
    System.out.println(array3[0]);
    System.out.println(array3[1]);
    System.out.println(array3[2]);

    System.out.println();

//    4번 방식으로 선언
//    배열을 먼저 선언만 진행하고, 나중에 필요한 시점에 배열의 생성
//    데이터는 입력하지 않고, 배열의 크기만 설정하여 생성
//    배열 생성 시 기본값을 초기화 함
    int[] array4;
    array4 = new int[3];
    System.out.println(array4);
    System.out.println(array4[0]);
    System.out.println(array4[1]);
    System.out.println(array4[2]);

    System.out.println("\n ----- 배열 사용 -----\n");

//    배열의 지정한 index 위치에 저장된 데이터를 출력
    System.out.println("배열 내용 출력 array1[0] : " + array1[0]);
    System.out.println("배열 내용 출력 array2[1] : " + array2[1]);
    System.out.println("배열 내용 출력 array3[2] : " + array3[2]);

//    배열의 지정한 index 위치에 데이터를 저장
    array3[2] = 300;
    System.out.println("배열에 데이터 입력 후 출력 array3[2] : " + array3[2]);

//    배열 array3 의 크기가 3 이므로 마지막 index 가 2 인데, 존재하지 않는 index 10 접근하여 오류가 발생
//    System.out.println("배열의 최대 크기를 넘어가는 위치의 데이터 호출 array3[10] : " + array3[10]);


    System.out.println("\n ----- 여러가지 타입의 배열 -----\n");

//    .length : 배열의 길이를 출력하는 명령어, 읽기 전용
//    정수로 배열의 길이를 출력
//    주로 제어문 및 반복문에서 사용함

//    사용법 : 배열명.length;
    int[] arr1 = new int[3]; // 빈 배열 생성
    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    arr1[0] = 100;
    arr1[1] = 200;
    arr1[2] = 300;
    for (int i = 0; i < 3; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    System.out.println();

//    double 타입의 배열 생성, 초기값이 0.0
    double[] arr2 = new double[3];
    for (int i = 0; i < 3; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    arr2[0] = 0.1;
    arr2[1] = 0.2;
    arr2[2] = 0.3;
    for (int i = 0; i < 3; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    System.out.println();

//    String 타입의 배열 생성, 참조 타입은 초기값이 null
    String[] arr3 = new String[3];
    for (int i = 0; i < 3; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }

    arr3[0] = "1월";
    arr3[1] = "2월";
    arr3[2] = "3월";
    for (int i = 0; i < 3; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }

    System.out.println();

//    boolean 타입의 배열 생성, 초기값 false
    boolean[] arr4 = new boolean[2];
    for (int i = 0; i < 2; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }

    arr4[0] = true;
    arr4[1] = true;
    for (int i = 0; i < 2; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }

  }
}















