package day13;

    public class SmartPhone extends Phone {
        //1.필드
        public boolean wifi;

        //2.생성자
        public SmartPhone(String model, String color) {

            super();

            this.model = model;
            this.color = color;
        }

        //3.메소드
        public void setWifi(boolean wifi) {
            this.wifi = wifi;
            System.out.println("와이파이 상태를 변경합니다.");
        }

        public void internet() {
            System.out.println("인터넷에 연걸합니다");
        }


    }   // c e
