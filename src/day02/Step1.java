package day02;  //현재 클래스 파일 위치의 패키지명


public class Step1 {    //자바의 모든 코드는 클래스 안에서 작성. class start


    public static void main(String[] args) { //m start main스레드포함
        System.out.println("ㅎㅎㅎ");
        /*

        Step1 클래스 파일 생성 [.java]
            컴파일

            자동타입 변환
            1. 작은 타입 허용범위가 큰 타입 허용범위내 대입될때
             byte < short, char <int < long < float < double

            강제타입 변환 = 강제 캐스팅
                1. 큰 타입 허용 범위가 작은 타입 허용범위내 대입될때
                2.데이터 손실
                작은타입 = (작은타입) 큰타입

        */

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue:" + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드:"+intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue:"+ longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue:" + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue:"+doubleValue);

        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println("var2:"+ var2);

        long var3 = 300;
        int var4 = (int)var3;
        System.out.println("var4:"+var4);

        int var5 = 65;
        char var6 = (char)var5;
        System.out.println("var6:"+var6);

        double var7 = 3.14;
        int var8 = (int)var7;
        System.out.println("var8:"+ var8);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2:" +result2);

        byte v3 = 10; int b4 = 100; long v5 = 1000L;
        long result3 = v3 + b4 + v5;
        System.out.println("result3:" +result3);

        char v6 = 'A'; char v7 = 1;
        int result4 = v6 + v7;      // char + char => int

        int v8 = 10;
        int result5 = v8 /10;       // int / int => int

        int v9 = 10;
        double result6 = v9/4.0;    //int / double => double

        int v10 = 1;
        int v11 = 2;
        double result7 = v10 / v11;     // int /int => int [문제 없음 - 소수점이 표현 불가능]


    } //m end

} // class end


// 연산식에서 자동 타입변환[ 결과는 더 큰 허용범위 ]
    //1. byte, short 끼리 연산시 결과 타입이 int
    //2. int , int => int
    //3. long , int => long
    //4. float , float => float
    //5. double, float => double


/*

    타입
        종류 :
        1. 기본타입 : 저장하는 데이터 형식이 리터럴 데이터 8가지 기본적으로 제공하는 타입
        2. 참조타입 : 저장하는 데이터 형식이 메모리 주소값 기본타입 외 모든 타입

        기본타입 8가지
            [논리]
            boolean     1바이트        true false
            [정수]
            byte        1바이트        -128~127
            short       2바이트        +-32000
            int         4바이트        +-21억
            long        8바이트        +-21억
            [실수]
            float       4바이트        유효소수점 7자리,8자리
            double      8바이트        유효소수점 15자리, 16자리 출력
            [문자]
            char        2바이트        유니코드 65535
            [문자열]
            +String     문자길이        영문1바이트 한글2바이트





 */

