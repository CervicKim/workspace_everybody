package 자바0913;
import java.security.PublicKey;

public class 메소드공부 {
		// TODO Auto-generated method stub

			//메소드: 뭔가를 수행하는 기능 == function
			// () => 파라미터 or 매개변수라고 함.
			// Public static <-이거 아직은 모르고ㅓ 써두 댐!
			// int : 리턴 타입
			// 더하기 : 메소드의 (기능) 이름!
			// 리턴 타입 : int, double, float. boolean ... 데이터 타입 + String(클래스 타입)
			
			public static int 더하기 (int x, int y) {
				return x + y;
			}
			public static int 빼기 (int x, int y) {
				return x - y;
			}
			//문제 나누기, 곱하기 메소드 만들기!
			public static int 나누기 (int x, int y) {
				return x / y;
			}
			public static int 곱하기 (int x, int y) {
				return x * y;
			}
			
			public static void main(String[] args) {
			int 결과 = 더하기 (20, 10);
			int 결과2 = 빼기 (30, 5);
			int 결과3 = 나누기 (10, 5);
			int 결과4 = 곱하기 (2, 2);
			
			System.out.println(결과);
			System.out.println(결과2);
			System.out.println(결과3); 
			System.out.println(결과4);
		}
		
		
		
	}/////

