package am_study3.src.generic.copy;
//public class seafood_box<T extends seafood & 인터페이스>

public class seafood_box<T extends seafood> {

	T box_item;	//Object였는데 T를 쓰기로 했으니까 원래 옵젝 자리에 T를 넣자.
	
	public void setBox(T box) {
		this.box_item=box;
	}
	// 최상위 클래스인 Object로 했으니 어떤 거(문자 정수...)든 들어올 수 있다!
	//장: 누구든 받을 수 있기에 사용은 편하지만... (편의성 O)
	//단: ex) array로 들어왔어도 object로 들어왔기 때문에 object으로만 쓸 수 있음.. 원래 해당 기능 사용이 안된다...ㄷ
	public void sellBox() {
		System.out.println("해산물 박스 판매해요");
	}
	
	
}