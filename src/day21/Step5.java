package day21;

import java.awt.*;

public class Step5 {
    public static void main(String[] args) {

        Button button = new Button();

             button.setClickListener(new Button.ClickListener() {
                 @Override
                 public void onClick() {
                     System.out.println("버튼을 클릭했습니다");
                 }
             });




    }
}
