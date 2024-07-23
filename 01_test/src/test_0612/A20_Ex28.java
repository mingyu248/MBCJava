package test_0612;

import java.util.Scanner;

public class A20_Ex28 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    Scanner sc = new Scanner(System.in);
    
    // while 문
    System.out.print("시작값 : ");
    int i = sc.nextInt();
    int i_ori = i;
    System.out.print("끝값 : ");
    int j = sc.nextInt();
    int sum = 0;
    sc.close();
    
    while (i <= j) {
      System.out.print(i + " ");
      sum += i;
      i++;
    }
    System.out.printf("\n%d ~ %d 의 합계 : %d", i_ori, j, sum);
    
    System.out.println("\n프로그램 종료...");
  }
}
