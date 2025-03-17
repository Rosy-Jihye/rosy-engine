package kosa.io;

import java.io.Serializable;

public class Member implements Serializable{ //Serializable를 통해 이제 Member 객체는 직렬화가 가능하다
	private String name;
	
	public Member() {}

	public Member(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	

}
