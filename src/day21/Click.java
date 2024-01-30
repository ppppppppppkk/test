package day21;

public class Click implements Button.ClickListener {
    @Override
    public void onClick(){
        System.out.println("구현객체를 이용한 오케이 버틀을 클릭함");
    }
}
