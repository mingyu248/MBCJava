package test_0612;

// 추상 클래스 : 추상(설계, 지시/명령) => 구현(구체)
public abstract class A34_Ex41 {
  
  // abstract String job;    // (X)
  String job;   // 변수에는 abstract를 달지 않는다
  
  A34_Ex41() {
    System.out.println("추상 클래스이 생성자 실행됨");
  }
  
  // 추상 메소드
  // ex) 공부해라(지시 : 추상) => 공부할게요(구현)
  abstract void order();
  
  static void stMethod() {}
  
  // abstract void work() {}    // (X)
  void work() {}
  
  
  public static void main(String[] args) {
    
    // 추상 클래스의 생성자만으로는 인스턴스 생성 불가
    // A34_Ex41 aClass = new A34_Ex41();    // (X)
    A34_Ex41 aClass = new A35_Ex41();    // (O)
    aClass.order();
    
  } // main 메소드 끝

}
