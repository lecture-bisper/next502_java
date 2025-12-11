import java.util.Arrays;

public class ArrayCopyEx {

  public static void main(String[] args) {
//    얕은복사 : 참조 타입을 = 연산자를 사용하여 복사
//      참조 타입은 주소를 저장하고 있기 때문에 = 연산자를 사용하여 복사 시 주소가 복사 됨
//      원본 및 사본의 내용을 수정하면 같은 주소를 가지고 있는 원본 및 사본의 내용도 함께 수정
//    깊은복사 : 전용 명령어를 사용하여 주소가 아닌 실제 데이터를 복사
//      원본과 사본의 내용을 별개로 나누어짐
    System.out.println("----- 배열의 얕은 복사 -----");

    int[] iArr01 = {10, 20, 30}; // 선언과 동시에 데이터 입력
    int[] iArr02 = new int[3]; // 기본값으로 초기화

    System.out.println("원본 배열 내용");
    for (int i = 0; i < iArr01.length; i++) {
      System.out.println("iArr01[" + i + "] : " + iArr01[i] + ", iArr02[" + i + "] : " + iArr02[i]);
    }

    System.out.println("\n = 연산자로 배열 복사 ");

    iArr02 = iArr01;

    System.out.println("\n복사 후  배열 내용");
    for (int i = 0; i < iArr01.length; i++) {
      System.out.println("iArr01[" + i + "] : " + iArr01[i] + ", iArr02[" + i + "] : " + iArr02[i]);
    }

    System.out.println("\n 사본 배열의 내용 수정 ");

    iArr02[0] = 100;
    iArr02[1] = 200;
    iArr02[2] = 300;

    System.out.println("\n 수정 후 배열 내용");
    for (int i = 0; i < iArr01.length; i++) {
      System.out.println("iArr01[" + i + "] : " + iArr01[i] + ", iArr02[" + i + "] : " + iArr02[i]);
    }

    System.out.println("\n----- 배열의 깊은 복사 -----");
//    자바에서 배열의 깊은 복사 방법은 여러가지가 존재함
//    1. 반복문을 사용하여 원본 배열의 데이터를 출력하여 사본 배열에 저장
//    2. System.arraycopy() 메소드를 사용
//    3. Object.clone() 메소드를 사용
//    4. Arrays.copyOf() 메소드를 사용

    System.out.println("\n----- 반복문으로 복사 -----");

    int[] iArr03 = {10, 20, 30};
    int[] iArr04 = new int[3];

    System.out.println("원본 배열 내용");
    for (int i = 0; i < iArr03.length; i++) {
      System.out.println("iArr03[" + i + "] : " + iArr03[i] + ", iArr04[" + i + "] : " + iArr04[i]);
    }

    System.out.println("\n 복사");

    for (int i = 0; i < iArr03.length; i++) {
      iArr04[i] = iArr03[i];
    }

    System.out.println("\n반복문으로 복사 후 배열 내용");
    for (int i = 0; i < iArr03.length; i++) {
      System.out.println("iArr03[" + i + "] : " + iArr03[i] + ", iArr04[" + i + "] : " + iArr04[i]);
    }

    System.out.println("\n 사본 내용 수정");

    iArr04[0] = 100;
    iArr04[1] = 200;
    iArr04[2] = 300;

    System.out.println("\n사본 수정 후 배열 내용");
    for (int i = 0; i < iArr03.length; i++) {
      System.out.println("iArr03[" + i + "] : " + iArr03[i] + ", iArr04[" + i + "] : " + iArr04[i]);
    }

    System.out.println("\n----- System.arraycopy(), Object.clone(), Arrays.copyOf() 사용 -----");
//    System.arraycopy() : 자바 기본 라이브러리에서 제공하는 System 클래스의 배열 복사 메소드
//    사용법 : System.arraycopy(원본배열명, 위치, 사본배열명, 복사할 위치, 복사할 길이);

//    Object.clone() : 자바의 최상위 클래스인 Object 클래스에서 제공하는 메소드
//    원래 배열을 복사하기 위한 명령은 아니며 객체를 복사하기 위한 명령
//    사용법 : 데이터타입 사본배열명 = 원본배열명.clone();

//    Arrays.copyOf() : 자바의 배열에 관련된 기능을 모아둔 Arrays 클래스에 제공하는 배열 복사 명령
//    copyOf(), copyOfRange() 가 존재함
//    copyOf() 는 원본 배열의 시작 위치부터 원하는 길이로 복사함
//    copyOfRange() : 원본 배열에서 원하는 위치부터 원하는 길이로 복사함
//    사용법:
//      데이터타입 사본배열명 = Arrays.copyOf(원본배열명, 복사할 길이);
//      데이터타입 사본배열명 = Arrays.copyOfRange(원본배열명, 복사시작위치, 복사종료위치);

    int[] iArr05 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int[] iArrArrayCopy = new int[10];
    int[] iArrClone = new int[10];
    int[] iArrCopyOf = new int[10];

    System.out.println("\n원본 배열 내용");
    for (int i = 0; i < iArr05.length; i++) {
      System.out.println("원본[" + i + "] : " + iArr05[i] + ", ArrayCopy[" + i + "] : " + iArrArrayCopy[i] + ", Clone[" + i + "] : " + iArrClone[i] + ", CopyOf[" + i + "] : " + iArrCopyOf[i]);
    }

    System.out.println("\n 배열 복사");

    System.arraycopy(iArr05, 0, iArrArrayCopy, 0, 10);
    iArrClone = iArr05.clone();
    iArrCopyOf = Arrays.copyOf(iArr05, 10);

    System.out.println("\n복사 후 배열 내용");
    for (int i = 0; i < iArr05.length; i++) {
      System.out.println("원본[" + i + "] : " + iArr05[i] + ", ArrayCopy[" + i + "] : " + iArrArrayCopy[i] + ", Clone[" + i + "] : " + iArrClone[i] + ", CopyOf[" + i + "] : " + iArrCopyOf[i]);
    }

    System.out.println("\n복사한 배열 수정");

    iArrArrayCopy[0] = 100;
    iArrArrayCopy[5] = 600;
    iArrArrayCopy[9] = 1000;
    iArrClone[0] = 1000;
    iArrClone[5] = 6000;
    iArrClone[9] = 10000;
    iArrCopyOf[0] = 10000;
    iArrCopyOf[5] = 60000;
    iArrCopyOf[9] = 100000;

    System.out.println("\n수정 후 배열 내용");
    for (int i = 0; i < iArr05.length; i++) {
      System.out.println("원본[" + i + "] : " + iArr05[i] + ", ArrayCopy[" + i + "] : " + iArrArrayCopy[i] + ", Clone[" + i + "] : " + iArrClone[i] + ", CopyOf[" + i + "] : " + iArrCopyOf[i]);
    }

    System.out.println();

    iArr05 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    iArrArrayCopy = new int[10];
    int[] iArrCopyOfRange = new int[10];

    System.out.println("\n원본 배열 내용");
    for (int i = 0; i < iArr05.length; i++) {
      System.out.println("원본[" + i + "] : " + iArr05[i] + ", ArrayCopy[" + i + "] : " + iArrArrayCopy[i] + ", CopyOfRange[" + i + "] : " + iArrCopyOfRange[i]);
    }

    System.out.println("\n 일부만 복사");

    System.arraycopy(iArr05, 0, iArrArrayCopy, 4, 3);
    iArrCopyOfRange = Arrays.copyOfRange(iArr05, 5, 7);

    System.out.println("\n복사 후 배열 내용");
    for (int i = 0; i < iArr05.length; i++) {
      System.out.println("원본[" + i + "] : " + iArr05[i]);
    }
    System.out.println();

    for (int i = 0; i < iArrArrayCopy.length; i++) {
      System.out.println("ArrayCopy[" + i + "] : " + iArrArrayCopy[i]);
    }
    System.out.println();

    for (int i = 0; i < iArrCopyOfRange.length; i++) {
      System.out.println("CopyOfRange[" + i + "] : " + iArrCopyOfRange[i]);
    }
    System.out.println();


    System.out.println("\n----- 향상된 for 문 -----\n");

//    향상된 for 문 : 일반 for 문은 지정한 배열의 전체 내용을 출력하려면 index 를 0부터 시작해야 하지만, 향상된 for 문은 항상 배열의 모든 내용을 순서대로 출력
//    사용법 :
//    for (데이터타입 변수명 : 배열명) {
//        반복 실행할 소스코드 ..., 변수명 ;
//    }

    iArr05 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

//    기존의 for 문을 사용하여 배열의 모든 내용 출력
    for (int i = 0; i < iArr05.length; i++) {
      System.out.println(iArr05[i]);
    }

    System.out.println();

//    향상된 for 문을 사용하여 배열의 모든 내용 출력
    for (int item : iArr05) {
      System.out.println(item);
    }
  }
}















