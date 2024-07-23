package test_0612;

import java.util.Scanner;

public class pr06 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int money = 0;
    
    boolean run = true;
    
    while(run) {
      System.out.println("------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("------------------------------");
      System.out.print("선택> ");
      String cat = sc.nextLine();
      switch(cat) {
      case "1":
        System.out.print("예금액> ");
        String tmpdep = sc.nextLine();
        int dep = Integer.valueOf(tmpdep);
        money+=dep;
        System.out.println(dep+"원 예금");
        break;
      case "2":
        System.out.print("출금액> ");
        String tmpwth = sc.nextLine();
        int wth = Integer.valueOf(tmpwth);
        
        if(money<wth) {
          System.out.println("잔액 부족");
        } else {
          money-=wth;
          System.out.println(wth+"원 출금");
        }
        break;
      case "3":
        System.out.println("잔고> "+money);
        break;
      case "4":
        System.out.println("프로그램 종료...");
        run = false;
        break;
      }
      
    }
  }
}
