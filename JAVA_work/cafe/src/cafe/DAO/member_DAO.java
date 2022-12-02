package cafe.DAO;

public class member_DAO {
	public member_DAO() {
		DriverLord();
	}
	private void DriverLord() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		}
	}
}
