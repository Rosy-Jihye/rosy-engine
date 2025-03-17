package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	Member m;
	//��ü ����ȭ(��ü=>����)
	
	public void insert() {
		m = new Member("ȫ�浿"); //m�� ���� Member m�� ����
		ObjectOutputStream oos = null; //�̰��� ���
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch (Exception e2) {}
		}
	}
	

	//��ü ������ȭ(����(��ü) => ���α׷�(��ü)
	public void show() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
	}

	public static void main(String[] args) {
		Main mm = new Main();
		mm.insert();
		mm.m = null; //m ��ü ������. ���Ϸθ� ����.
		mm.show(); //������ȭ�� ��
		System.out.println(mm.m);//��� ��ü ���
		
	
	}
	
}
