package test_0612;

// final public class 클래스명 ... -> 상속 막기
public class A33_Ex40 {
  
  // 정적(static) 상수(final)
  // public static final double PI = 3.141592;
  public final static double PI = 3.141592;
  
  public static void main(String[] args) {
    
    // static 은 지역블럭에서 만들 수 없다 
    // static final int NUM = 1;    // (X)
    final int NUM = 1;  // 캡슐화 => 보호
    // 
    // NUM = 2; // 대입 불가
    
    
    
  } // main 메소드 끝

}
