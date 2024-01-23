package day16;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
         this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재TV 불륨 :"+ this.volume);

    }
}



/*

오버로딩 : 생성자/메소드에서 매개변수의 타입/개수/순서에 따라 여러개 선언
오버라이딩 : 메소드에서 extends/implements 한 메소드를 재정의


 */
