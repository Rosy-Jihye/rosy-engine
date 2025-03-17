package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CopyUtil {
	//���丮 ����(�ش� ���� �����ؼ� ���ο� ���丮 ���� �� ��� ������ ����)
	public static void copyDirectory(File source, File dest) {
		
		if(source.isDirectory()) {
			dest.mkdirs(); //mkdirs�� ���ο� ���� ��������
			
			File fileList[] = source.listFiles(); //fileList�ȿ��� ���ϵ� ���� �� �ְ�, ���丮�� ���� �� �ִ�
			for(int i=0;i<fileList.length;i++) {
				File sourceFile = fileList[i];
				if(sourceFile.isDirectory()) { //�� ���丮��
					File s_destFile = new File(dest, sourceFile.getName()); //dest���� ���������� �����ͼ� �����
					copyDirectory(sourceFile, s_destFile); //����Լ�					
				}else { //�����̸�
					File destFile = new File(dest, sourceFile.getName()); //dest���� ���ϸ� �����ͼ� �����
					copyFile(sourceFile, destFile); //
				}
			}
		}
		
	}
	
	
	//����Ʈ ���� ���� ���� 1���� �����ϴ� �޼���
	public static void copyFile(File source, File dest) {//��������, ������
		
		FileInputStream in = null;
		FileOutputStream out = null; 
		byte arr[] = new byte[1024]; //1024 ����Ʈ���� �о���̰ڴ�
		int data =0;
		
		try {
			in = new FileInputStream(source); //source�� in ����� ����
			out = new FileOutputStream(dest); //dest�� out ����� ����
			
			while((data = in.read(arr)) != -1) { //arr��ŭ �о���̰�, ���̻� �о���� ���� ������ -1�� ����
				out.write(arr,0,data); //arr�� ù��°���� data�� -1�Ǳ��������� ��ġ����  ����
			
			}
			
			System.out.println("����Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
				if(in != null) {
				in.close();
				}
			} catch (Exception e2) {}
		}
		
	}
		
}
