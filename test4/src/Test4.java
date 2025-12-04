public class Test4 {
    public static void main(String[] args) {
        // 주석 : 개발자가 소스코드에 대해서 남기는 설명글
//        잠시 실행하지 않을 소스코드에 사용
        System.out.println("인텔리제이에서 자바 프로그램 개발");
        System.out.println("새 자바 소스코드 실행");


//        변수 score 선언 및 데이터 100 저장
        int score = 100;
//        화면에 변수 score 의 데이터를 출력
        System.out.println(score);

//        변수 : 값 1개를 저장할 수 있는 메모리 공간

//        변수의 선언 : 변수를 사용할 수 있도록 미리 알려줌
//        사용법 :
//        1. 데이터타입 변수명;
//        2. 데이터타입 변수명 = 저장할데이터;

//        변수의 사용(데이터 저장) : 미리 선언한 변수에 데이터를 저장
//        변수의 초기화 : 선언한 변수에 최초로 데이터를 저장하는 행위
//        사용법 :
//        변수명 = 저장할데이터;

//        변수의 사용(데이터 읽기) : 변수에 저장된 데이터를 가져옴
//        사용법 :
//        1. java명령어(변수명);
//         변수에 저장된 데이터를 가져와서 다른 변수와 연산
//        2. 변수1 + 변수2;

        int a; // 변수를 선언, 사용 전 미리 선언만 함
        a = 10; // 선언된 변수를 초기화, 변수에 데이터를 저장
        a = 100; // 한번 이상 사용된 변수에 새 데이터를 저장, 기존 데이터 삭제

        int b; // 변수 선언, 사용 전 미리 선언만 함

//        변수끼리의 연산, 초기화되지 않은 변수 b 를 사용하여 오류 발생
//        System.out.println(a + b);

        int val1 = 10; // 변수 선언

//        변수 선언 후 사용
        System.out.println("변수 val1 의 값 : " + val1);

        if (a > 10) {
            // if문 안에서 변수 선언, if 문에서 나가면 메모리에서 삭제
            int val2 = 20;
//            if문 밖에서 선언한 변수를 if문 안에서 사용
            System.out.println("if 문 안에서 변수 val1의 값 : " + val1);
//            if문 안에서 선언한 변수를 사용
            System.out.println("if 문 안에서 변수 val2의 값 : " + val2);
        }

        for (int i = 0; i < 1; i++) {
//            for문 안에서 변수 선언,
            int val3 = 30;
//            for문 밖에서 선언한 변수를 for문 안에서 사용
            System.out.println("for 문 안에서 변수 val1의 값 : " + val1);
//            for문 밖 if문 안에서 선언한 변수를 for문 안에서 사용
//            if문이 실행된 후 if문에서 선언된 변수는 삭제
//            System.out.println("for 문 안에서 변수 val2의 값 : " + val2);
            
//            for문 안에서 선언한 변수를 for문 안에서 사용
            System.out.println("for 문 안에서 변수 val3의 값 : " + val3);
        }

//        if, for 문 밖에서 선언한 변수를 사용
        System.out.println("if, for 문 밖에서 변수 val1의 값 : " + val1);
//        if 문 안에서 선언한 변수를 if문 밖에서 사용, 오류 발생
//        if 문 실행 완료 후 메모리에서 변수 삭제
//        System.out.println("if, for 문 밖에서 변수 val2의 값 : " + val2);
        
//        for 문 안에서 선언한 변수를 for문 밖에서 사용, 오류 발생
//        for 문 실행 완료 후 메모리에서 변수 삭제
//        System.out.println("if, for 문 밖에서 변수 val3의 값 : " + val3);
    }
}









