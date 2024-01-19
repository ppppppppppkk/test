package 과제1.과제1.과제7;

public class MemberDto {
    private int no;     //회원번호
    private String id;
    private String pw;
    private String name;
    private String phone;

    public MemberDto(){} // 기본생성자
    //풀(모든 필드의 매개변수가 존재하는) 생성자
    //오른쪽 클릭

    //플생성자
    public MemberDto(int no, String id, String pw, String name, String phone) {
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }

    //3. 메소드 오른쪽 클릭 getter/setter 생성(필드가 private 이면 필수
    // toString()   : 객체 필드 정보 확인차 주로 사용 목적

    @Override
    public String toString() {
        return "MemberDto{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

/*
	주제 : 회원제 시스템 part3
	    [ MVC 패턴 ]
 		- MemberDto 외 MVC패턴 사용하기 위해 아래와 같이 클래스 3개를 추가 설계하시오.
 		1.view 클래스
 		2.controller 클래스
 		3.model(dao·dto) 클래스

		[ MemberDto 클래스 ]
 		1. 아래 private 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		2. 생성자 사용하시오.
		3. getter , setter 메소드를 사용하시오.

        [ 기능 구현 - 과제6 동일 하며 MVC패턴으로 구현하시오. ]
		1. 초기 메뉴 ( VIEW )
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		2. 기능 조건 ( CONTROLLER , DAO )
			1. 회원가입 메소드
			2. 로그인 메소드
			3. 아이디찾기 메소드
			4. 비밀번호찾기 메소드
*/



