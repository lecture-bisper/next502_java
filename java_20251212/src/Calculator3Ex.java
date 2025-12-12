public class Calculator3Ex {

  public static void main(String[] args) {

    Calculator3 cal = new Calculator3();

    cal.sum1(); // 1번 방식으로 된 메소드 호출
    cal.sum2(10, 200); // 2번 방식으로 된 메소드 호출
    int result = cal.sum3(); // 3번 방식으로 된 메소드 호출
    System.out.println("두 수의 덧셈은 : " + result * 2);
    result = cal.sum4(10, 20); // 4번 방식으로 된 메소드 호출
    System.out.println("두 수의 덧셈은 : " + result / 3);
  }
}















