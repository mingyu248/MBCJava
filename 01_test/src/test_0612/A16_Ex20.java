package test_0612;

public class A16_Ex20 {
  public static void main(String[] args) {
    
    System.out.println("프로그램 시작");
    
    // 2씩 증가 (i가 짝수 or 홀수만 나오게)
    // for (int i = 1; i <= 10; i = i + 2) {    // 홀수
    // for (int i = 1; i <= 10; i += 2) {    // 홀수
    // for (int i = 1; i <= 10; i++2) {    // (X)
    // for (int i = 2; i <= 10; i += 2) {    // 짝수
    //   System.out.print(i + " ");
    // }
    
    /* 짝수
    for (int i = 10; i >= 2; i -= 2) {
      System.out.print(12 - i + " ");
    }
    */
      
    for (int i = 10; i >= 2; i -= 2) {
      
      System.out.print("반복");
      System.out.print(12 - i + " ");
    }
    
    System.out.println("\n프로그램 종료...");
  }
}
