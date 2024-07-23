package test_0612;

public class A04_Ex7 {

	public static void main(String[] args) {
		
		
		// String str1 = "'강'";		// (O)
		// String str1 = ""강"";		// (X)
		String str1 = "\"강\"";		// (O)
		System.out.println("str1 : "+str1);
		
		System.out.println();
		String str2 = "자바\t\tjava";
		String str3 = "자바		java";
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
		System.out.println();
		String str4 = "자바\njava";		// 줄바꿈
		System.out.println("str4 : "+str4);
		
		// 텍스트 블럭 : 
		System.out.println();
		String str5 = """
				자바
				스프링
				파이썬
				""";
		System.out.println("str5\n"+str5);
		
		// String str7 = (String)(1 + 2 + 3 + 4 + 5);	// (X)
		
		//숫자 하나에 쌍따옴표 붙여서 문자열로 만들기
		String str6 = (1 + 2 + "3" + 4 + 5);	// (O)	(1+2), 3, 4, 5 -> 3345
		System.out.println("str6 : "+str6);		
		
		String str7 = Integer.toString(1 + 2 + 3 + 4 + 5);	// int -> String 문자 그대로 변환 (아키스코드 X)
		System.out.println("str7 : "+str7);
		
		Object obj = "java";
		String str8 = (String)obj;
		// 참조 자료형(클래스 등)의 경우는 상속/구현 관계가 있으면 () (캐스팅 연산자)로 형변환이 가능
		System.out.println("str8 : "+str8);
		
	}
}
