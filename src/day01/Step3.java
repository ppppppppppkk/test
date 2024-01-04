package day01;

public class Step3 { //class 시작
    public static void main(String[] args) { // 실행시 필수 m start

        int var1 = 0b1011;  //2진수
        int var2 = 0206;    //8진수
        int var3 = 365;     //10진수
        int var4 = 0xB3;    //16진수
            System.out.println("var1 : " + var1 ); //"문자열"+변수명
            System.out.println("var2 : " + var2 );
            System.out.println("var3 : " + var3 );
            System.out.println("var4 : " + var4 );

            //[byte 타입] : 1바이트 => 8bit -> 1[부호]+7[값] -> 2의7승
        byte b1 = -128;
        System.out.println("b1 : " + b1 );
        byte b2 = 127;
        System.out.println("b2 :" + b2 );
        byte b3 = 0;
        System.out.println("b3 :" + b3);
        byte b4 = 30;
        System.out.println("b4 :" + b4);
        byte b5 = 12;
        System.out.println("b5 :" + b5);

        //short타입 [-32768 ~ 32768] // : 2바이트 => 16bit
        short s1 = 32000;
        System.out.println("s1 :" + s1);
        //short s2 = -50000;
        //System.out.println("s2 :" + s2);
        //java: incompatible types: possible lossy conversion from int to short

        //*int타입 [ +-21억정도] : 4바이트 //정수타입 리터럴( 그 값 자체)
        int i1 = 2000000000;
        System.out.println("i1 :" +i1);
        //int i2 = 3000000000; //허용범위 벗어남
        //System.out.println("i2 :" + i2);

        // long타입 [+-21억이상] : 8바이트 : !!! : 정수타입 리터럴 뒤에 l/L
        long l1 = 300000000000L;
        System.out.println("l1 :" + l1);

        //char 0~65535  : 2바이트  ''작은따옴표, 65536개 문자표현 가능 부호[signed] /부호없음[unsigend]
        char c1 = 'A';
        System.out.println("c1 :" + c1);
        char c2 = '가';
        System.out.println("c2 :" + c2);

        int i3 = 'A';
        System.out.println("i3 :" + i3);
        //int 10진수

        char c4 = 80;
        System.out.println("c4 :" + c4);

        // 문자열[] : ""큰따옴표 , 참조자료형/클래스
        String str1 = "안녕하세요";
        System.out.println("str1 :" + str1);

        String str2 = "나는 \"자바\"를 배웁니다";
        System.out.println("str2 :" + str2);

        String str3 = "번호\t\t이름\t\t직업";
        System.out.println("str3 :" + str3);

        String str4 = """
                나는 자바를 
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println("str :" + str4);

        // float[] 소수점 8자리 표현  : 4바이트 : 반올림
        float f1 = 0.1234567489123456789f;
        System.out.println("f1 :" +f1);
        // double[] 소주점 17자리 표현 : 8바이트 : 실수타입의 기본타입
        double f2 = 0.123456789123456789;
        System.out.println("f2 :" +f2);
        // boolean         : 1바이트
        boolean bool1 = true;
        //boolean bool2 = 1; 1[int]이므로 boolean에 저장할 수 없다.[정수 가장 최소단위 바이트]


    } //m end
} //class end
