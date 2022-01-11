1. 회원가입한 정보를 저장할 수 있는 'web_member'테이블을 만드시오.
   컬럼명 : m_email / m_pw / m_tel / m_address

create table web_member(
	m_email varchar(50),
	m_pw varchar(50) not null,
	m_tel varchar(50) not null,
	m_address varchar(50) not null,
	constraint pk_web_member primary key(m_email)

);








