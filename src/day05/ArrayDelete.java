package day05;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//배열의 삭제 - 사실 배열은 삭제가 없음
		//마치 삭제된것처럼 보이게함
		/*
		 * 1.삭제할 위치 다음값들을 하나씩 당겨옴
		 * 2.길이 -1인 새로운 배열에 값을 옮겨담음
		 */
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int targetIndex = 5; //5번 인덱스 삭제
		
		//1.
		for(int i = targetIndex; i < arr.length -1; i++) {
			arr[i] = arr[i+1];
		}
		
		//2.
		int[] newArr = new int[arr.length -1];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		//기존 arr을 삭제
		arr = newArr;
		newArr= null;
		
		System.out.println(Arrays.toString(arr));
	}
}
