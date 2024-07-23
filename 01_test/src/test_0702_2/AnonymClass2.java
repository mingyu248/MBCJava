package test_0702_2;

public class AnonymClass2 {
  


  void method(DemoInterface demoInterfacce) {
    demoInterfacce.order();
  }
  
  void method2(DemoInterface demoInterfacce) {
    demoInterfacce.order();
  }
  
  public static void main(String[] args) {
    
    // 익명 구현 객체(클래스), new DemoInterface() 는 생성자 아니다
    new AnonymClass2().method(new DemoInterface() {
      @Override
      public void order() {
        System.out.println("인터페이스의 order 추상 메소드가 오버라이딩 됨");
      }
    });
    
    // 참고) 익명 클래스 => 람다 대수 프로그래밍 : 변환 가능
    new AnonymClass2().method2(()->System.out.println("람다"));
    
    
  }
}

interface DemoInterface {
  // 추상 메소드. 구현
  void order();
  static void stOrder() {
    System.out.println("스태틱 stOrder 메소드 실행");
  };
}