public class ByteEx {

    public static void main(String[] args) {
//        byte 타입의 변수 선언
//        byte 타입은 -128 ~ 127 까지 저장 가능
        byte val1 = -128;
        byte val2 = -30;
        byte val3 = 0;
        byte val4 = 30;
        byte val5 = 127;
//        오류 발생, byte 타입이 저장할 수 있는 수보다 큰 수를 저장하여 오류
//        byte val6 = 128;
        
//        데이터 오버플로우, 해당 변수에 저장할 수 있는 최대값보다 큰 값(최소값보다 작은 값)을 입력 시 반대의 기호로 표시 됨
        byte val7 = (byte)-129;

        System.out.println("val1 = " + val1);
        System.out.println("val2 = " + val2);
        System.out.println("val3 = " + val3);
        System.out.println("val4 = " + val4);
        System.out.println("val5 = " + val5);

        System.out.println("val7 = " + val7);
    }
}
