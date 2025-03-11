package kosa.video;

public class GeneralMember {
	
	private String id;
	private String name;
	private String address;
	private Video rentalVideo; //회원가입한다고 생각했을 때 여기에 비디오가 있다는 것은 회원가입할 때 비디오를 빌려야한다는 의미
	
	public GeneralMember() {}

	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	
	}
	
	public void rental(Video video) {
		this.rentalVideo = video;
	}
	
	public void printMember() {
		System.out.println("회원 아이디: "+id);
		System.out.println("회원 이름: "+name);
		System.out.println("회원 주소: "+address);
		rentalVideo.show();

}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}
	

}
