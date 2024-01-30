package day21;

public class Step3 {
    public static void main(String[] args) {
        Car car = new Car();

        car.run3( new Tire(){
            @Override
            public void roll(){
                System.out.println("기아타이어가 굴러갑니다");
            }
        });

        Tire tire = new Tire(){
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다2");
            }
        };
        car.run3( tire );
    }
}
