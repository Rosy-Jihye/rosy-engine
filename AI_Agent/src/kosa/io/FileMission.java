package kosa.io;

import java.io.File;


public class FileMission {

	public static void main(String[] args) {
		//2. upload ������ �ִ� ���ϵ��� download ������ �����ϰڴ�
		String source = "D:\\edu_data\\AI_Prompt\\upload";
		String dest = "D:\\edu_data\\AI_Prompt\\download\\upload";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));	

		
	}

}
