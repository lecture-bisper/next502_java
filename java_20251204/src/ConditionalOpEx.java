public class ConditionalOpEx {

  public static void main(String[] args) {

    int score = 85;
//    삼항 연산자 : 조건식? 출력1:출력2 형태로 사용하는 연산자
//    if ~ else 문으로 100% 대체 가능하므로 프로그래밍 공부 처음에는 사용하지 않는 것이 좋음
//    조건식의 결과가 true 이면, : 기호의 앞에 있는 내용을 출력, 결과가 false 일 경우 : 기호 뒤에 있는 내용을 출력
    
    String grade = score > 90 ? "성적이 A 입니다." : "성적이 B 입니다.";
    System.out.println(grade);

    if (score > 90) {
      grade = "성적이 A 입니다.";
    }
    else {
      grade = "성적이 B 입니다.";
    }

    System.out.println(grade);
  }
}















