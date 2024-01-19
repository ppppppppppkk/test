-- 테이터베이스 생성 
drop database if exists bank;
create database bank;
use bank;

drop table if exists shbank;
create table Shbank(
	은행코드 tinyint, 마일리지 int, 계좌번호 char(20), 예금주 varchar(20), 예금액 bigint 
);

drop table if exists kbbank;
create table Kbbank(
	은행코드 tinyint, 쿠폰 varchar(30), 계좌번호 char(20), 예금주 varchar (20), 예금액 bigint
);

drop table if exists nhbank;
create table Nhbank(
	은행코드 tinyint, 포인트 int, 계좌번호 char(20), 예금주 varchar(20), 예금액 bigint
);

select *from kbbank;
#=======================================================================

INSERT INTO Shbank(은행코드,쿠폰);
 values(1,202422);

