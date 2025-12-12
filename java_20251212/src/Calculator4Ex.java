public class Calculator4Ex {

  public static void main(String[] args) {

    Calculator4 cal = new Calculator4();

    double result1 = cal.areaRectangle(10);
    double result2 = cal.areaRectangle(10, 20.0);
    result2 = cal.areaRectangle(10.0, 20.0);
    result2 = cal.areaRectangle(10.0, 20);

    System.out.println("정사각형의 넓이 : " + result1);
    System.out.println("직사각형의 넓이 : " + result2);
  }
}















