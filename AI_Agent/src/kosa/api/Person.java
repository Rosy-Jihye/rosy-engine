package kosa.api;

public class Person {
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//Source-Generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	//방법 : Source-Override Method
	@Override
	public boolean equals(Object obj) {
		//형이 Object가 아닌 Person으로 바꿔줘야함
		//오버라이딩 하려면 위를 Person으로 바꿔주면 안됨
		Person p = (Person)obj;
		//Person으로 형변환안하면 Object에 있는 메서드가 호출되는데 getName이 Object에는 없음
		if(name.equals(p.getName())&& age==p.getAge()) {
			//앞에 name은 p1, 뒤에 getName이 p2
			return true;
		}else {
			return false;
		}

		//return super.equals(obj);
		//부모의 equals 상속이니 지워야함
	}
	
	
	


}
