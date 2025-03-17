package kosa.phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	//name, phoneNo, birth
	private String name; //���� ������ ����, �ڵ� ������-��κ��� �����ڰ� �̷��� ��
	private String phoneNo;
	private String birth;
	
	//����Ʈ ������ ����� ���� �⺻���� ��������
	public PhoneInfo() {}

	
	//�ʵ尪���� �ʱ�ȭ�ϰڴ�.Source->Generate construction using Fields
	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	

	public void show() {
		System.out.println("�̸�:"+name);
		System.out.println("��ȭ��ȣ: "+phoneNo);
		System.out.println("�������: "+birth);
	}
	
	//private�� �߱⿡ get�޼���� set�޼��� ����
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
