package day05;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		
		//버블정렬 - 가장 느린 정렬방식
		//가장 큰 수를 뒤로 보냄
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		
		//바깥반복문이 회전수
		//안쪽반복문이 자리변경
		
//		for(int i = 0; i < arr.length -1; i++) {
//		
//			for(int j = 0; j < arr.length -1; j++) {
//				
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					
//				}
//			}
//			System.err.println(Arrays.toString(arr));
//		}
		
		
		//가장빠른정렬 - 퀵정렬
		Arrays.sort(arr);
		
		
	}
}
