package chapter04_01;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주사위를 굴려서 3이 나오면 "삼이 나왔습니다."를 출력하는 프로그램
		// System.out.println(((int)(Math.random()*6))+1);
		// 0~1 사이의 수중에서 소수점 16자리까지 가진 수를 랜덤으로 추출해주는 라이브러리
		
		int number = ((int)(Math.random()*6))+1;
		//1,2,3,4,5,6 중에 랜덤으로 하나를 지정
		//0 ~ 0.999.. 라서 0.9*6 = 5.4니까 + 1 해줘야 1 ~ 6까지 값이 나옴
		if (number == 1) {
			System.out.println("일이 나왔습니다");
			System.out.println("11111111");
		} else if(number == 2) {
			System.out.println("이가 나왔습니다");
			System.out.println("22222222");
		} else if(number == 3) {
			System.out.println("삼이 나왔습니다");
			System.out.println("33333333");
		} else if(number == 4) {
			System.out.println("사가 나왔습니다");
			System.out.println("44444444");
		} else if(number == 5) {
			System.out.println("오가 나왔습니다");
			System.out.println("55555555");
		} else {
			System.out.println("육이 나왔습니다");
			System.out.println("66666666");
		}
	}

}
