package test_0612;

public class A17_Ex21 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    // for 문에 실수를 사용할 수 있다 (사용할 수는 있지만 성능이 좋지 않음)
//    for (float i = 1; i <= 10; i++) {
//    for (float i = 1; i <= 10; i += 0.5) {
//    for (float i = 0; i <= 10; i += 2.5F) {
//    for (float i = 0.0F; i <= 10.0F; i += 2.5F) {
//    for (float i = 0.0; i <= 10.0; i += 2.5D) {
    
    
    
    for (double i = 0.0D; i <= 10.0; i+=2.5D) {
      System.out.print(i + " ");
    }
    
    
    System.out.println("\n프로그램 종료...");
  }
}
