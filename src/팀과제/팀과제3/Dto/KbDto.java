package 팀과제.팀과제3.Dto;

public class KbDto extends BankDto{

    static final int 은행코드 = 2;


    //기본생성자
    public KbDto(){}
    private String 쿠폰;

    public String get쿠폰() {
        return 쿠폰;
    }

    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }
}
