package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.control.event;
import cafe.control.exit;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.order;
import cafe.control.signin;

public class cafe_main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		order o = new order();
		login l = new login();
		event e = new event();
		//저 소문자들에게 각자 따로 만들어 분리된 객체를 연결하면 쓸 수 있다.
		//근데 얘들을 쓰려면 각자 상속!을 해야하는데~ 인터페이스를 이용하면 굳이 그럴 필요가 없어짐!!!!!!!!!!!!!!!!
		*/
		menu_able[] menu = {new order(), new login(), 
							new event(), new signin(), new exit()};
		
		//4개의 메소드를 메인메소드 하나로 조종할 수 있다.
		while(menu[main_menu() -1 ].menu_active());
		//그렇게 다 다양성으로! 연결을 해놨으니 아래 switch문이 필요없어짐! 지우자! 다양성을 쓰면 간결해진다!!
		/*while(true) {
			switch(main_menu()) {
			case 1:		//주문
//				o.메소드();
				break;
			case 2:		//로그인
//				l.메소드();
				break;
			case 3:		//이벤트확인
//				e.메소드();
				break;
			case 4:		//회원가입
				break;
			case 5:		//종료
				break;
			}*/
	}	


	public static int main_menu() { //클래스 메소드 - 클래스메소드 에서만사용
	int select=0;
		try{
			System.out.println("1. 주문");
			System.out.println("2. 로그인");
			System.out.println("3. 이벤트");
			System.out.println("4. 회원가입");
			System.out.println("5. 종료");
			System.out.println("선택 : ");
			select = sc.nextInt();
			if(select<1 || select>5) //만약 누락된 게 있다면~
				throw new InputMismatchException("잘못 입력했습니다.");
		}catch(Exception e) {
			System.out.println(  e.getMessage()  );
			sc.nextLine(); //입력해도 다음줄로 넘김
			select = main_menu();
		}
		return select; //제대로 입력헀다면 리턴으로 끝날 거고~ 
}//반복문 안 쓰고도 반복문처럼 쓰기.

	

	

}