package test_0612;

public class A39_Ex43_2 implements A38_Ex43_1, A38_Ex43_2 {

  @Override
  public void order1() {
    System.out.println("A39_Ex43_2에 오버라이드 된 메소드 실행(인터페이스 A38_Ex43_1)");
  }

  @Override
  public void order2() {
    System.out.println("A39_Ex43_2에 오버라이드 된 메소드 실행(인터페이스 A38_Ex43_2)");
  }
  
  @Override
  public void order4() {
    // Director 인터페이스의 default 메소드
    // A38_Ex43_1.order3();    // 부모 static 메소드 호출
    // super.order3();         // 부모 클래스의 메소드 호출(인터페이스라서 사용 불가)
    A38_Ex43_2.super.order4();
    System.out.println("A39_Ex43_2 default 오버라이드 된 메소드");
  }

}