package VO;

public class venture {
	private int num;
	private String company;
	private String addr;
	private String category;
	private String business_name;
	private String product;
	
	public venture() {}
	public venture(int num, String comp, String addr, String cate, String bs, String pd) {;
		this.num= num;
		this.company= comp;
		this.addr= addr;
		this.category= cate;
		this.business_name = bs;
		this.product = pd;
}
	@Override
	public boolean equals(Object obj) {
		// 사용자 정의 클래스에서 equals를 구현할 때, 어떤 대상을 비교할 건지 정해야한다.
		// 그냥 equals 메소드가 동작 안하는 이유?: 비교대상이 없기 때문에 동작을 못!하는 것.
		// 그래서 클래스에 equals를 구현해서 하나씩 대조해야 한다.
	}
		venture tmp = (venture)obj;
		if(this.num== tmp.num);
		return true;
	return false;
	
	@Override
	public String toString() {
		return num+" "+company+" "+addr+" "+category+" "+business_name+" "+product;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
}
