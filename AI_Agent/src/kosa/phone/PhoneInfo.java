package kosa.phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	//name, phoneNo, birth
	private String name; //정보 은닉을 위해, 코드 컨벤션-대부분의 개발자가 이렇게 함
	private String phoneNo;
	private String birth;
	
	//디폴트 생성자 만드는 것을 기본으로 가져가기
	public PhoneInfo() {}

	
	//필드값들을 초기화하겠다.Source->Generate construction using Fields
	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	

	public void show() {
		System.out.println("이름:"+name);
		System.out.println("전화번호: "+phoneNo);
		System.out.println("생년월일: "+birth);
	}
	
	//private를 했기에 get메서드와 set메서드 실행
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}

	
	
}
