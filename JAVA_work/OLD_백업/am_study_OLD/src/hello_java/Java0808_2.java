package hello_java;

public class Java0808_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5; //5를 대입
		a = a; // ??? 이게 무슨 말일까요? : 5를 다시 대입함.
		a = a* a; // a(5)곱하기 a(5)를 대입하다.
		System.out.println(a);
		
		a = 2;
		a = a * a;// 아래에서 a = 2로 만들면 새로 대입된 숫자로 바뀌게 된다!!!
		System.out.println("2번. "+a);
		
		int b = a;
		System.out.println("3번. "+ b);  
		
		int c = 10 / 2; // 나누기 몫
		System.out.println("4번. " + c);
		int d = 10 % 2; // 나누기 나머지
		System.out.println("5번. "+ d);
		int f = 5 * 5; // 곱하기
	    System.out.println("6번. " + f);
		
	}

}
