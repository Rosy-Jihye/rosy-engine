package kosa.practice;

import java.io.Serializable;

public class MemberPractice implements Serializable {
	
	private String name;
	
	public MemberPractice() {}

	public MemberPractice(String name) {
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
		return "MemberPractice [name=" + name + "]";
	}
	


}
