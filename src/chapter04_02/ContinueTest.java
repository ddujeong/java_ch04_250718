package chapter04_02;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=10; i++) {
			if (i % 2 == 0) {
				continue;
				//false 값이 나오면 12번 행이 실행 되지 않고 7번 행의 증감식으로 다시 돌아감
			}
			System.out.println(i);
		}
	}

}
