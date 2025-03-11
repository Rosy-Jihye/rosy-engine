package kosa.oop;

public class Contact {
// 문제> 전화번호부 관리프로그램 구현하자.
//    전화번호부 :  한명의 이름, 전화번호, 생년월일을 출력
//    >1.추가 2.전체출력 3.검색 4.종료
//    >메뉴: 1
//    >이름 : 홍길동
//    >전화번호 : 111-1111
//    >생년월일 : 20/01/01
//    >전화번호가 등록 되었습니다.
//    >1.추가 2.전체출력 3.검색 4.종료
//    >메뉴 : 2
//    >이름 : 홍길동
//    >전화번호 : 111-1111
//    >생년월일 : 20/01/01
//    >1.추가 2.전체출력 3.검색 4.종료
//    >메뉴 : 3
//    >검색 이름 : 홍길동
//    >이름 : 홍길동
//    >전화번호 : 111-1111
//    >생년월일 : 20/01/01
//    >1.추가 2.전체출력 3.검색 4.종료
//    >메뉴 : 4
//    >프로그램 종료
	
private String name;
private String contact;
private String birth;

public Contact() {}

public Contact(String name, String contact, String birth) {
	this.name=name;
	this.contact=contact;
	this.birth=birth;
}

public void printContact() {
	System.out.println("이름: "+name);
	System.out.println("전화번호: "+contact);
	System.out.println("생년월일: "+birth);
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getBirth() {
	return birth;
}

public void setBirth(String birth) {
	this.birth = birth;
}

	
}
