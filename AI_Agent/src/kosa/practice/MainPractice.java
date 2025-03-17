package kosa.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kosa.io.Main;

public class MainPractice {

	MemberPractice m;
	
	public void insert() {
		m = new MemberPractice("ȫ�浿");
		ObjectOutputStream oos = null;
		
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
	
	public void show() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (MemberPractice)ois.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			}catch(Exception e2) {}
		}
			
	}
		
	public static void main(String[] args) {
		Main mm = new Main();
		mm.insert();
		mm.m = null;
		mm.show();
		System.out.println(mm.m);
	}
}
