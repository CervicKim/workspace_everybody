package cafe.control;

@FunctionalInterface
public interface menu_able { //인터페이스 <-추상클래스의 하나
	
	public boolean menu_active();
	/*
	//	int num;// 인터페이스에선 인스터스 변수? X
	//	void sum() { //인스턴스 메소드 XX
	final int count=20; // 상수 가능!OOO
	static int day=10;	// 클래스 변수 가능!
	public abstract void sum(); // 추상 메소드
		
	static void addd() { //클래스 메소드
		
	}
	*/
	//	추상 클래스는 추성메소드를 갖고 있는 클래스이다.
	//	추상클래스는 객체 생성에 대한 제한이 있다.
	//	추상 클래스는 객체 생성에 제한이! 있다.
	//	고로, 인터페이스는 추상메소드를 가지며~/ 객체 생성에 제한이 있다.
	//	인터페이스에 정의하는 메소드는 기본적으로 추상메소드로 정의 된다.
	//	인터페이스에는 인스턴스변수, 인스턴스메소드 정의 불가!!
	//	인터페이스에 추상메소드 정의는 abstarct 생략할 수 있다.
	//	인터페이스에 추상메서드가 하나만 있다면? 해당 인터페이스를 함수형 인터페이스라고 한다.
	//	함수형 인터페이스는 "람다" 생성할 때 사용할 수 있는 인터페이스이다.
	//	"람다"는 지금 개발중이라 그렇게 많이 쓰이는 게 아니다.
}

