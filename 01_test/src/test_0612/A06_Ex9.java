package test_0612;

import java.util.Scanner;

public class A06_Ex9 {
	public static void main(String[] args) {
		
		System.out.println("a\n\n");
		System.out.println("b");
		// 포맷(형식) 문자열
		System.out.printf("%d월 %d일 %s 수업시간 %n", 6, 17, "자바");
		
		// 표준 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str1 = sc.next();
		System.out.println("str1 : " + str1);
		

		sc.close();
		

		
		
		
		
	}
}
