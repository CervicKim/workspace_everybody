package hello_java;

public class Java0809_2 {

	public static void main(String[] args) {//중괄호 시작
		int x = 10;
		x = x + x;
		//x의 최종값은?
		//x += x; <-요거는 x = x + x랑 같은 의미래... 넘 신경쓰지 말고 걍 봐두기만하자.
		++x; // +1 하겠다는 뜻이래 ...
		System.out.println("x의 값은 : "+x); //이해못해두 ㄱㅊ대...ㅋㅋ^ㅡㅜ 8교시 쉬는시간에여쭤보자
		
		//if <-조건이 맞으면 실행하는 문법
		if(2 < 4) {
			System.out.println("if 실행");
		}
		
		int 숫자1 = 100;
		int 숫자2 = 200;
		int 숫자3 = 50;
		if(숫자1 == 숫자2) { // "==" 는 같다는 뜻
			System.out.println("숫자1하고 숫자2는 같습니다."); //아이디 비번 비교도 이걸로 하는거래!
		}
		if(숫자1 != 숫자2) { // "!=" 다르다는 뜻 @ㅇ@~~~
			System.out.println("숫자1하고 숫자2는 다르다.");
			숫자3 = 100;
			
			System.out.println("숫자3 : "+숫자3);
		}
	}//중괄호 끝.

}
