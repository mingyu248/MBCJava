package test_0612;

public class A21_Ex29 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    // 2 ~ 9단 구구단
    int i = 2;    // 단
    while (i <= 9) {    // 단 반복(2~9)
      int j = 1;    // 서수
      while(j <= 9) {    // 서수 반복(1~9)
        System.out.printf("%d × %d = %d\n", i, j, i * j);
        j++;
      }
      System.out.println();
      i++;
    }
    
    System.out.println("\n프로그램 종료...");
  } // main 메소드 끝
}
