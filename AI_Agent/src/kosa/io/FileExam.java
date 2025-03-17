package kosa.io;

import java.io.File;

public class FileExam {
	
	public static void show(File file) {
		File list[] = file.listFiles(); //���� ���ϵ� �ϳ��ϳ��� File ��ü�� �Ǿ list �迭�� �� �ִ�.
		
		for(int i=0;i<list.length;i++) {
			if(list[i].isDirectory()) { //�� ���丮��
				System.out.println();
				System.out.println("***"+list[i].getName()+"***"); //���丮(����)�̸� �ش� ���� �̸� ������
				show(list[i]); // �׸��� �ٽ� show �����Ͽ��� ������ ���ö����� ���� (����Լ�)
			}else {//���丮�� �ƴϸ�(�����̸�)
				System.out.println("-"+list[i].getName()); //���ϸ� ���
			}
		}
	}
	
	public static void main(String[] args) {
		String path = "D:\\edu_data\\AI_Prompt\\workspace\\java_work\\AI_Agent\\src\\kosa\\api";
		
		File f = new File(path);
		show(f); //��ΰ� ���� ��ü�� ���ֱ� ������ file�� show �ϸ� �ش� ��ΰ� ������
		
//		if(f.isDirectory()) { //���丮��
//			System.out.println("���丮");
//		}else {
//			System.out.println("����");
//		}

	}

}
