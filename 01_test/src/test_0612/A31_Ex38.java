package test_0612;

public class A31_Ex38 {
  
  static int num;
  
  static void staticMethod() {
    System.out.println("static 메소드 호출!");
  }
  
  public static void main(String[] args) {
    
    // static : 메모리 주소가 프로그램 종료시 까지 (고)정적(그대로 지속)
    // 정적 요소는 서로 다른 객체라도 공유. 모든 객체가 하나의 정적 요소를 참조하는 형태
    // 모든 객체가 공통적으로 가지는 값이나 기능 등 (ex 파이값, 단위, 더하기기능 등)
    System.out.println(num);
    System.out.println(A31_Ex38.num);
    staticMethod();
    A31_Ex38.staticMethod();
    
    A31_Ex38 className = new A31_Ex38();
    className.staticMethod();    // 인스턴스를 생성해서 사용할 수도 있지만 클래스 이름으로 사용하는 것이 적절하다
    
  } // main 메소드 끝
}
