package chapter04_01;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {//무한루프
		System.out.println("***종료하려면 나이란에 0을 입력하세요.***");
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String str = scanner.nextLine();//문자열 받기
		System.out.print("당신의 나이를 입력하세요 : ");
		int age = scanner.nextInt(); //정수 받기
			if (age == 0) {
				System.out.println("프로그램을 종료합니다!!");
				break;
			}
		scanner.close();
		System.out.println("입력한 나이 : "+ age);
		System.out.println("입력한 이름 : "+ str);
		//숫자만 등호로 비교 가능 
		//문자는 등호로 비교 안됨
		}
		}

}
