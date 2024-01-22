package day15;

public class Step3 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        //매개변수의 다형성
        animalSound(new Dog()); // 자동타입 변환
        animalSound(new Cat());
    }
    public static void animalSound( Animal animal){
        animal.sound(); //재정의된 메소드 호출
    }

}
