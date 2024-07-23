package test_0612;

import java.util.Random;
import java.util.Scanner;

public class pr03 {
  
  public static void main(String[] args) {
    int n1 = 10;
    
    System.out.println("n1 : " + n1++);
    System.out.println("n1 : " + n1);
    
    double d1 = 0.1;
    int n2 = 1;
    int n3 = 7;
    
    double res = n2 - n3 * d1;
    System.out.println("res : " + res);
    
    /*
    // ArithmeticException 에러(/ by zero) 
    int res2 = 6 / 0;
    System.out.println("res2 : " + res2);
    */
    
    /*
    // 예상치 못한 에러 위험
    int n4 = 6;
    int n5 = (int)Math.random();
    int res2 = n4 / n5;
    System.out.println("res2 : " + res2);
    */
    
    // Infinity 혹은 NaN 이 된다
    System.out.println(5 / 0.0);
    
    // 비트 논리 연산자
    int n6 = 7 & 6;   // 7 : 111 AND 6 : 110 -> 110
    System.out.println(n6);
    
    int n7 = 7 | 6;   // 7 : 111 or 6 : 110 -> 111
    System.out.println(n7);
    /**/
    // 삼항 연산자
    // 조건식 ? 조건식 참일때 실행 : 조건식 거짓일 때 실행
    
    System.out.println(~0b10010);
    
    int i = 3;
    System.out.println(1*++i);
    
    boolean b = false;
    
    int i2 = 3;
    int i3 = 4;
    System.out.println((true || false) & false);
    
    test1(1);
    
  }
  static Scanner sc = new Scanner(System.in);
  
  static void test1(int a) {
    System.out.println(a + "출력!");
    sc.nextLine();
    if(a>=10) return;
    test1(a+1);
    System.out.println(a);
  }
  
}
