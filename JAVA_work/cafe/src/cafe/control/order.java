package cafe.control;

public class order implements menu_able {

	@Override
	public boolean menu_active() {
		// TODO Auto-generated method stub
		return true;
			// 오버로딩 - 클래스 내부에서 메서드 이름은 같고, 매개변수가 다른 형태로! 메소드를 정의 하는 것.
				//	-	int a(int num){}
				//	-	int a(int num, int num2){}
				//	-	void a(String name){}
				//	-	이름만 같을 뿐 아예! 새로운 메소드!!를 정의 하는 것.
				
			//	오버라이딩 -	다른 클래스(자식 또는 implements 되어 있는 클래스)에 
				// 리턴타입 메서드 이름 매개변수 모두 똑같이 정의 하고, 내용만 다르게 만드는 메소드.
				// overriding - 덮어쓰기/ 다른 걸 우선하기 위해 무시하다
				// 기존의 메서드를 내용만 변경!!하는 것.
	}

}
