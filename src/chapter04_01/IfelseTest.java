package chapter04_01;

public class IfelseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 59;
		
		// 점수가 90점 이상이면 수, 80점 이상 90점 미만이면 우 , 70점 이상 80점 미만이면 미
		// 60점 이상 70점 미만이면 양을, 60점 미만이면 가를 출력
		if(score >= 90) {
			System.out.println("수");
			System.out.println("축하합니다!");
		} else if(score >= 80) {
			//else if() 상위 조건에서 false 가 나왔을때 검사
			System.out.println("우");
			System.out.println("축하합니다!");
		} else if(score >= 70) {
			System.out.println("미");
			System.out.println("축하합니다!");
		} else if(score >= 60) {
			System.out.println("양");
			System.out.println("탈락입니다");
		} //else 
		  { System.out.println("가");
			System.out.println("탈락입니다");
		}
		// if () {}  /  else {}  /  else if () {}  
		// else 생략가능
		
		  
		//value 값이 10이상 20미만이면 통과를 출력하시오.
		//10 <= value <20 (문법 x) -->    value >= 10 && value <20 (논리곱 사용) 
		  
		int value = 10;
		
		if (10 <= value && value <20) {
			System.out.println("통과");
		}
	}

 }
