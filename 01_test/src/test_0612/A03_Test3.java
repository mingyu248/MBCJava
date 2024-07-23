package test_0612;

public class A03_Test3 {

	public static void main(String[] args) {
		
		byte num1 = 1;
		//num1 = 128;
		num1 = (byte)-129;
		System.out.println("num1 : "+num1);
		
		long num2 = 1;
		// int num3 = num2;		// long 을 int 에 넣을 수 없다
		int num3 = (int)num2;	// int 형으로 명시적 형변환(캐스팅)을 해준다
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		
		// int num4 = 1L;			// 대입 (X) 1L => long 데이터값 (접미사)
		// int num4 = 1l;			// 대입 (X) 1l => long 데이터값 (접미사)
		int num4 = (int)1L;			// long 타입 1을 int형으로 캐스팅하고 int 형 변수 num4 에 넣는다
									// int 최댓값 2147483647 보다 큰 수를 주면 오버플로우
		System.out.println("num4 : "+num4);
		
		int num5 = 'A';
		System.out.println("num5 : "+num5);
		
		long num6 = 25L;
		System.out.println("num6 : "+num6);
		
		System.out.println("int 최댓값 : " + Integer.MAX_VALUE);
		System.out.println("int 최솟값 : " + Integer.MIN_VALUE);
		
		int num7 = (int)7E3;		// 2 * 10의 3승 => 2000
		int num8 = (int)8E3;		// 2 * 10의 3승 => 2000
		System.out.println("num7 : "+num7);
		System.out.println("num8 : "+num8);
		
		int x = 2147483647;
		int y = 1;
		long z = x+y;
		System.out.println("z : "+z);
		
		int num9 = (int)2e3;	// 2 * (10의 3승) = 2000
		// int num9 = (int)2E3;	// 2 * (10의 3승) = 2000
		// int num9 = (int)2e3D;	// double 형으로 계산
		// int num9 = (int)2e3d;	// double 형으로 계산
		// int num9 = (int)2e3F;	// float 형으로 계산
		// int num9 = (int)2e3f;	// float 형으로 계산
		// int num9 = (int)1D;		// double
		// int num9 = (int)1d;		// double
		// int num9 = (int)1.0;		// double
		// int num9 = (int)1.0F;	// f를 붙여야 float로 취급이 된다
		// int num9 = (int)1F;		// 정수도 f를 붙여서 float로 취급 가능
		System.out.println("num9 : "+num9);
		
		// ex6 boolean
		boolean f = false;
		boolean t = true;		// true 소문자만 가능 (True 안됨)
		// boolean n = 1;		// 숫자 허용 안함
		// boolean c = 'false';	// (X)
		// boolean c = "false";	// (X)
		boolean b = Boolean.parseBoolean("false");
		System.out.println("b : "+b);
		
		int num10 = 1;
		boolean b2 = num10 == 1 ? true : false;		// 조건(삼항) 연산자
		
		
		
	}
}
