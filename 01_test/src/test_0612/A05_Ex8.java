package test_0612;
import java.util.Scanner;

public class A05_Ex8 {
	public static void main(String[] args) {
		
		int num1 = 1;
		// 지역 변수의 범위 지역성(범위 한계)
		{
			int num2 = 2;
			System.out.println("괄호 안 num1 : "+num1);
			System.out.println("괄호 안 num2 : "+num2);
		}
		System.out.println("괄호 밖 num1 : "+num1);
		System.out.println("괄호 밖 num2 에러");
		
		// System.out.println("num2 : "+num2);	// (X) 괄호 안에서만 적용됨
		
		
		
		
	}
}
