public class KoreanEx {

  public static void main(String[] args) {

//    기본 생성자를 사용
    Korean k1 = new Korean();

//    필드에 입력된 데이터 출력
    System.out.println("k1.nation : " + k1.nation);
    System.out.println("k1.name : " + k1.name);
    System.out.println("k1.ssn : " + k1.ssn);

    Korean k2 = new Korean("아이유");
    System.out.println("k2.nation : " + k2.nation);
    System.out.println("k2.name : " + k2.name);
    System.out.println("k2.ssn : " + k2.ssn);

    Korean k3 = new Korean("유인나", "123456-2211223");
    System.out.println("k3.nation : " + k3.nation);
    System.out.println("k3.name : " + k3.name);
    System.out.println("k3.ssn : " + k3.ssn);
  }
}















