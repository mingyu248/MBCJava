package test_0612;

public class A22_Ex30 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    // 
    String str1 = "홍길동";               // 1)
    String str2 = "홍길동";               // 2)
    String str3 = new String("홍길동");   // 3)
    String str4 = new String("홍길동");   // 4)
    String str5 = null;
    String str6 = null;
    
    // == 참조하는(가리키는) 메모리 주소값으로 비교
    // 1번, 2번은 메모리 주소를 공유한다 (스택에 저장된 주소가 같다 -> 참조하는 객체가 같다 -> == 연산에서 true 가 나온다)
    System.out.println("str1 == str2 : " + (str1 == str2));  // true
    System.out.println("str1 == str3 : " + (str1 == str3));  // false
    System.out.println("str3 == str4 : " + (str3 == str4));  // false
    System.out.println("str5 == str6 : " + (str5 == str6));  // true
    
    
    System.out.println("\n프로그램 종료...");
  } // main 메소드 끝
}
