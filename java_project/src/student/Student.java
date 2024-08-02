package student;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Student {
  
  /** 학생명 */
  private String name;
  
  /** 국어 점수 */
  private int kor;
  /** 국어 등급 */
  private char korCredit;
  
  /** 영어 점수 */
  private int eng;
  /** 영어 등급 */
  private char engCredit;
  
  /** 수학 점수 */
  private int math;
  /** 수학 등급 */
  private char mathCredit;
  
  /** 총점 */
  private int tot;
  
  /** 평균 */
  private float avg;
  
  /** 순위 */
  private int rank;
  
  public Student() {}
  public Student(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    
    // 해당 생성자 호출 시 받은 점수로 등급 지정
    this.creditSetting2();
    this.calcTotalSetting();
    this.calcAvgSetting();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getTot() {
    return tot;
  }

  public void setTot(int tot) {
    this.tot = tot;
  }

  public float getAvg() {
    return avg;
  }

  public void setAvg(float avg) {
    this.avg = avg;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public char getKorCredit() {
    return korCredit;
  }
  public void setKorCredit(char korCredit) {
    this.korCredit = korCredit;
  }
  public char getEngCredit() {
    return engCredit;
  }
  public void setEngCredit(char engCredit) {
    this.engCredit = engCredit;
  }
  public char getMathCredit() {
    return mathCredit;
  }
  public void setMathCredit(char mathCredit) {
    this.mathCredit = mathCredit;
  }
  
  @Override
  public String toString() {
    return "Student [name=" + name + ", kor=" + kor + ", korCredit=" + korCredit + ", eng=" + eng + ", engCredit="
        + engCredit + ", math=" + math + ", mathCredit=" + mathCredit + ", tot=" + tot + ", avg=" + avg + ", rank="
        + rank + "]";
  }
  /**
   * ? 수정 필요(Input5 복붙상태)
   * 과목 입력 함수(메소드)
   * 
   * @param sc Scanner(표준 입력) 객체
   * @param subject 과목
   * @return 과목 점수
   */
  // 과목 입력 함수(메소드)
  public int inputScore(Scanner sc, String subject) {
    
    int score = 0;
    
    String msg = "점수는 0 ~ 100 사이의 자연수를 입력하세요";
    
    while (true) {    // 무한 반복문
      
      // 국/영/수 점수 입력 : 100 80 90
      System.out.print(subject + " 점수 입력 : ");
      try {
        // 문자열 입력받기
        score = sc.nextInt();
        
        // 조건적 분기
        // 0 ~ 100 사이의 점수 입력시 분기
        if (score >= 0 && score <= 100) {
          break;
        } else {
          throw new InputMismatchException();    // 강제 에러 발생 (숫자는 맞지만 0 ~ 100 사이의 자연수가 아닌 경우)
        }
        
      } catch (InputMismatchException e) {
        
        System.out.println(msg);
        sc.nextLine();
        continue;
        
      }
    }
    
    return score;
  }
  
  /**
   * 내부 사용 목적
   * 등급 측정 메소드
   * 
   * @param score 점수
   * @return char 등급
   */
  public char creditSetting1(int score) {
    
    char credit = 'F';
    int checkScore = score/10;
    
    credit = checkScore == 10 || checkScore == 9 ? 'A' : 
             checkScore == 8 ? 'B' : 
             checkScore == 7 ? 'C' : 
             checkScore == 6 ? 'D' : 'F';
    
    return credit;
  }
  
  /**
   * 내부 사용 목적
   * 등급 저장 메소드(국어, 영어, 수학)
   * 생성자 호출 시 각 과목의 등급이 계산되어 들어가게 하는 메소드
   */
  public void creditSetting2() {
    this.korCredit = creditSetting1(this.kor);
    this.engCredit = creditSetting1(this.eng);
    this.mathCredit = creditSetting1(this.math);
  }
  
  /**
   * 총점 계산 메소드
   * 
   * @return 총점 합계 소숫점 2자리(반올림)까지
   */
  public int calcTotal() {
    return this.kor + this.eng + this.math;
  }
  // 생성자 호출 시 tot 에 값 계산되어 들어가게 하는 메소드
  public void calcTotalSetting() {
    this.tot = calcTotal();
  }
  
  /**
   * 평균 계산 메소드
   * 
   * @param 표시할 소숫점 자릿수
   * @return 평균점수
   */
  public float calcAvg(int square) {
    // System.out.println(Math.round((this.sum/3f)*100)/100f);
    
    int tot = this.calcTotal();
    // float avg = Math.round((this.tot/3f)*100)/100f;
    float power = (float)Math.pow(10, square);
    avg = Math.round(tot/3f * power) / power;
    
    return avg;
  }
  // 생성자 호출 시 avg 에 값 계산되어 들어가게 하는 메소드
  public void calcAvgSetting() {
    this.avg = calcAvg(2);
  }
  
  /**
   * tot 으로 정렬 후 순서대로 rank 를 매긴다
   * 
   * @param stdList 정렬되지 않은 리스트
   * @return stdList 정렬된 리스트
   */
  public List<Student> rankSetting(List<Student> stdList) {
    
//    stdList.sort(new Comparator<Student>() {
//      
//      @Override
//      public int compare(Student s1, Student s2) {
//        return s1.getTot() > s2.getTot() ? -1 : 0;
//      }
//    });
    
    // 람다식으로 간단하게 사용 가능
    stdList.sort((s1, s2) -> s1.getTot() > s2.getTot() ? -1 : 0);
    //stdList.forEach(System.out::println);
    
    stdList.stream().forEach(x -> {
      x.setRank(stdList.indexOf(x) + 1);
      //System.out.println(x.getName() + "순위 => " + x.getRank());
    });
    
    return stdList;
  }
  
}
