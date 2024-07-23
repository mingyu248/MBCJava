package test_0612;

public class A15_Ex19 {
  public static void main(String[] args) {
    
    System.out.println("프로그램 시작");
    // 1부터 10까지 출력
    // for (int i = 1; i <= 10; i++) {
    // for (int i = 1; i < 11; i++) {
    // for (int i = 1; i < 11; ++i) {
    // for (int i = 1; i < 11; ++i++) {       // (X)
    // for (int i = 1; i < 11; i = i + 1) {
    // for (int i = 1; i < 11; i += 1) {
    //  System.out.print(i + " ");
    // }
    
    /*
    for (int i = 10; i >= 1; i--) {
      System.out.print(11-i + " ");
    }
    */
    
    for (int i = 10; i >= 1; i--) {
      System.out.print("반복");
      System.out.print(11-i + " ");
    }
    
    
    System.out.println("\n프로그램 종료...");
    
  }
}
