package test_0612;

public class A32_Ex39 {
  
  // 정적 블록
  static {
    System.out.println("정적 블럭-1");      // 1. 정적 블럭이 먼저 실행된다
  }
  {
    System.out.println("인스턴스 블럭");      // 4. 인스턴스 블럭이 실행된다
  }
  
  public static void main(String[] args) {
    
    new A32_Ex39();                        // 3. new로 인스턴스 생성을 해야...
    System.out.println("main");            // 5. 정적 블럭 실행 후 main이 실행된다
  } // main 메소드 끝
  
  static {
    System.out.println("정적 블럭-2");      // 2. main 보다 정적 블럭이 먼저 실행된다 
  }
}
