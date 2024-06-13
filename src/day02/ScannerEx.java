package day02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		//입력
		//1. 스캐너를 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 기능을 활용해서 데이터를 입력받음
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next(); //공백앞까지 문자열을 받음
		
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt(); //정수를 입력받음	
		
		System.out.print("신장을 입력해주세요 : ");
		double cm = scan.nextDouble(); //실수를 입력받음
		
		//nextLine()과 다른 입력구문을 사용하면, 입력이 무시되고 넘어가는 경우가 있는데,
		System.out.print("자기소개 : ");
		scan.nextLine(); //위에서 남은 엔터값을 소모 (nextLine은 엔터값을 소모)
		String intro = scan.nextLine(); //공백포함한 문자열을 받음
		
		System.out.println();
		System.out.println("이름은 " + name + ", 나이는 " + age);
		System.out.println("신장은 " + cm);
		System.out.println("자기소개 : " + intro);
		
		
		//3. 스캐너 종료
		scan.close();
		
		
		
	}
}
