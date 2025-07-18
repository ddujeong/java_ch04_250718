package chapter04_02;


public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int score = 80;
//		
//		if (score > 70) {
//			System.out.println("통과!!");
//		}
		int i = 0;
		
		while (i <= 5) {
			i++;
			System.out.println("통과!!");
			
		}
		// true 값이 나오면 false가 나올때까지 반복
		// 무한 루프 
		
		int kor = 80;
		
		do {
			System.out.println("코리아 파이팅!!");
		} while(kor >= 100);
		
	}

}
