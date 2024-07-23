package test_0612;

public interface A38_Ex43_1 {
  
  // 추상 메소드. 반드시 오버라이드 해줘야 한다
  void order1();
  
  // 오버라이드 안해줘도 된다
  default void order3() {
    
  }
}
