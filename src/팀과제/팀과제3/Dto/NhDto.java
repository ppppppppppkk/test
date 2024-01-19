package 팀과제.팀과제3.Dto;

public class NhDto extends BankDto{

    static final int 은행코드 = 3;

    public NhDto(){}
    private int 마일리지;

    public int get마일리지() {
        return 마일리지;
    }

    public void set마일리지(int 마일리지) {
        this.마일리지 = 마일리지;
    }
}
