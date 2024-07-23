package test_0702_2;

public class OuterClass2 {
  
  // 내부 인터페이스. 인터페이스도 내부에 쓸 수 있다
  interface InnerInterface {
    void abstMethod();
  }
  
  
  void method() {    // 3. 호출됨
    // 지역/익명 구현 클래스. new InnerInterface() 생성자 아니다
    InnerInterface obj = new InnerInterface() {    // 4. InnerInterface 객체가 만들어짐과 동시에
                                                   // 6. obj 에 오버라이딩 된 InnerInterface 클래스의 객체가 들어간다
      @Override    // 5. 오버라이드. InnerInterface 클래스의 abstMethod 메소드를 오버라이드 한다
      public void abstMethod() {
        System.out.println("내부 인터페이스 구현");
      }
    };
    obj.abstMethod();    // 7. 오버라이딩 된 abstMethod 메소드가 실행된다
  }
  
  public static void main(String[] args) {
    
    OuterClass2 outer = new OuterClass2();    // 1. OuterClass2 클래스의 outer 클래스 생성
    outer.method();    // 2. outer(OuterClass2 클래스) 객체의 method 메소드 호출
  }
}
