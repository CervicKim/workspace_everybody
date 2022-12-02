package am_study3.src.generic.copy;

public class squid extends seafood{
	public int among;
	public String origin;
	
	// 얘는 int(정수)랑 String(문자)만 들어올 수 있음!
	//받을 수 있는 데이터를 정해놨기 때문에, 누가 들어올 수 있는지 한눈에 구별 O!!
	//그리고 입력한 데이터 타입 고대로 이용가능! 정수도 정수로 O 문자도 문자로 O!
	//입장 가능한 유형을 명확하게 정한 덕에~ 타입에 의한 오류 줄일 수 있다!
	public void store(int among, String origin) {
		this.among=among;
		this.origin=origin;
	}
	public squid 판매() {
		return this;
	}
}
