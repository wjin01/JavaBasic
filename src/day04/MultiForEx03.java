package day04;

public class MultiForEx03 {

	public static void main(String[] args) {
		
		//바깥에 반복횟수에 따라서 다르게 회전하는 반복문
		
//		for(int i = 1; i <= 5; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.println(i + " - " + j);
//			}
//		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		int star = 5;
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		System.out.println("---------------------------");
		
		/*
		 * ***** 1행 5번
		 * ****  2행 4번
		 * ***   3행 3번 
		 * **	 4행 2번
		 * *	 5행 1번
		 */
		
//		for(int i = 1; i <= star; i++) {
//			for(int j = 1; j <= star +1 -i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}
		
		for(int i = 1; i <= star; i++) {
			for(int j = star; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = star; j > 0; j--) {
				if(j > i) {
					System.out.print(" ");	
				} else {					
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------------");
		/*
		 *    *
		 *   ***
		 *  *****
		 * *******
		 */
		
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= star -1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		
	}
}
