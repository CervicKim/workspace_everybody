package am_study3.src.generic.copy;

import java.util.ArrayList;

public class main_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ArrayList list = new ArrayList<>();
//		list.add(100);
//		list.add(3.14);
//		list.add(342);
//		list.add("문자도 된다");
//		//arraylist는 그 자체로도 문자숫자정수 누구든 들어올 수 있다!
//		//들어올 순 있으나, 들어와있는 애들을 사용하는 데엔 제약이 있다.(equal로 문자만 찾을 수 있으니 숫자는 못찾자나..
//				
//		//이를 해결하기 위한 방법이있다?!
//		
//		ArrayList<Integer> List = new ArrayList<>();
//		//Integer가 붙어주면 equal도 쓸 수 있음!!!
//		//필요한 걸 가져오기 위해 "타입"만 바꾸고 클래스는 고대로!
//		System.out.println(list);
		
		
//		seafood<String> sea = new seafood<String>();
//		sea.store("체리pie원주율");
//		System.out.println(sea.판매());

			
//		seafood_box<오징어> 오징어박스 = new seafood_box<>();
//			//오징어 클래스 개체 만들기
//		오징어박스.setBox(new 오징어());
//		오징어박스.sellBox();
//	
//		seafood_box<새우> 새우박스 = new seafood_box<>();
//		새우박스.setBox(new 새우(seafood_box));
//		
//		오징어박스.setBox(new 참치() );
		
		seafood_box<seafood> 해산물박스 = new seafood_box<>();
		해산물박스.setBox(new seafood() );
		해산물박스.setBox(new squid() );
		해산물박스.setBox(new tuna() );
		해산물박스.setBox(new shrimp() );
		
		seafood_box<shrimp> 새우박스 = new seafood_box<>();
		//shrimp를 새우박스로 변수 걸어줌!
		새우박스.setBox(new shrimp());
		
		seafood_box<squid> 오징어박스 = new seafood_box<>();
		오징어박스.setBox(new shrimp());
		
	
		구매 구매자 = new 구매();
		구매자.buy( 오징어박스 );
		구매자.buy( 새우박스 );
		
	}

}
