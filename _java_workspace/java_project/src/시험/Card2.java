package 시험;

public class Card2 {
	
	private int num;
	private char shape;
	
	public Card2() {
		this.num = 1;
		this.shape = '♥';
	};
	
	public void printCard() {
		System.out.print(shape);
		if(num == 1) {
			System.out.print("A ");
		}else if(num == 11){
			System.out.print("J ");	
		}else if(num == 12){
			System.out.print("Q ");	
		}else if(num == 13){
			System.out.print("K ");	
		}else {
			System.out.print(num+" ");
		}
		
		
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num>0 && num<14) {
			this.num = num;
		}else {
			num = 1;
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		
		switch (shape) {
		case '♥': case'◆': case'♣': case '♠':
			this.shape = shape;
			break;
			default:
				this.shape = '♥';
		}	
	}

}
