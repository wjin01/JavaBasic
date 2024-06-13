package day05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		
		//배열의 정렬
		//정렬을 하는 방법 9~10개 정도 됨
		//선택정렬, 버블정렬 <- 좀 느림
		
		Integer[] arr = {5, 23, 1, 43, 200, 100, 40};
		
//		Arrays.sort(arr); //오름차순
		
		Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 할때는 배열선언 Integer
		System.out.println(Arrays.toString(arr));
		
		//바깥 반복문 - 회전수
		//안쪽 반복문 - 자리바꿈
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) { //i는 대상, j는 비교대상
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
