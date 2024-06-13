package day04;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		//5를 입력을 받음
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); //반복의 횟수를 결정할 입력
		
		int i = 1;
		while(i <= num) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println("Case #" + i + ": " + (a + b));
			
			i++;
		}
		
		System.out.println("반복문 종료");
	}
}
