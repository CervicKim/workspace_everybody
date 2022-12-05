package command;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import DAO.venture_DAO;
import VO.venture;

public class main_cmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		venture_DAO vdao = new venture_DAO();
		List<venture> list = vdao.Select_all();
		
		TreeSet<venture> sw = new Treeset<>();
		TreeSet<venture> build = new Treeset<>();
		
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			venture temp = it.next(); //ArrayList에의해 저장된 기업객체 하나씩을 temp에 저장
			if(temp.getCategory().contains("정보처리"))
				sw.add(temp);
			if(temp.getCategory().contains("건설"))
				build.add(temp);
		}
		
		System.out.println(sw);
		
		
		
		// treeset 메소드 (검색용)
		// floor(객체) - 지정된 객체와 같은 객체를 찾아서 반환하거나, 없으면 작은 값 중에서 가까운 객체를 반환.
		// haedSet(객체) - 지정된 객체보다 작은 객체를 모두 반환
		// tailSet(객체) - 지정된 객체보다 큰 객체를 모두 반환
		// higher(객체) - 지정된 객체보다 큰 값을 가진 객체중에서 가장 가까운 객체, 없으면 null을 반환.
		// lower(객체) - 지정된 객체보다 작은 값을 가진 객체 중에서 가장 가까운 객체, 없으면 null
		// subSet(객체 1, 객체 2) - 범위 검색, 객체 1부터 객체 2전까지 객체들 반환
		
		
		List<venture> sw_list = new ArrayList<>(sw);
		System.out.println(  sw.floor(sw_list.get(5)));
		
		System.out.println(  sw.headSet(sw_list.get(3)));
		System.out.println(  sw.lower( sw_list.get(10)));
		
		System.out.println(  sw.subSet(sw_list.get(2), sw_list.get(4)));
		
		venture srh = new venture();
		srh.setCompany("(주)고");
		sw.add(srh);
		System.out.println(  sw.headSet(srh));
		// TreeSet에서 검색이 되는 방법 : 이진트리 안에 저장 되어있는 값 기준으로 검색
		// 이진트리 안에 정장되어있는 값은 객체의 주소값이 저장 되어있다.
		// 검색시, 저장되어있는 순서에 의해서 결과값이 나온다. 
		// 그러므로 위와 같이 검색하고자하는 회사이름을 따로 입력해서 객체를 생성하여, 검색에 
		// 사용하는 방식은 treeset 안에 없는 값이기 때문에 검색이 이루어지지 않는다. 되는 경우도 있으니 무조건은 아님.
		
		
		//이진트리.. 알고리즘 검색 이런 건가봐.. 
		
		
		
		Set<String> category = new HashSet<>();
		//Set - 중복 허용X
		
		//It 이거 일회용이라 다시 쓰려면?
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			category.add(it.next().getCategory());
		}
		Set<venture> retail = new HashSet<>(); // 도소매업
		Set<venture> sw = new HashSet<>(); // 정보처리, SW
		Set<venture> build = new HashSet<>(); // 건설, 운수
		
		it = list.iterator(); //밑에서 다시 쓰는 수 밖에 없다
		while(it.hasNext()) {
			venture data = it.next();//벤처데이터들을 하나씩 data에 저장하기
			if(data.getCategory().contains("도소매업"))
				retail.add(data);
			if(data.getCategory().contains("정보처리"))
				sw.add(data);
			if(data.getCategory().contains("건설"))
				build.add(data);
		}
		venture a = new venture(list.get(0).getNum(), list.get(0).getCompany(),
				list.get(0).getAddr(), list.get(0).getCategory(),list.get(0).getBusiness_name(),
				list.get(0).getProduct());
		
		venture b = new venture(list.get(0).getNum(), list.get(0).getCompany(),
				list.get(0).getAddr(), list.get(0).getCategory(),list.get(0).getBusiness_name(),
				list.get(0).getProduct());
		
		if( a.equals(b) )
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		// 차집합, 교집합, 합집합
		// 주소를 기준으로....
		
		//집합의 요소를 만들어보자~
		
		Set<String> name1 = new HashSet<>();
		Set<String> name2 = new HashSet<>();
		
		name1.add("김유신"); name1.add("이순신"); name1.add("김춘추");
		name1.add("장영주"); name1.add("김기원"); name1.add("윤재영");
		name1.add("이지현"); name1.add("미지연"); name1.add("최윤도");
		
		name2.add("김민정"); name2.add("김민서"); name2.add("김춘추");
		name2.add("장영주"); name2.add("이종빈"); name2.add("윤재영");
		name2.add("이지현"); name2.add("변수정"); name2.add("정수Lee");
		
		
		Set<String> hab = new HashSet<>();
		Set<String> cha = new HashSet<>();
		Set<String> gyo = new HashSet<>();
		
		Iterator<String> test = name1.iterator();
		while(test.hasNext()) { // name1의 데이터에 hab집합 저장
			hab.add(test.next());
		}
		test=name2.iterator();
		while(test.hasNext()) { // name2의 데이터들이 hab에 있는지. 비교하고 없으면 저장.
			String name=test.next();
			if(hab.contains(name)) // hab내부에  name 값이 있는가?
				continue;
			hab.add(name);
		}
		System.out.println( hab );
		
		test= name2.iterator();
		while(test.hasNext()) { //name2와 name1의 차집합, name2에서만 있는 이름 찾기
			String name = test.next();
			if(name1.contains(name))
				continue;  
				gyo.add(name);
		}
		System.out.println(gyo);
	} 


}
