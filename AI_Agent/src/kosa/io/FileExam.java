package kosa.io;

import java.io.File;

public class FileExam {
	
	public static void show(File file) {
		File list[] = file.listFiles(); //하위 파일들 하나하나가 File 객체가 되어서 list 배열에 들어가 있다.
		
		for(int i=0;i<list.length;i++) {
			if(list[i].isDirectory()) { //너 디렉토리니
				System.out.println();
				System.out.println("***"+list[i].getName()+"***"); //디렉토리(폴더)이면 해당 폴더 이름 보여줌
				show(list[i]); // 그리고 다시 show 진행하여서 파일이 나올때까지 진행 (재귀함수)
			}else {//디렉토리가 아니면(파일이면)
				System.out.println("-"+list[i].getName()); //파일명 출력
			}
		}
	}
	
	public static void main(String[] args) {
		String path = "D:\\edu_data\\AI_Prompt\\workspace\\java_work\\AI_Agent\\src\\kosa\\api";
		
		File f = new File(path);
		show(f); //경로가 파일 객체에 들어가있기 때문에 file을 show 하면 해당 경로가 보여짐
		
//		if(f.isDirectory()) { //디렉토리냐
//			System.out.println("디렉토리");
//		}else {
//			System.out.println("파일");
//		}

	}

}
