package day11;

public class Car { // c s

    //1.필드(정적/인스턴스,final,상수)public,private,(default)
    private int speed;
    private boolean stop;

    //2.생성자(public,private,(default))

    //3.메소드 필드(정적/인스턴스,final)public,private,(default)
        //1. 외부로부터 필드값을 반환해주는 메소드
    public int getSpeed(){
        return this.speed;
    }
        //2. 외부로부터 매개값을 필드 값에 대입해주는 메소드
    public void setSpeed(int speed){
        if ( speed < 0){
            this.speed = 0;
            return;
        }else {
            this.speed = speed;
        }
    }

    public  boolean isStop(){return stop;}
    public void setStop(boolean stop){
        this.stop = stop;
        if(stop == true) this.speed = 0;
    }

} // c e
