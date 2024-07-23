package test_0612;

public class pr12 {

  public static void main(String[] args) {
    
    A b = new B();
    A c = new C();
    A d = new D();
    
    b.test();
    c.test();
    d.test();
    
    System.out.println(b instanceof A); // true
    System.out.println(c instanceof A); // true
    System.out.println(d instanceof A); // true
    
    System.out.println(b instanceof B); // true
    System.out.println(c instanceof B); // false
    System.out.println(d instanceof B); // false
    
  }
}

class B implements A {
  @Override
  public void test() {
    System.out.println("BBB");
  }
}
class C implements A {
  @Override
  public void test() {
    System.out.println("CCC");
  }
}
class D implements A {
  @Override
  public void test() {
    System.out.println("DDD");
  }
}

interface A {
  void test();
}

