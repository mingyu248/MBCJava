package student;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

  public static void main(String[] args) {
    
    List<Student> stdList = new ArrayList<>();
    
    stdList.add(new Student("김필표", 92, 82, 71));
    stdList.add(new Student("곽두팔", 94, 84, 72));
    stdList.add(new Student("김창원", 96, 86, 74));
    stdList.add(new Student("마광식", 97, 87, 76));
    stdList.add(new Student("김두식", 99, 89, 78));
    
    for(Student std : stdList) {
      System.out.printf("%s 학생의 총점 %d, 평균 %.2f\n", std.getName(), std.getTot(), std.getAvg());
      System.out.printf("국어 등급 : %c (%d점)\n영어 등급 : %c (%d점)\n수학 등급 : %c (%d점)\n\n"
                       , std.getKorCredit(), std.getKor(), std.getEngCredit(), std.getEng(), std.getMathCredit(), std.getMath());
    }
    
    new Student().rankSetting(stdList);
    
    stdList.forEach(System.out::println);
    
  }
  
}
