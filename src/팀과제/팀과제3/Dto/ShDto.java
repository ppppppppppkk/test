package 팀과제.팀과제3.Dto;

public class ShDto extends BankDto{

    static final int 은행코드 = 1;

    public ShDto(){}
    private int 포인트;

    public int get포인트() {
        return 포인트;
    }
    public void set포인트(int 포인트) {
        this.포인트 = 포인트;
    }
}
