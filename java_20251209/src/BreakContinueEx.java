public class BreakContinueEx {

  public static void main(String[] args) {

  //    break : 반복문과 switch ~ case 문 안에서 사용되는 제어 명령
//    반복문 및 switch ~ case 문 실행 중 break 문을 만나면 즉시 해당 반복문 및 switch 문을 종료
//    continue : break 문과 동일한 형태로 사용되는 제어 명령
//    반복문 실행 중 continue 문을 만나면 현재 실행 중인 루프는 즉지 종료하고, 다음 루프를 실행함
    System.out.println("\n ----- break ----- \n");
    System.out.println("** 5단(for) **");
    for (int i = 1; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println("5 * " + i + " = " + 5 * i);
    }

    System.out.println("** 5단(while) **");
    int x = 0;
    while (x < 10) {
      x++;
      if (x == 5) {
        break;
      }
      System.out.println("5 * " + x + " = " + 5 * x);
    }


    System.out.println("\n ----- continue ----- \n");
    System.out.println("** 5단(for) **");
    for (int i = 1; i < 5; i++) {
      if (i == 3) {
        continue;
      }
      System.out.println("5 * " + i + " = " + 5 * i);
    }

    System.out.println("** 5단(while) **");
    int y = 0;
    while ( y < 5) {
      y++;
      if (y == 3) {
        continue;
      }
      System.out.println("5 * " + y + " = " + 5 * y);
    }
  }
}















