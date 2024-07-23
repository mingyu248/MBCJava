package test_0612;

public class A30_Ex37 {
  
  // 멤버(소속) 필드(속성, 변수) 선언
  // 초기값을 대입하지 않을 경우 묵시적 기본값 대입
  int fieldName;
  int i;
  String s;
  String s2;
  
  // 생성자 선언
  // 생성자(구축자 : constructor)
  // 클래스와 동명, 리턴 자료형 무표기
  // 인자 없는 생성자 : 기본 생성자(default constructor)
  // 기본 생성자는 다른 생성자가 없다면 컴파일 과정에서 자동으로 생성된다(묵시적 생성)
  // 다른 생성자가 존재할 경우 명시적 정의(써줘야 한다)
  A30_Ex37() {}    // 기본 생성자
  A30_Ex37(int fieldName) {
    this.fieldName = fieldName;    // 멤버 필드 초기화. (this.) : 자기 자신(self)의 인스턴스 객체 (키워드)
  }
  // 생성자 오버로딩 테스트
  A30_Ex37(int i, String s){
    this.i = i;
    this.s = s;
  }
  A30_Ex37(String s2, int i){
    this.i = i;
    this.s2 = s2;
  }
  //가변 인자는 마지막으로 와야 한다. (String ...s) -> 가변 인자는 배열 형태로 들어간다
  A30_Ex37(String ...strings){
    for(String ss : strings) {
      System.out.print(ss + " ");
    }
    System.out.println();
  }
  A30_Ex37(int i, String s, String s2){
    this(i,s);    // A30_Ex37(int i, String s) 생성자를 호출한다
  }
  
  
  // 메소드 선언
  // static(정적 메소드) 이 아닌 메소드를 인스턴스 멤버 메소드라고 한다
  int calSum(int n1, int n2) {
    return n1+n2;
  }
  int calDouble() {
    return fieldName*2;    // 필드에 저장된 값을 사용한다
  }
  // 메소드 오버로딩
  int calSum(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }
  
  public static void main(String[] args) {
    
    // 인스턴스 생성(객체 생성, 기본 생성자 사용)
    A30_Ex37 className = new A30_Ex37();
    // 참고 : 나눌 수 있다
    A30_Ex37 className2;
    className2  = new A30_Ex37();
    
    // 멤버 필드 값 할당
    className.fieldName = 5;
    
    // 생성한 객체이름으로 객체 내부 요소를 사용할 수 있다 (ex 객체명.필드명) (멤버 필드 접근)
    System.out.println("className.fieldName : " + className.fieldName);
    
    // 인스턴스 생성(멤버 필드를 초기화하는 생성자 사용(객체 생성 시 값 할당))
    A30_Ex37 className3 = new A30_Ex37(10);
    
    // 멤버 필드 접근(이용). 생성자 호출 시 필드값으로 10을 줘서 해당 필드를 출력하면 10이 나온다
    System.out.println("className3.fieldName : " + className3.fieldName);
    
    // 기본 멤버 메소드 호출(call)
    System.out.println("className3.calSum(3, 6) : " + className3.calSum(3, 6));
    
    // 클래스의 필드에 저장된 값을 사용하는 메소드 호출
    System.out.println("className3.calDouble() : " + className3.calDouble());
    
    // 오버로딩 테스트
    A30_Ex37 className4 = new A30_Ex37(1,"A");
    System.out.println(className4.i + " " + className4.s + " " + className4.s2);
    A30_Ex37 className5 = new A30_Ex37("B",2);
    System.out.println(className5.i + " " + className5.s + " " + className5.s2);
    
    // 가변인자
    A30_Ex37 className6 = new A30_Ex37("A", "B", "C", "D", "E", "F");
    
    A30_Ex37 className7 = new A30_Ex37(1, "A", "B");
    System.out.println(className7.i + " " + className7.s + " " + className7.s2);
    
    System.out.println("className7.calSum(3, 6, 9) : " + className7.calSum(3, 6, 9));
    
  } // main 메소드 끝
}
