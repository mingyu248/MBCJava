package test_0612;

public class A18_Ex22 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    // for 문의 초기값(카운터 변수) 의 선언 위치에 따른 변화
    
    int i = 1;
    for (;; ++i) {
      System.out.print(i + " ");
      if (i == 10) break;
    }
    System.out.println("\n" + i);
    
    
    
    
    System.out.println("\n프로그램 종료...");
  }
}
