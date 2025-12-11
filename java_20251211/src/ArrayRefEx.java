public class ArrayRefEx {

  public static void main(String[] args) {

//    참조 타입 배열 : 참조 타입도 배열에 저장할 수 있음
//    참조 타입 배열은 배열의 요소로 주소를 가지고 있음
//    사용방법은 기본 타입 배열과 동일함

//    참조 타입인 String 클래스 타입의 배열 선언
    String[] strArr01 = new String[3];
    strArr01[0] = "Java"; // 배열의 0 index 에 문자열 저장
    strArr01[1] = "Java";
    strArr01[2] = new String("Java"); // 배열의 2 index 에 new 키워드를 사용하여 문자열 객체를 생성하여 저장

    System.out.println("String 타입 배열 strArr01[0] : " + strArr01[0]);
    System.out.println("String 타입 배열 strArr01[1] : " + strArr01[1]);
    System.out.println("String 타입 배열 strArr01[2] : " + strArr01[2]);

    System.out.println();

//    참조 타입에 비교 연산자 == 를 사용 시 참조 타입 변수에 저장된 메모리 주소를 비교
//    String 타입은 기본 타입처럼 사용 가능, 기본 타입처럼 사용 시 동일한 문자열이 저장되면 힙 메모리 영역에 1개의 문자열만 생성하고, 해당 메모리 주소를 공유
//    strArr01[0] 과 strArr01[1] 에 저장된 메모리 주소가 동일
    System.out.println("strArr01[0] == strArr01[1] 는 " + (strArr01[0] == strArr01[1]));
//    new 키워드를 사용하여 동일한 문자열을 생성했기 때문에 새로운 메모리에 데이터가 저장
//    == 연산자로 주소를 비교하면 서로 다름
    System.out.println("strArr01[0] == strArr01[2] 는 " + (strArr01[0] == strArr01[2]));
//    equals() 는 해당 참조 타입 변수가 저장하고 있는 메모리 주소에 존재하는 문자열 자체를 비교
    System.out.println("strArr01[0].equals(strArr01[1]) 는 " + strArr01[0].equals(strArr01[1]));
    System.out.println("strArr01[0].equals(strArr01[2]) 는 " + strArr01[0].equals(strArr01[2]));

  }
}















