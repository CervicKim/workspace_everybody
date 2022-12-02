package am_study3.src.generic.copy2;

public class 구매 {

//	public void buy(seafood_box<squid> item) {
//		System.out.println("해산물 구함");
//	}
//	public void buy(seafood_box<shrimp> item) {
//		System.out.println("해산물 구함");
//	}
					//물음표(?)가 와일드카드..! ??!!대박..
				// 물음표(와일드카드) : any type을 뜻한다. 제한은 상속으로 걸어준다.
				// ? extends : 하위클래스(자식클래스)만 쓰려면.
				// ? super : 부모클래스까지 싹 다 쓰려면
	public void buy(seafood_box<? super seafood> item) {
		System.out.println("해산물 구함");
	}
}
