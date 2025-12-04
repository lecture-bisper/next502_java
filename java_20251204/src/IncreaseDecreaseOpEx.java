public class IncreaseDecreaseOpEx {

  public static void main(String[] args) {

    int x = 10;
    
//    증감 연산자 : ++, -- 기호를 사용하며 변수의 값을 1 증가시키거나 1감소시키는 연산자
//    변수 앞에 위치하거나 뒤에 위치할 수 있음
//    증감 연산자는 무조건 값을 1 증가시키거나 1 감소시킴
//    정수를 저장한 변수에 사용
//    증감 연산자의 위치에 따라서 값을 증가시키거나 감소하는 타이밍이 달라짐

    System.out.println("현재 변수 x 의 값 : " + x);
    x = x + 10;
    System.out.println("x 를 1 증가 후 : " + x);
    x += 1;
    System.out.println("x 를 1 증가 후 : " + x);
    x++;
    System.out.println("x 를 1 증가 후 : " + x);
    ++x;
    System.out.println("x 를 1 증가 후 : " + x);
    --x;
    System.out.println("x 를 1 감소 시킨 후 : " + x);
    x--;
    System.out.println("x 를 1 감소 시킨 후 : " + x);
    x -= 10;
    System.out.println("x 를 1 감소 시킨 후 : " + x);
    x = x - 10;
    System.out.println("x 를 1 감소 시킨 후 : " + x);

    System.out.println("\n----- 증감 연산자의 위치 따른 연산 순서 -----\n");

    x = 10; // 변수에 데이터 저장

    System.out.println("현재 x : " + x); // 저장된 데이터 출력
    System.out.println("x++ 사용 시 x : " + x++);
    System.out.println("++x 사용 시 x : " + ++x);
    System.out.println("증가 종료 후 x : " + x);
    System.out.println("--x 사용 시 x : " + --x);
    System.out.println("x-- 사용 시 x : " + x--);
    System.out.println("감소 종료 후 x : " + x);
  }
}















