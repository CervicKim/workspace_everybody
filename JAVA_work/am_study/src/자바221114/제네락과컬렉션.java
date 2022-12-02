//package 자바221114;
//
//import java.util.ArrayList;
//import java.util.List;
//public class 제네락과컬렉션 {
//	public static void main(String[] args) {
//		
//////		//컬렉션즈: 자료구조 (스택, 힙, 맵, 셋..) 얘 덕분에 비전공자도 쉽게 배울 수 있게 됨!~
//////		
//////		//List 배열
//////		int[] array = {5, 7, 6, 10}; //배열 사용하는 방법 1 //값!을 정해줌
//////		int[] array2 = new int[4]; // 배열 사용하는 방법 2 //길이!를 정해줌!!
//////		
//////		System.out.println("배열 0번째 값" +array[0]); //배열 호출하는 방법
//////		System.out.println("배열 1번째 값"+array[1]);
//////		//List <<== 얘 놓치면.. 스프링 안드로이드.. 다 안됨..
//////		// <> : 제네릭
//////		// List : 컬렉션즈
//////		java.util.List<Integer> list = new ArrayList<Interger>(); //정수형을 담는 리스트(Int...)
//////		
//////		list.add(10);
//////		list.add(20);
//////		
//////		System.out.println("0번째 값: " + list.get(0)); //list 호출하는 방법
//////		System.out.println("0번째 값: " + list.get(1));
//////		
//////		//List 길이 출력
//////		System.out.println(list.size());
//////		list.remove(1); //1번쨰 요소 삭제 
//////		System.out.println(list.size());
//////		
////		//문제: 5의 배수를 출력하시오. 배열은 for문이랑 친구.. 
//////		List<Integer> numberList = new ArrayList<Integer>();
//////		numberList.add(5);
//////		numberList.add(7);
//////		numberList.add(13);
//////		numberList.add(15);
//////		
//////		//1번째 방법
//////		for(int i=0; i<numberList.size(); i++) {
//////			
//////			if(numberList.get(i) % 5 ==0) {
//////				System.out.println(numberList.get(i));
//////			}
//////		}
//////		//2번째 방법
//////		for(int i : numberList) {
//////			if(i % 5 == 0) {
//////				System.out.println("for each : "+i);
//////			}
//////		}
//////	
//////	numberList = new ArrayList<Interger>();
//////	numberList.add(50);
//////	numberList.add(100);
//////	numberList.add(300);
//////	numberList.add(99);
////	//문제 numberList 안에 있는 요소 총합 구하고, 100 이상인 요소가 몇 개인지도 출력하기
////	//for-each문으로 풀기
//////	for(int i=0; i<numberList(); i++) {
//////		
//////	}
//////		int sum = 0; //총합 구하는 변수
//////		int count = 0; //100이상인 숫자 몇 개인지 체크하는 변수
//////		for(int i : numberList) {
//////			sum += i;
//////			if(i >= 100) {
//////			++count;
//////			
//////			}
//////		}System.out.println(count);
////		
////	//문자를 담은 List //java에서 앞부분이 대문자이면? 클래스라는 뜻이다.
//////		List<String> wordList = new ArrayList<String>();
//////		wordList.add("아이스아메리카노");
//////		wordList.add("카페라떼");
//////		wordList.add("카페오레");
//////		wordList.add("아이스아메리카노");
//////		wordList.add("아이스아메리카노");
//////		wordList.add("아이스아메리카노");
//////		
//////		//자바에서 문자비교는 ==이 아니라! equals! ==는 int(정수)
////////		for(String item: wordList) {
////////			System.out.println(item);
////////		}
////////		for(wordList )
////////			i=0; i<= wordList count
//		
//		버거킹 골드와퍼 = new 버거킹();
//		골드와퍼.버거종류 = "치즈버거종류";
//		골드와퍼.버거가격 = 9000;
//		
//		버거킹 불고기버거 = new 버거킹();
//		불고기버거.버거종류 = "신토불이종류";
//		불고기버거.버거가격 = 8000;
//		//버거킹 클래스를 담는 List
//		List<버거킹> 버거킹선화점 = new ArrayList<버거킹>();
//		버거킹선화점.add(골드와퍼);
//		
//		//문제) 버거킹 선화점에 있는 모든 종류를 출력하시오
//		for(버거킹 선화점 : 버거킹선화점) {
//			System.out.println(선화점.버거종류);
//		}
//		