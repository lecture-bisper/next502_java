public class MainStringArrayEx {

  public static void main(String[] args) {

//    if (args.length < 1) {
//      System.out.println("추가 옵션이 없습니다.");
//      System.exit(0);
//    }
//
//    System.out.println("args[0] : " + args[0]);

    if (args.length != 2) {
      System.out.println("프로그램의 사용법");
      System.out.println("java MainStringArrayEx num1 num2");
      System.exit(0);
    }

    String numStr1 = args[0];
    String numStr2 = args[1];

    int num1 = Integer.parseInt(numStr1);
    int num2 = Integer.parseInt(numStr2);

    int result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);
  }
}















