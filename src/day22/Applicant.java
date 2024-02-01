package day22;

public class Applicant <T>{
    //<T> : 제네릭타입
    public T Kind;
    public Applicant(T kind){
        this.Kind = Kind;

    }
}
