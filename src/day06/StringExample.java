package day06;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		
		//문자열을 다루는 다양한 방법
		//문자열은 사실은 char 문자들의 배열이 합쳐진것
		//index 를 가집니다
		
		//문자열.메서드명()
		String str = "안녕하세요~";
		
		//문자열 인덱스번호 자르기
		char c = str.charAt(0);
		System.out.println("0번째 인덱스: " + c);
		//문자열길이
		System.out.println("문자열길이: " + str.length());
		//문자찾기
		System.out.println("녕이 있는 위치: " + str.indexOf("녕"));
		System.out.println(str.indexOf("흠")); //없는 문자라면 -1 반환
		//문자변경하기
		String r1 = str.replace("안녕", "hello"); //대상문자, 변경할문자
		System.out.println(r1);
		System.out.println(str);
		
		String str2 = "아 집에 가고 싶다~ ㅠㅠ";
		str2 = str2.replace(" ", ""); //원본 문자열이 공백삭제
		System.out.println(str2);
		
		//문자열 자르기
		System.out.println(str.substring(2)); //2번 미만 절삭
		System.out.println(str2.substring(0, 2)); //0이상 2미만 추출
		
		//문자열 자르기
		String str3 = "010-1234-5678";
		String[] r3 = str3.split("-");	
		String[] r4 = str3.split("");
		char[] r5 = str3.toCharArray();
		
		System.out.println(Arrays.toString(r3));
		System.out.println(Arrays.toString(r4));
		System.out.println(Arrays.toString(r5));
		
		//양측 공백제거
		String str4 = "  hello world  ";
		System.out.println(str4.trim());
		
		//문자열 비교
		System.out.println("홍길동".equals("홍길동")); //문자열 같으면 true
		System.out.println("홍길동".equals("이순신")); //문자열 다르면 false
		
		//문자열 대소 비교 (앞문자 아스키코드 - 뒤문자 아스키코드)
		System.out.println("ABC".compareTo("ABC")); //0 - 같은문자
		System.out.println("ABC".compareTo("ABD")); //-1 - 음수라면 뒤에문자가 사전적으로 뒤에있음
		System.out.println("ABC".compareTo("ABB")); //1 = 양수라면 뒤에문자가 사전적으로 앞에있음
		
		//문자열 합치기
		System.out.println(String.join("->","홍","길","동"));
		System.out.println(String.join("->","홍","길","동","입","니","다","."));
		
		System.out.println("홍" + "길" + "동");
		
		
	}
}
