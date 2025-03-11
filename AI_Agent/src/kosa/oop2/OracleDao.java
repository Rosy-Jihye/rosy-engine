package kosa.oop2;

public class OracleDao extends Dao {

	@Override
	public void insert() {
		// insert없으면 Dao 자식 아니다
		System.out.println("OracleDao insert() 호출");

	}

}
