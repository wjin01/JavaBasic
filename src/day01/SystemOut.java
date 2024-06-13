package day01;

public class SystemOut {
	public static void main(String[] args) {
		
		//main이라고 적고 ctrl + 스페이스
		//일단, 모든 프로그램 코드는 main 안에서 적어줍니다.
		
		
		//출력형식 3가지
		//print() - 개행이 없음
		System.out.print("개행이 없습니다. 주로 가로출력 할 때 사용합니다.\n");
		
		//ptintln() - 자동으로 마지막에 개행을 넣어줌, 주로 사용합니다.
		System.out.println("마지막에 개행을 추가");
		
		//printf() - 출력형식을 지정하고, 값을 넣어주는 출력문
		/*
		 * 서식 문자
		 * %d - 정수를 받음
		 * %f - 실수를 받음
		 * %s - 문자열을 받음
		 */
		System.out.printf("안녕하세요?\n");
		System.out.println("오늘은 5월 7일 입니다.");
		System.out.printf("오늘은 %d월 %d일 입니다.", 5, 7);
		
		System.out.printf("\n%s님의 생일은 %d월 %d일 입니다", "김우진", 8, 19);
		//실수 서식문자는 출력 자리수를 조정 할 수 있습니다
		System.out.printf("\n원주율은 %.3f입니다.", 3.14);
		
		
	}
}
