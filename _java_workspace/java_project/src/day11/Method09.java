package day11;

public class Method09 {

	public static void main(String[] args) {
		/* 가변인자 메서드
		 * - 매개변수의 개수가 고정되어 있지 않는 경우 사용
		 * 
		 */
		Method09 m9 = new Method09();
		System.out.println(m9.sum(1,2,3,4,5));
		System.out.println(m9.sum(1,2,3,10,30,6,24,8,9));
		

	}
	
	public int sum(int...num) { //num 배열처럼 처리
		int result = 0;
		for(int tmp : num) { //향상된 for문
			result += tmp;
			
		}
		return result;
		
	}

}
