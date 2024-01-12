package day09;

public class Step1 { // c s
    public static void main(String[] args) { // m s


        // 1. 필드/메소드를 사용하기 위해서는 꼭 객체가 필요하다
        //1. 객체 생성(생성자)
         //new Calculator();
         Calculator myCalc = new Calculator();
         myCalc.powerOn();
         //2. 객체내 멤버(필드/메소드) 호출
         new Calculator().powerOn();
         //

         //3. 메소드 호출하고 매개변수 전달
            //- 매개변수 타입과 개수에 맞게 제공한다.
        myCalc.plus(5, 6);
        int result = myCalc.plus( 5, 6);
        System.out.println("result = " + result);
        
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide( x, y);
        System.out.println("result2 = " + result2);

        myCalc.powerOff();

    } //m e
}// c e
