package day18.model.dto;

public class BoardDto {


    private int bno;
    private String btitle;
    private String bcontent;
    private String btime;
    private String bviews;
    private int gno;
    private int mno;

    public BoardDto() {
    }

    ;

    public BoardDto(int bno, String btitle, String bcontent, String btime, String bviews, int gno, int mno) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.btime = btime;
        this.bviews = bviews;
        this.gno = gno;
        this.mno = mno;
    }

    public BoardDto(String btitle, String bcontent) {
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public String getBviews() {
        return bviews;
    }

    public void setBviews(String bviews) {
        this.bviews = bviews;
    }

    public int getGno() {
        return gno;
    }

    public void setGno(int gno) {
        this.gno = gno;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", btime='" + btime + '\'' +
                ", bviews='" + bviews + '\'' +
                ", gno=" + gno +
                ", mno=" + mno +
                '}';
    }
}
