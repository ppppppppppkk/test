package day15;

public class Step2 {
    public static void main(String[] args) {


        //Phone phone = new Phone(){"홍길동"};
        SmartPhone smartPhone = new SmartPhone("홍길공");
        Phone phone1 = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}