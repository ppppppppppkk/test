package day18.model.dto;

public class BoardcontentDto {
    private int cno;
    private String ccontent;
    private int bno;
    private int gno;

    public BoardcontentDto(){};

    public BoardcontentDto(int cno, String ccontent, int bno, int gno) {
        this.cno = cno;
        this.ccontent = ccontent;
        this.bno = bno;
        this.gno = gno;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public int getGno() {
        return gno;
    }

    public void setGno(int gno) {
        this.gno = gno;
    }

    @Override
    public String toString() {
        return "BoardcontentDto{" +
                "cno=" + cno +
                ", ccontent='" + ccontent + '\'' +
                ", bno=" + bno +
                ", gno=" + gno +
                '}';
    }
}
