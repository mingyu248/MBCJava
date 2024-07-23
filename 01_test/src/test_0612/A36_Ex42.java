package test_0612;

// 지시, 틀만 잡아준다

// 인터페이스 
// 상위 계층 : ex) 사장, 부장, 이사...
// 대외적/대내적 : 개방적 관계(홍보, 지시/명령) => public
// abstract 생략 가능
public interface A36_Ex42 {
  
  // 멤버필드 = 정적(static) 상수(final)만 가능 => 생략 표기 가능
  // String spec;    // (X)
  public static final String spec4 = "CEO";   // 원본
  static final String spec3 = "CEO";          // public 생략
  final String spec2 = "CEO";                 // static 생략
  String spec = "CEO";                        // final 생략
  
  // Interfaces cannot have constructors
  // 생성자 (X) : 인터페이스는 수행(구현)의 의무가 없다 : 초창기
  // ex) 사장님은 (수행)일 안한다
  // A36_Ex42(){}    // (X)
  
  // ex) 사장님은 (수행)일 안한다
  // 인스턴스 메소드 사용 불가
  // void doIt(){}    // (X)
  
  // 추상 메소드 : 지시(명령)만 하고 구현은 다른곳에서 한다
  // abstract void order() {}    // (O)
  void order1();
  // 
  
  
  
  void order2();
  
  // 정적 메소드 만들 수 있다
  static void stataicMethod(){}
  
  // 메인 메소드 만들 수 있다
  public static void main(String[] args) {
    System.out.println("메인 메소드 실행");
    
    A36_Ex42 iClass = new A37_Ex42();    // 자동 형변환 = 업캐스팅 (자식쪽이 부모쪽에 갈 때 자동 형변환)
    iClass.order1();
    iClass.order2();
  }
  
  // protectied static final String spec5 = "CEO";    // (X)
  // private static final String spec6 = "CEO";    // (X)
  
  
  
  
}
