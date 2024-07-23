package test_0612;

import java.util.Scanner;

public class A08_Ex11 {
  public static void main(String[] args) {
    
    // 삼항 연산자
    int num1 = 3;
    String msg = "";
    
//    if (num1 > 0) {
//      msg = "양수";
//    } else {
//      msg = "음수";
//    }
    
    msg = num1 > 0 ? "양수" : "음수";
    
    System.out.println("msg : " + msg);
    
    
    
    
  }
}
