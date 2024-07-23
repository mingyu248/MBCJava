package test_0612;

// clerk
public class A43_Ex44 implements A41_Ex44{
  
  @Override
  public void order() {
    System.out.println("order를 구현하다");
    
  }
  
  @Override
  public void order2() {
    A41_Ex44.super.order2();
    System.out.println("A41_Ex44 로부터 오버라이딩 된 A43_Ex44 default 메소드");
  }
  
  @Override
  public void orderFromCEO() {
    A41_Ex44.super.orderFromCEO();
  }
  @Override
  public void orderFromCTO() {
    A41_Ex44.super.orderFromCTO();
  }


  
}
