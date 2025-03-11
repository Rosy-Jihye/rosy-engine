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

	//��� : Source-Override Method
	@Override
	public boolean equals(Object obj) {
		//���� Object�� �ƴ� Person���� �ٲ������
		//�������̵� �Ϸ��� ���� Person���� �ٲ��ָ� �ȵ�
		Person p = (Person)obj;
		//Person���� ����ȯ���ϸ� Object�� �ִ� �޼��尡 ȣ��Ǵµ� getName�� Object���� ����
		if(name.equals(p.getName())&& age==p.getAge()) {
			//�տ� name�� p1, �ڿ� getName�� p2
			return true;
		}else {
			return false;
		}

		//return super.equals(obj);
		//�θ��� equals ����̴� ��������
	}
	
	
	


}
