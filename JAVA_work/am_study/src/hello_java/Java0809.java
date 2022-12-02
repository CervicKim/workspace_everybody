package hello_java;

public class Java0809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //여기서 코딩 구현~~~
		 int x = 10;
		 x = x * 2; // x 곱하기 2 결과가 x에 다시 대입 <- 대입은 오른쪽에서 왼쪽으로
		 // 문제 1. x의 최종값은? 20!!
		 System.out.println(x + "최종값");
		 
		 x = 30;
		 // x의 최종값은? 30
		 // 대입연산자는 기존의 있단 값을 무시하고 신규가 늘 맞다!
				 
		 int money = 55000;
		 int 거스름돈 = 0;
		 // 문제 2. 만원으로 거스름한 값 거스름돈 변수에 대입하기.
		 거스름돈 = money / 10000;
		 System.out.println(거스름돈 +"장"); // 거스름돈을 출력했을 때 5장
		 // 문제 4. 남은 돈 구하기! 결과 5000!
		 int 남은돈 = 0;
		 남은돈 = money % 10000;
		 System.out.println(남은돈+"원");
		 // 문제 3.
		 int y = 20;
		 y = y * 2;
		 y = y + y;
		 // y 최종 결과는? 80
		 System.out.println(y);
         
		 //문제 5.
		 int 국어 = 100;
		 int 수학 = 20;
		 int 영어 = 50;
		 
		 int 평균 = 0;
		 평균 = (국어 + 수학 + 영어) /3;
		 
		 System.out.println(평균+ "점");
		 
		 //문제 6. 옥수수수량과 감자수량을 더한 값을 최종수량에 대입하시오
		 int 옥수수수량 = 100;
		 int 감자수량 = 50;
		 int 최종수량 = 0;
		 최종수량 = 옥수수수량 + 감자수량;
		 System.out.println(최종수량 + "개");
		 // 최종수량 : 150
		 
		 // 문제 7. (어려운 사람들)
		 // 사과수량에서 불량사과를 제외한 값을 출력하시오.
		 int 사과수량 = 10;
		 int 불량사과 = 7;
		 int 상품 = 0;
		 상품 = 사과수량 - 불량사과;
	     System.out.println("상품"+ 상품 +"개");
	     
	     //문제 8. 거스름돈 구하기
	     //결과 -> 5만원 3장, 만원 2장, 오천원 1장
	     int 통장잔액 = 175000; // 17만 5천원
	     int 오만원 = 50000;
	     int 만원 = 10000;
	     int 오천원 = 5000;
	     int 오만원몇장 = 0;
	     int 만원몇장 = 0;
	     int 오천원몇장 = 0;
	     
	     오만원몇장 = 통장잔액 / 오만원;
	     System.out.println(오만원몇장+ "장");
	     통장잔액 = 통장잔액 % 오만원;
	     System.out.println(통장잔액 + "원");
	     만원몇장 = 통장잔액 / 만원;
	     System.out.println(만원몇장 + "장");
	     통장잔액 = 통장잔액 % 만원;
	     System.out.println(통장잔액+ "원");
	     오천원몇장 = 통장잔액 / 오천원;
	     System.out.println(오천원몇장 +"장");
	     
	     
	     //오만원몇장 = 통장잔액 / 오만원;
	     //통장잔액 = 통장잔액 % 오만원;
	     //System.out.println(오만원몇장 + "장");
	     //System.out.println(통장잔액 + "원");
	     //만원몇장 = 통장잔액 / 만원;
	     //통장잔액 = 통장잔액 % 만원;
	     //System.out.println(만원몇장 + "장");
	     //System.out.println(통장잔액 + "원");
	     
	     
	     
	   
	     
	     
	}

}
