create table studnet_tbl (
    name varchar2(50) primary key
  , kor number(3, 0) not null default 0
  , kor_credit varchar2(9) not null default 'F'
  , eng number(3, 0) not null default 0
  , eng_credit varchar2(9) not null default 'F'
  , math number(3, 0) not null default 0
  , math_credit varchar2(9) not null default 'F'
  , tot number(3, 0) default 0,
  , avg number(5, 2) default 0,
  , rank number(2, 0)
)
