package chapter04_01;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 점수가 70점 이상이면 합격을 출력하는 프로그램
		// if 조건문은 참 거짓만 출력할 수 있음
		// 여러가지 조건을 출력할 수 없음
		int score = 85;
		
		if(score >= 70) {
			System.out.println("합격");
			// 합격
		}
			System.out.println("축하합니다.");
			// 축하합니다.
			// if조건문의 중괄호 밖에 있어서 영향을 받지 않음
		// 점수가 70점 이상이면 합격 70점 미만이면 불합격을 출력하는 프로그램
		if(score >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		// 합격
		// true false 값 출력
		
		
	}
	

}
