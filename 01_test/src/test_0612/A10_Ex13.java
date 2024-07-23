package test_0612;

public class A10_Ex13 {
  public static void main(String[] args) {
    
    // 점수(0 ~ 100) => 학점
    // 점수 : score
    // 학점 : credit
    // A : 90 ~ 100
    // B : 80 ~ 90(미만)
    // C : 70 ~ 80(미만)
    // D : 60 ~ 70(미만)
    // F : 60(미만)
    
    // 점수
    byte score = 0;    // 51점 ~ 100점?
    char credit = 'F';
    
    score = (byte)((int)(Math.random()*50)+51);
    //System.out.println("점수 : " + score);
    // 학점
    
    if (score >= 90 && score <= 100) {         // A : 90 ~ 100
      credit = 'A';
    } else if (score >= 80 && score < 90) {    // B : 80 ~ 90(미만)
      credit = 'B';
    } else if (score >= 70 && score < 80) {    // C : 70 ~ 80(미만)
      credit = 'C';
    } else if (score >= 60 && score < 70) {    // D : 60 ~ 70(미만)
      credit = 'D';
    } else {                                   // F : 60(미만)
      credit = 'F';
    }
    
    //System.out.println("학점 : " + credit);
    
    System.out.printf("점수 : %d \n학점 : %c", score, credit);
    System.out.printf("점수 : %d \n학점 : %s", score, credit);
  }
}
