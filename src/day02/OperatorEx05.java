package day02;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		//3항 연산식을 보기전에, 프로그램에서 랜덤값을 만드는 방법
		
//		double d = Math.random(); //랜덤한 실수를 돌려줌 
//		System.out.println(d); //0이상 ~ 1미만 랜덤실수값
		
		int d = (int)(Math.random() * 10); //1~10 랜덤한 수
		System.out.println("랜덤수: " + d);
		
	
		
 	}
}
