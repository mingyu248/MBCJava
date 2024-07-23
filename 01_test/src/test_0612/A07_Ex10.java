package test_0612;

import java.util.Scanner;

public class A07_Ex10 {
  public static void main(String[] args) {
    
    // ArithmeticException : / by zero
    // 예외처리
    // int result = 6 / 0;
    int num2 = 6;
    int num1 = (int)Math.random(); 
    // 0 ~ 1 사이의 임의의 수(난수/무작위수)
    int result = num2 / num1;
    // int result = num2 % num1;
    
    System.out.println("result : " + result);
  }
}
