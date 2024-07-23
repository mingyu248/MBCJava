package test_0612;

public class A40_Ex43 {

  public static void main(String[] args) {
    
    
    A38_Ex43_1 obj1 = new A39_Ex43_1();
    obj1.order1();    // A39_Ex43_1 의 메소드가 실행된다
    
    A38_Ex43_1 obj2 = new A39_Ex43_2();
    obj2.order1();    // A39_Ex43_2 의 메소드가 실행된다
    
    A38_Ex43_2 obj3 = new A39_Ex43_1();
    obj3.order2();    // A39_Ex43_1 의 메소드가 실행된다
    
    A38_Ex43_2 obj4 = new A39_Ex43_2();
    obj4.order2();    // A39_Ex43_2 의 메소드가 실행된다
    
    
    System.out.println("- 01 -");
    obj1.order3();    // A38_Ex43_1 의 디폴트 메소드 order3 를 A39_Ex43_1 에서 오버라이딩 하는데, A39_Ex43_1 객체로부터 생성된 A38_Ex43_1 객체라서 order3 사용 가능
    System.out.println("- 02 -");
    obj2.order3();    // 오버라이드 되어있지 않아 실행 안됨
    System.out.println("- 03 -");
    obj3.order4();    // 오버라이드 되어있지 않아 실행 안됨
    System.out.println("- 04 -");
    obj4.order4();    // A
    System.out.println("- 05 -");
    
    
  }

}
