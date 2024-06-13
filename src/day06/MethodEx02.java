package day06;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수(Parameter)
		 * 1.매개변수는 메서드 호출시 전달하는 매개체 입니다
		 * 2. 매개변수를 받지 않으면 () 비워두면 되고 여러개 받고 싶다면 , 로 연결합니다
		 */
		int result = calSum(10);
		System.out.println("1~10까지 합: " + result);
		System.out.println("1~10까지 합: " + calSum(100));
		
		System.out.println("결과: " + calSum2(1, 3, "k"));
		System.out.println("결과: " + calSum2(1, 30, "k"));
		
	}
	
	//어떤값을 매개변수로 받아서 매개변수 까지의 합계
	static int calSum(int end) {
		
		int sum = 0;
		for(int i = 0; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}

	//시작값, 끝값, 문자열을 전달 받아 문자열을 반복하여 변환하는 메서드
	static String calSum2(int a, int b, String c) {
		String str = "";
		
		for(int i = a; a <= b; a++) {
			str += c;
		}
		
		return str;
	}
	
}
