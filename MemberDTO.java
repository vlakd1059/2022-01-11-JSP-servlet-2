package com.message.model;

// 변수, 생성자, getter/setter, toString()정의
public class MemberDTO {
	private String m_email;
	private String m_pw;
	private String m_tel;
	private String m_address;

	// 생성자
	public MemberDTO(String m_email, String m_pw, String m_tel, String m_address) {
		this.m_email = m_email;
		this.m_pw = m_pw;
		this.m_tel = m_tel;
		this.m_address = m_address;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_tel() {
		return m_tel;
	}

	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	@Override
	public String toString() {
		return "MemberDTO [m_email=" + m_email + ", m_pw=" + m_pw + ", m_tel=" + m_tel + ", m_address=" + m_address
				+ "]";
	}

}
