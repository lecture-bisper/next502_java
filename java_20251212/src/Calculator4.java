public class Calculator4 {

//  메소드 오버로딩
//  동일한 이름의 메소드를 여러개 선언하는 것
//  매개변수의 개수, 타입, 순서가 다르면 오버로딩이 가능함
  double areaRectangle(double width) {
    return width * width;
  }

//  매개변수의 개수는 같으나 데이터 타입이 다름
  int areaRectangle(int width) {
    return width * width;
  }

//  매개변수의 개수가 다름
  double areaRectangle(double width, double height) {
    return width * height;
  }

//  매개변수의 타입이 다름
  double areaRectangle(double width, int height) {
    return width * height;
  }

//  매개변수의 개수는 같고, 매개변수 타입의 순서가 다름
  double areaRectangle(int width, double height) {
    return width * height;
  }
}















