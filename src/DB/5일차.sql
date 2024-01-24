/*

SQL(Structured Query Language) : 데이터베이스에서 사용하는 데이터 처리 언어
	1. 정의어	DDL(Date definition Language)
		1. create 데이터베이스/테이블 생성  nou null,unique
        2. drop	  데이터베이스/테이블 삭제
        
    2. 조작어 DML (Date Mainpuldation Language)
		1. insert 레코드 삽입 행 
			1. 모든 레코드 삽입 : insert into 테이블명 values(값1, 값2);
            2. 특정 레코드 삽입 : insert into 테이블명(필드명1,필드명2) values(값1,값2);
        2. select 레코드 검색
			1. 모든 필드(*) 가 표시한 레코드 검색 : select * from 테이블명;
            2. 특정 필드를 표시한 레코드 검색 :  select 필드명1, 필드명2 from 테이블명;
        3. update 레코드 필드의 값 수정
			1. 모든 레코드의 필드의 값을 수정 	: update 테이블명 set 수정할필드명 = 수정할 값, 수정할필드명 = 수정할 값
			2. 특정 레코드의 필드 값을 수정	: update 테이블명 set 수정할필드명 = 새로운값 , 수정할필드명 = 새로운값 where 조건식 
        4. delete 레코드 삭제 
			1. 모든 레코드 삭제 : delete from 테이블명
            2. 특정 레코드의 필드 값을 삭제 : delete from 테이블명 where 조건식;
            3. truncate : 데이터 삭제
	- 제약 조건
		1. not null null 값을 허용하지 않음
        2. unique 	중복값을 허용하지 않음
        3. default 값 필드의 값 데이트 안넣으면 기본값
        4. primary key 기본키(pk 필드명) 각 테이블의 대표값
        5. foreign key 외래키(fk 필드명) references 참조할테이블명( 참조할 pk필드명 )
    3. 제어어
    4. 트랜잭션어

*/
drop database if exists test5;
create database test5;
use test5; # DB서버 내 여러개의 데이터베이스가 존재하기 때문에 DB선택해야 한다

drop table if exists table1;
create table table1(
데이터필드1 int, 데이터필드2 varchar(30));

#모든 필드를 표시하는 레코드 검색
select *from table1;

#CRUD
insert into table1 values(1 , "유재석");
insert into table1 (데이터필드1) values(2);
insert into table1 (데이터필드2) values("강호동");
insert into table1 values(4, "신동엽");

#특정 필드를 표시하는 레코드 검색
select 데이터필드2 from table1;

update table1 set 데이터필드2 = "강호동";
update table1 set 데이터필드2 = "신동엽" where 2;
update table1 set 데이터필드2 = "하동훈" where 데이터필드1 = 4; #특정 레코드 수정 데이터필드2에 데이터필드1번이 4번째를 조세호로 수정
update table1 set 데이터필드2 = "하하" where 데이터필드1 = 3;

delete from table1 where 데이터필드1 = 2; # 특정 레코드 삭제 데이터필드1이 3번째라인이면 삭제 
delete from table1 where 데이터필드1; # 추후에 취소 가능
#VS
truncate table table1; # 추후에 취소 불가능

use test5;
drop table if exists members;
 create table members(
 name varchar(30)
 );
 
 select *from members;

#만약에 이름이 강호동이면 신동엽으로 변경.
update members set name = '신동엽' where name = '강호동';


