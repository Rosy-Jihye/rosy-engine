package kosa.io;

import java.io.File;


public class FileMission {

	public static void main(String[] args) {
		//2. upload 폴더에 있는 파일들을 download 폴더에 복사하겠다
		String source = "D:\\edu_data\\AI_Prompt\\upload";
		String dest = "D:\\edu_data\\AI_Prompt\\download\\upload";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));	

		
	}

}
