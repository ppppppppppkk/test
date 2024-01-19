package day14;

public class Car {
    //1. 한국타이어 객체 + 하위객체
    //HankookTire hankookTire;
    //2. 금호타이어 객체 + 하위객체
    //KumhoTire kumhoTire;
    //3. 타이어 객체 + 하위객체(한국 타이어, 금호타이어)
     public Tire tire;

    public void run() {
       this.tire.roll();
    }
}
