public class CompareOpEx {

  public static void main(String[] args) {

    int num1 = 10;
    int num2 = 20;

    boolean result1 = (num1 == num2);
    boolean result2 = (num1 != num2);
    boolean result3 = (num1 <= num2);
    System.out.println("result1 : " + result1);
    System.out.println("result2 : " + result2);
    System.out.println("result3 : " + result3);

    char char1 = 'A';
    char char2 = 'B';
//    char 타입 문자 'A' 는 정수로 65이고, char 타입 문자 'B' 는 정수로 66이기 때문에 'A' < 'B' 는 결국 65 < 66 이기 때문에 결과값은 true 가 됨
    boolean result4 = (char1 < char2);
    System.out.println("result4 : " + result4);
  }
}















