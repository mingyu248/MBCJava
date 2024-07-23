package test_0612;

import java.util.Calendar;

public class A28_Ex36 {
  
  public static final int MONDAY = 0;
  public static final int TUESDAY = 1;
  
  public static void main(String[] args) {
    
    System.out.println(A29_Ex36_Week.MONDAY);
    System.out.println(A29_Ex36_Week.MONDAY.name());
    System.out.println(A29_Ex36_Week.MONDAY.ordinal());
    System.out.println(A29_Ex36_Week.MONDAY.getVal());
    
    A29_Ex36_Week today = null;
    
    Calendar cal = Calendar.getInstance();
    int week = cal.get(Calendar.DAY_OF_WEEK);
    
    switch(week) {
      case 1: today = A29_Ex36_Week.SUNDAY; break;
      case 2: today = A29_Ex36_Week.MONDAY; break;
      case 3: today = A29_Ex36_Week.TUESDAY; break;
      case 4: today = A29_Ex36_Week.WEDNESDAY; break;
      case 5: today = A29_Ex36_Week.THURSDAY; break;
      case 6: today = A29_Ex36_Week.FRIDAY; break;
      case 7: today = A29_Ex36_Week.SATURDAY; break;
    }
    
    System.out.println("오늘의 요일 : " + today);
    if(today == A29_Ex36_Week.MONDAY) {
      System.out.println("오늘은 월요일 입니다");
    } else {
      System.out.println("오늘은 월요일이 아닙니다");
    }
    
    System.out.println("\n프로그램 종료...");
  } // main 메소드 끝
}
