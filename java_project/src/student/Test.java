package student;

public class Test {

  public static void main(String[] args) {
    
    Student std = new Student();
    std.setName("김필표");
    std.setKor(75);
    std.setEng(80);
    std.setMath(90);
    System.out.println("std 합계 : " + std.calcTotal());
    System.out.println("std 합계 : " + (std.calcAvg(3)));
    // 등급을 계산하고 저장하는 기능이 있는 생성자를 호출해서 생성된 객체가 아니어서
    // 국영수 등급은 저장되어 있지 않다
    System.out.println("국어 등급 : " + std.getKorCredit());
    
    System.out.println();
    
    Student std2 = new Student("김필표2", 75, 80, 90);
    
    System.out.println("std2 합계 : " + std2.calcTotal());
    System.out.println("std2 합계 : " + std2.calcAvg(3));
    System.out.println("국어 등급 : " + std2.getKorCredit());
    System.out.println("영어 등급 : " + std2.getEngCredit());
    System.out.println("수학 등급 : " + std2.getMathCredit());
    
  }

}
