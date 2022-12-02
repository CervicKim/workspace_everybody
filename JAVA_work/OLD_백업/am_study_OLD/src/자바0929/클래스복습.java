//package 자바0929;
//
//class C{//C클래스시작
//	
//	private String 이름;//클래스 안에 작성한 변수 == 필드변수라고한다!
//	private int 나이;
//	
//}//C클래스끝
//
//		C(String 이름, int 나이){} //생성자 + 파라미터(있음)
//		C(){} //생성자 (파라미터X)
//		 
//class B{
//	//B라는 클래스 생성 후 메인 함수에 B클래스 호출
//	B(int x, int y){
//		System.out.println("B class : hello world");
//	}
//	B(){//메소드 이름은 같은데, 파라미터 타입이 다를 때 : 오버로딩 (파라미터까지 똑같으면 이름도 똑같은 메소드 생성 자체가 안됨!!!!!)
//		
//	}
//}
//class A{//A시작 //클래스를 생성하는 순간. A라는 메소드가 숨겨져있다.(기본적으로 탑재됨) == Default (기본으로 있는 값)
//	
//	A(){ //A라는 메소드가 생기지만 이름은 메소드X 생성자O라고 부른다!!!!!!!
//		 //생성자는 메소드와 다르게 리턴타입이 없다!!!!!!!!
//	}
//	public void A클래스에있는메소드(){//A메소드시작
//		System.out.println("hello world");
//		}//A메소드끝
//	public int 메소드생성(int x) {
//		return x;
//	}
//}//A끝
//
//public class 클래스복습 {//클래스복습시작
//	public static void main(String[] args) {//메인시작
//		//메인 메소드에서  A클래스에 있는 메소드 호출하기
//		A a = new A();
//		//new A(); : A 클래스 호출 (방법 1)
//		// A a : 불러온 클래스를 a라는 변수에 대입. (= 인스턴스화 하다, *객체를 생성하다.*)
//		a.A클래스에있는메소드(); //변수를 활용한 방법 (방법 2)
//		new A().A클래스에있는메소드(); // 변수를 생성하고 클래스 호출시 바로 메소드 호출.(방법 3)
//		a.메소드생성(300); //숫자아무거나! int니까 숫자 암거나~!
//		
//		B b = new B(50 , 100); //B라는 클래스를 호출할때, Default 생성자도 자동으로 호출된다!
//	//getter, setter
//	//why?: 필드 변수가 private이니까 get,set 이용해서 public으로 대입하고 호출한다!
//	 
//		public String get이름() {
//			return 이름;
//		}
//		public void set이름(String 이름) {
//			this.이름 = 이름;
//		}
//		public int get나이() {
//			return 나이;
//		}
//		public void set나이(int 나이) {
//			this.나이 = 나이; //원하는 위치에 커서를 두고, 상단 메뉴에서 Source - Generate gett.. - 선택적으로 만들기!
//	}//메인끝
//
//}
//
//
//}//클래스복습끝
