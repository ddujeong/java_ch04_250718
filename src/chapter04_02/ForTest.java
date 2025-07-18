package chapter04_02;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated me
		
		
		// int i = 1; 초기화식 (변수이름은 i, j, k 로 만듦, 정수만 사용)
		// i < 6 조건식 (true, false 값이 나오게 함)
		// i++ 증감식 (i = i + 1)
		int a = 0;
		
		for (int i = 1; i < 6; i++ ) {
			//for (초기화식;조건식;증감식) { }
			System.out.println("안녕하세요");
			//System.out.println("i값 : " + i);
			/* 안녕하세요
			 * 안녕하세요
			 * 안녕하세요
			 * 안녕하세요
			 * 안녕하세요*/
		}
		// 0 부터 100사이의 짝수만 출력하세요
		for (int i = 0; i <=100; i= i+2) {
			System.out.println(i);
		}	
		// 1 부터 100사이의 짝수만 출력하세요
			for (int i = 0; i <=100; i= i+2) {
				if ( i % 2 == 0) {
				System.out.println(i);
				}
			}
				
		
		// 1~100사이의 홀수만 출력하세요
		for (int i = 1; i <=100; i= i+2) {
			System.out.println(i);
		}
		// 1 부터 100사이의 홀수만 출력하세요
		for (int i = 1; i <=100; i= i+2) {
			if ( i % 2 == 1) {
			System.out.println(i);
			}
		}
		
		int total = 0;
		int kor = 95;
		int eng = 80;
		int math = 70;
		total = kor + eng + math; // total = 245
		//세종목의 합 
		total = total + kor;  // total = 95 (0 + 95)
		total = total + eng;  // total = 175 (95 + 80)
		total = total + math; // total = 245 (175 + 70)
		//누적식
		
		//1~100까지의 모든수의 합을 구하시오.
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			sum = sum + i;
			//누 적 식
			//System.out.println(sum);
			// 내부에 작성시 반복되어 출력
		}
		
		System.out.println(sum);
		// for 외부에 작성해야 원하는 값만 출력
	
	}

}
