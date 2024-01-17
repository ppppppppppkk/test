package 과제1.과제1.과제5;


public class Member {
    static int count = 0;
    String id;
    String pw;
    String name;
    String phone;
    String age;
    Member(String id, String pw, String name, String phone , String age){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Member{" +
                "id='" + id + '\'' +
                ", pw ='" + pw + '\''+
                ", name='" + name + '\''+
                ", phone='" + phone + '\''+
                ", age='" + age + '\''+
                '}';
    }


}