package 자바0926;

public class Home {

public static void main(String[] args) {//메인함수로 꺼내기!2.
		// TODO Auto-generated method stub

		소녀시대 태연 = new 소녀시대();
		System.out.println(태연.멤버소개("태연"));
		
		소녀시대 수영 = new 소녀시대();
		System.out.println(수영.멤버소개("수영"));
		//같은 클래스로 불렀지만 분명 다른 개체로 차별화 된다!
	}

}
