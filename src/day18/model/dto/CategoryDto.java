package day18.model.dto;

public class CategoryDto {
    int gno;
    String bcategory;

    public CategoryDto(){};
    public CategoryDto(int gno, String bcategory) {
        this.gno = gno;
        this.bcategory = bcategory;
    }

    public int getGno() {
        return gno;
    }

    public void setGno(int gno) {
        this.gno = gno;
    }

    public String getBcategory() {
        return bcategory;
    }

    public void setBcategory(String bcategory) {
        this.bcategory = bcategory;
    }

    @Override
    public String toString() {
        return "categoryDto{" +
                "gno=" + gno +
                ", bcategory='" + bcategory + '\'' +
                '}';
    }
}
