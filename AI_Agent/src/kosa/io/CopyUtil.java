package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CopyUtil {
	//디렉토리 복사(해당 폴더 복사해서 새로운 디렉토리 생성 후 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) {
		
		if(source.isDirectory()) {
			dest.mkdirs(); //mkdirs가 새로운 폴더 생성해줘
			
			File fileList[] = source.listFiles(); //fileList안에는 파일도 있을 수 있고, 디렉토리도 있을 수 있다
			for(int i=0;i<fileList.length;i++) {
				File sourceFile = fileList[i];
				if(sourceFile.isDirectory()) { //너 디렉토리니
					File s_destFile = new File(dest, sourceFile.getName()); //dest에서 하위폴더명 가져와서 만들어
					copyDirectory(sourceFile, s_destFile); //재귀함수					
				}else { //파일이면
					File destFile = new File(dest, sourceFile.getName()); //dest에서 파일명 가져와서 만들어
					copyFile(sourceFile, destFile); //
				}
			}
		}
		
	}
	
	
	//바이트 값을 가진 파일 1개를 복사하는 메서드
	public static void copyFile(File source, File dest) {//원본파일, 복사경로
		
		FileInputStream in = null;
		FileOutputStream out = null; 
		byte arr[] = new byte[1024]; //1024 바이트별로 읽어들이겠다
		int data =0;
		
		try {
			in = new FileInputStream(source); //source는 in 배관과 연결
			out = new FileOutputStream(dest); //dest는 out 배관과 연결
			
			while((data = in.read(arr)) != -1) { //arr만큼 읽어들이고, 더이상 읽어들일 것이 없으면 -1을 리턴
				out.write(arr,0,data); //arr의 첫번째부터 data가 -1되기전까지의 위치까지  쓴다
			
			}
			
			System.out.println("복사완료");
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
