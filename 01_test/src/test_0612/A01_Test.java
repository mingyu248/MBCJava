package test_0612;

import java.util.Scanner;

public class A01_Test {
	
	public static void main(String[] args) {
		int num;	// 정수형 변수 num 생성 : 변수 선언(등록)
					// 메모리에 공간(int 4byte)을 확보하고 이름은 num으로 지정
		num = 1;	// 데이터 값 입력
		
		// int num2 와 num2 = 1 을 한번에. 변수 선언과 동시에 값 할당
		int num2 = 1;
		// int num = 1;	// 위쪽에 num 이라는 변수이 이미 생성되어 있어서 에러가 발생한다
		
		int a=1;
		int b=a;
		b=2;
		
		char ch1, ch2, ch3, ch4, ch5, ch6, ch7;
		ch1 = 'A';			// 문자로 표현
		ch2 = 65;			// 10 진수, 아스키코드
		ch3 = 0101;			// 8 진수, 앞에 0을 붙인다
		ch4 = 0x41;			// 16 진수, 앞에 0x를 붙인다
		ch5 = 0X41;			// 16 진수, 대문자도 가능
		ch6 = 0b1000001;	// 2진수(binary), 0b 를 붙인다
		ch7 = '\u0041';		// unicode (UTF-8)
		// ch7 = '\U0041';	// 대문자 에러. 대문자는 허용하지 않음
		
		System.out.println("ch1 : " + ch1 +"\n"+"ch2 : "+ch2 +"\n"+"ch3 : "+ch3
				 +"\n"+"ch4 : "+ch4 +"\n"+"ch5 : "+ch5 +"\n"+"ch6 : "+ch6 +"\n"+"ch7 : "+ch7);
		
		
		
	}
}


