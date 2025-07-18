package chapter04_02;

import java.util.Iterator;

public class Fortest3 {
	
	public static void main(String[] args) {
//		// 중첩 for문 연습
//		for(int i = 1;i<=4; i++) {
//		// 4번 반복(바깥쪽for문)
//			System.out.println("안녕하세요!");
//			for (int j = 1; j <= 5; j++) 
//				//5번 반복 (안쪽 for문1)
//				System.out.println("반갑습니다!");
//			for (int k = 1; k <= 3; k++) 
//				//3번 반복 (안쪽 for문2)
//					System.out.println("감사합니다!");
//			
//			// 바깥쪽 for문 1번당 안쪽 for문1 5번 반복
//			// 안쪽 for문 1번당 안쪽 for문2 3번 반복
//		}
		
//		for (int i = 0; i < 6; i++) {
//			System.out.println("*");
//		}
//	
//		for (int i = 0; i < 4; i++) {
//			System.out.print("*");
//			
//			for (int j = 0; j < 4; j++)
//				System.out.print("*");
//			System.out.println();
//		
//		}

		
//		for (int i = 0; i < 1; i++) {
//			System.out.print("*");
//			System.out.println();
//			for (int j = 0; j < 2; j++) 
//				System.out.print("*");
//				System.out.println();
//				for (int j2 = 0; j2 < 3; j2++) 
//					System.out.print("*");
//					System.out.println();
//					for (int k = 0; k < 4; k++) 
//						System.out.print("*");
//					}
//		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < i+1; j++){
				System.out.print("*");
			}
		System.out.println();
		}
	
//			
//			
		
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//개어려움
	}
				
}

