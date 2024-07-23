package test_0612;

// 직원
// 상속 => 계약
// 직원(하급자) => AbstractClass(상급자)
public class A35_Ex41 extends A34_Ex41 {

  A35_Ex41() {
    super();
    System.out.println("생성자 ");
  }
  
  // 추상(지기,설계)를 구현하다(일하다, 수행하다)
  @Override
  void order() {
    
    
    
    // super.order();    // 추상 메소드 차제 호출 (X)
    System.out.println("지시(추상)대로 수행하다");
  }

}
