package day01;

public class VariableEx {
	
	public static void main(String[] args) {
		
		//변수는 선언과, 초기화 과정을 거칩니다.
		//데이터타입 이름;
		
		int num; //int는 정수를 저장하는 대표적인 유형
		
		
		//변수의 초기화
		num = 10;
		
		System.out.println(num);
		
		//변수의 선언과 초기화를 한번에
		int num2 = 20;
		//변수는 같은 이름으로 선언할 수 없음
//		int num2 = 30;
		
		//변수의 값을 변경
		num2 = 30;
		System.out.println(num2); //30
		
		//변수에 다른 변수의 값을 저장 할 수 있을까?
		int result = num + num2 + 10;
		System.out.println(result);
		//변수는 타입이 다르면 바로 저장 할 수 없습니다.
//		String str = 10;
		
		
	}
}
