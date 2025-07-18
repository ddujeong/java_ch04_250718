package chapter04_01;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = ((int)(Math.random()*6))+1;
		
		switch (number) {
			case 1:
			System.out.println("일이 나왔습니다.");
			System.out.println("11111111");
			break;
			case 2:
			System.out.println("이가 나왔습니다");
			System.out.println("22222222");
			break;
			case 3:
			System.out.println("삼이 나왔습니다");
			System.out.println("33333333");
			break;
			case 4:
			System.out.println("사가 나왔습니다");
			System.out.println("44444444");
			break;
			case 5:
			System.out.println("오가 나왔습니다");
			System.out.println("55555555");
			break;
			case 6 :
			System.out.println("육이 나왔습니다");
			System.out.println("66666666");
			break;
			default :  // 모든 값에 해당되지 않을때 (ex else)
			System.out.println("육이 나왔습니다");
			System.out.println("66666666");
			break;
			
		}
	} 
	
}


