package test_0612;

import java.util.Scanner;

public class A19_Ex27 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    // 구구단
    Scanner sc = new Scanner(System.in);
    
    System.out.print("시작단 입력 : ");
    int m = sc.nextInt();
    
    System.out.println("마침단 입력 : ");
    int n = sc.nextInt();
    
    sc.close();
    
    for (int i = m; i <= n; i++) {
      for (int j = 2; j <= 9; j++) {
        System.out.printf("%d * %d = %d\n", i,j,i*j);
      }
      System.out.println();
    }
    
    
    
    System.out.println("\n프로그램 종료...");
  }
}
