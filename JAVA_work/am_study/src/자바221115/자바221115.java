//package 자바221115;
////java,util 패키지 안에 들어있는 ArrayList라는 클래스를 사용하려면 import 해야 함!
//import java.util.ArrayList;
//import java.util.List;
//
//class Student{
//	String name;
//	int height;
//	//문제1. 필드변수에 값을 초기화할 수 있는 생성자 만들기
//	Student(String name, int height){
//		this.name = name;
//		this.height = height;
//	}
//}
//public class 자바221115 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//문제2. 학생 클래스 3개를 만들어서 아래 값 출력하기
//		//이름 : 홍길동,  키 : 179
//		//이름: 김길동, 키 : 185
//		//이름 : 이길동, 키: 172
//		Student s1 = new Student("홍길동", 179);
//		Student s2 = new Student("영주", 884);
//		Student s3 = new Student("홍길동", 179);
//				
//		
//		
//		//문제3. 학생클래스 ArrayList에 add하기
//		for(i=0; i<ArrayList; i++) {
//			Student(String name, int height){
//				this.name = name;
//				this.height = height;
//				
//		List<Student> list = new ArrayList<Student>();
//		list.add(s);
//		list.add(s2);
//		list.add(s3);
//		
//		//for문으로 학생 출력
//		//일반 for문으로 출력
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("이름 :"+list.get(i).name + ", 키 :"+list.get(i).height);
//		}
//		System.out.println("=========================================================");
//		//향상된 for문으로 출력
//		for(Student student : list) {
//			System.out.println("이름 : "+student.name + ", 키 :"+student.height);
//		}
//			}
//		}
//	}
//	
//
//}
