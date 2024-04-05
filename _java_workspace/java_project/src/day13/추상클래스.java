package day13;

public class 추상클래스 {

	public static void main(String[] args) {
		/* 추상클래스 : 미완성 클래스
		 * 추상메서드 : 메서드의 선언부만 있꼬, 구현은 없는 메서드
		 * 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 추상클래스 : 미완성 클래스 => 객체를 생성할 수 없다.
		 * 키워드 : abstract
		 * abstract 클래스명 / abstract 메서드명
		 * abstract 리턴타입 메서드명(매개변수); => 추상메서드
		 * - 추상클래스에서 abstract 키워드는 반드시 써야 함.
		 * - 인터페이스에서는 abstract 키워드생략 가능.(어차피 추상메서드만 존재)
		 * - 상속을 받아야 하는 부모클래스를 작성할 경우.
		 * - 특정 메서드가 자식들에게 자주 오버라이딩 되는 상황일 때 사용
		 * - 상속받은 클래스에 추상메서드가 있다면 반드시 구현.
		 * 
		 */
		
		Dog1 d1 = new Dog1("뽀삐","개과");
		d1.pirntInfo();
		d1.how1();
		d1.eating("개껌");
		System.out.println("-----------");
		Panda p = new Panda("하오쯔","곰과");
		p.pirntInfo();
		p.how1();
		p.eating("대나무");
		
	}

}


//추상클래스 : abstract
abstract class Animal1{
	public String name;
	public String category;
	
	public void pirntInfo() {
		System.out.println(name+"("+category+")");
	}
	
	abstract public void how1(); //추상메서드
}

class Dog1 extends Animal1{ //반드시 구현해야함.
	private String eat;
	
	public Dog1 (String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	public void how1() {
		// TODO Auto-generated method stub
		System.out.println(name+"울음소리 > 멍멍~!");
		
	} 
	
	public void eating(String eat) {
		this.eat = eat;
		System.out.println(name+"은 "+eat+"을(를) 좋아합니다");
	}
	
}

class Panda extends Animal1{
	private String eat;
	
	public Panda(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	public void how1() {
		// TODO Auto-generated method stub
		System.out.println("그르르르를");
	}
	public void eating(String eat) {
		this.eat = eat;
		System.out.println(name+"은 "+eat+"을(를) 좋아합니다");
	}
	
	
	
}

