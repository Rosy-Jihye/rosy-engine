package kosa.oop;

public class Contact {
// ����> ��ȭ��ȣ�� �������α׷� ��������.
//    ��ȭ��ȣ�� :  �Ѹ��� �̸�, ��ȭ��ȣ, ��������� ���
//    >1.�߰� 2.��ü��� 3.�˻� 4.����
//    >�޴�: 1
//    >�̸� : ȫ�浿
//    >��ȭ��ȣ : 111-1111
//    >������� : 20/01/01
//    >��ȭ��ȣ�� ��� �Ǿ����ϴ�.
//    >1.�߰� 2.��ü��� 3.�˻� 4.����
//    >�޴� : 2
//    >�̸� : ȫ�浿
//    >��ȭ��ȣ : 111-1111
//    >������� : 20/01/01
//    >1.�߰� 2.��ü��� 3.�˻� 4.����
//    >�޴� : 3
//    >�˻� �̸� : ȫ�浿
//    >�̸� : ȫ�浿
//    >��ȭ��ȣ : 111-1111
//    >������� : 20/01/01
//    >1.�߰� 2.��ü��� 3.�˻� 4.����
//    >�޴� : 4
//    >���α׷� ����
	
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
	System.out.println("�̸�: "+name);
	System.out.println("��ȭ��ȣ: "+contact);
	System.out.println("�������: "+birth);
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
