package kosa.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import kosa.io.Member;

//전화번호 목록을 관리(추가, 출력, 검색 등등)하는 기능
public class Manager {
	//private PhoneInfo arr[]; //==>List 자료구조로 변경
	List<PhoneInfo>list;
//	private int count; //몇번째 배열 인덱스를 사용하고 있는지
	private Scanner sc;
	
	public Manager() {
		//arr = new PhoneInfo[10];
		list = new ArrayList<PhoneInfo>();
		sc = new Scanner(System.in);
	}
	
	public void addPhoneInfo() {
		//1. 일반 2. 동창 3. 직장
		
			System.out.println("1. 일반 2. 동창 3. 직장");
			System.out.print("메뉴입력: ");
			String menu=DataInput.sc.nextLine();
			System.out.print("이름: ");
			String name=DataInput.sc.nextLine();
			System.out.print("전화번호: ");
			String phoneNo=DataInput.sc.nextLine();
			System.out.print("생년월일: ");
			String birth=DataInput.sc.nextLine();
			
			
			switch(menu) {
			case "1":
				//arr[count++] = new PhoneInfo(name, phoneNo, birth);
				list.add(new PhoneInfo(name, phoneNo, birth));
				break;

			case "2":
				System.out.print("전공: ");
				String major=DataInput.sc.nextLine();
				System.out.print("기수: ");
				String year=DataInput.sc.nextLine();
				//arr[count++] = new Universe(name, phoneNo, birth, major, year);
				list.add(new Universe(name, phoneNo, birth, major, year));
				break;

			case "3":
				System.out.print("부서: ");
				String dept=DataInput.sc.nextLine();
				System.out.print("직위: ");
				String position=DataInput.sc.nextLine();	
				//arr[count++] = new Company(name, phoneNo, birth, dept, position);
				list.add(new Company(name, phoneNo, birth, dept, position));
				return;
			
			}//Universe와 Company가 모두 Phoneinfo로부터 상속받기 때문에 이렇게 Phoneinfo 타입 배열에 넣을 수 있다.
			
			System.out.println("전화번호가 등록되었습니다.");

		
	}
	
	public void listPhoneInfo() {
		//1. 전체 2. 동창 3. 직장
		
			System.out.println("1. 전체 2. 동창 3. 직장");
			System.out.print("메뉴입력: ");
			String menu=DataInput.sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.println("**전체목록**");
//				for(int i=0;i<count;i++) {
//					arr[i].show();
				Iterator<PhoneInfo> iter = list.iterator(); //리스트 내용을 데이터 값을 가져오는데 데이터 타입을 Iterator로 가져온다
				while(iter.hasNext()) { //순회할 때 안에 요소 있니?
					iter.next().show(); //있어. 그러면 리스트 객체 폰인포를 출력하는데 iterator 값이 없을 때까지 돈다.
				}
				break;

			case "2":
				System.out.println("**동창목록**");
				for(int i=0;i<list.size();i++) {
					PhoneInfo info = list.get(i);
					if(info instanceof Universe) {
						info.show();
					}
//				for(int i=0;i<count;i++) {
//					if(arr[i] instanceof Universe) {
//						arr[i].show(); //override를 했기에 universe의 show 실행
//					}
				}
				break;

			case "3":
				System.out.println("**직장목록**");
				for(int i=0;i<list.size();i++) {
					PhoneInfo info = list.get(i);
					if(info instanceof Company) {
						info.show();
					}
//				for(int i=0;i<count;i++) {
//					if(arr[i] instanceof Company) {
//						arr[i].show(); //override를 했기에 universe의 show 실행
//					}
				}
				break;
		}

	}
	
	public void searchPhoneInfo() {
		//검색하고자 하는 이름으로 1개의 PhoneInfo 객체의 내용을 검색
		
		System.out.print("이름 : ");
		String name=sc.nextLine();
		int idx=-1;
		
//		for(int i=0;i<count;i++) {
//			if(name.equals(arr[i].getName())) {//name은 private가 되어있어서 getName을 해야함.
//			arr[i].show();
//			idx=i;
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {//name은 private가 되어있어서 getName을 해야함.
			list.get(i).show();
			idx=i;
			}
//			}
		}
		
		if(idx==-1) {
			System.out.println("존재하지 않습니다.");
			
		}
	}
	
	public void updatePhoneInfo() {
		//이름을 입력 => 해당 PhoneInfo 검색 => 수정 전화번호 입력 =>전화번호 수정이 완료
		System.out.print("입력 : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
//		for(int i=0;i<count;i++) {
//			if(name.equals(arr[i].getName())) {
//				System.out.println("수정 전화번호: ");
//				String phoneNo = DataInput.sc.nextLine();
//				arr[i].setPhoneNo(phoneNo);
//				idx = i;
//			}
		for(int i=0;i<list.size();i++) {
			PhoneInfo info = list.get(i);
			if(name.equals(info.getName())) {
				System.out.println("수정 전화번호: ");
				String phoneNo = DataInput.sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
			}
			
		}
		
		if(idx == -1) {
			System.out.println("존재하지 않습니다.");//idx가 여전히 -1이라면 찾는 이름이 존재하지 않는다는 의미
		}
	}
		
	public void deletePhoneInfo() {
		//이름 입력=>해당 PhoneInfo 객체 검색=>인덱스 찾기=>해당 객체 삭제
		
		System.out.print("입력 : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
//		for(int i=0;i<count;i++) {
//			if(name.equals(arr[i].getName())) {
//				idx = i;
//			}
		for(int i=0;i<list.size();i++) {
			PhoneInfo info = list.get(i);
			if(name.equals(info.getName())) {
				list.remove(info);
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("존재하지 않습니다.");//idx가 여전히 -1이라면 찾는 이름이 존재하지 않는다는 의미
//		}else {
//			for(int i=idx;i<count;i++) { //본인 순서부터 체크해서
//				if(i==arr.length-1) { //배열의 가장 마지막 요소일 때
//					arr[i] = null; //빈 것으로 둔다
//				}else {
//				arr[i]=arr[i+1]; //중간에 빈 것을 두지 않고 앞으로 땡긴다.
//				}
//			}
//			count--;
		}
	}
	
	public void saveFile() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("PhoneInfo.txt"));
			oos.writeObject(list);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch (Exception e2) {}
		}
	}
	
	public void loadFile() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("PhoneInfo.txt"));
			list = (List)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
	}
}

