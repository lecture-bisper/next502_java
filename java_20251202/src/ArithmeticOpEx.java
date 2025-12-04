public class ArithmeticOpEx {

  public static void main(String[] args) {

    int v1 = 10;
    int v2 = 3;

//    산술 연산자 사용
    int result1 = v1 + v2;
    System.out.println("result1 : " + result1);

    int result2 = v1 - v2;
    System.out.println("result2 : " + result2);

    int result3 = v1 * v2;
    System.out.println("result3 : " + result3);

//    10 / 3 이지만 정수 / 정수 이기 때문에 소수점 자리는 제외
    int result4 = v1 / v2;
    System.out.println("result4 : " + result4);

//    나머지 연산자 % : 값을 나누고 난 후의 몫이 아닌 나머지를 가져오는 연산자
    int result5 = v1 % v2;
    System.out.println("result5 : " + result5);

//    int 타입의 변수 v1 을 강제 타입 변환을 통해서 double 타입으로 변환
//    10.0 / 3 이 되므로 연산 시 자동 타입 변환을 통해 10.0 / 3.0 이 됨
    double result6 = (double)v1 / v2;
    System.out.println("result6 : " + result6);
  }
}















