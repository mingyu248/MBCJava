package test_0612;

public class A02_Test2 {

	public static void main(String[] args) {
		
		// 연산(operation, calculation)
		char ch1 = 'A' + 1;		//A(65) 다음 숫자 B(66) 저장
		// char ch2 = "A";	// 문자(1개) 는 '(작은따옴표) 만 사용 가능 "(쌍따옴표) 사용 불가
		
		// 형변환
		char ch2 = "A".charAt(0); // 문자열에서 0번째 요소를 추출하는 메소드
		//String 형에서 첫번째 요소를 char 형으로 반환해줘서 char 형 ch2에 넣을 수 있다
		
		//char ch3 = -1; 0~65535 사이만 허용, int 형에서 char 형으로 변환 불가
		char ch3 = (char)-10;	// 65526 에 해당하는 문자가 들어간다
		char ch4 = (char)-65471;	// 65 에 해당하는 문자(A) 가 들어간다
		
		char ch5 = '\u0000';	// null
		char ch6 = 0;			// null
		//char ch7 = '';	// 에러
		
		var ch7 = 14;	// since Java 10 : Javascript 변수 선언법
		// 자료형을 따로 언급하지 않고 입력되는 값을 통해서 자료형 결정
		
		System.out.println("ch1 : " + ch1);	// B 출력
		System.out.println("ch2 : " + ch2);	// A 출력
		System.out.println("ch3 : " + ch3);	
		System.out.println("ch4 : " + ch4);	
		System.out.println("ch5 : " + ch5);	
	}

}
