package test_0612;

// director
public interface A41_Ex44 extends A42_Ex44, A44_Ex44{
  
  // 인터페이스의 오버라이딩 => default 메소드
  @Override
  default void orderFromCEO() {
    System.out.println("A41_Ex44 에서 A42_Ex44 인터페이스의 메소드를 오버라이딩");
  }
  @Override
  default void orderFromCTO() {
    System.out.println("A41_Ex44 에서 A44_Ex44 인터페이스의 메소드를 오버라이딩");
  }
  
  void order();
  
  default void order2() {
    System.out.println("A41_Ex44의 order2 default 메소드");
  }
  
  // 정적 메소드만 private 가능
  // public static void staticMethod()
  private static void staticMethod() {
    System.out.println("static 메소드");
  }
  
  // private 인스턴스 메소드도 가능
  private void privateMethod() {
    System.out.println("private 메소드");
  }

  
}

// CEO,CTO -> director -> clerk