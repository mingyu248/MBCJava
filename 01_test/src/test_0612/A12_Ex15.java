package test_0612;
import java.util.Scanner;

public class A12_Ex15 {
  public static void main(String[] args) {
    
    // 점수 -> 학점 변형
    
    // 점수(0 ~ 100) => 학점
    // 점수 : score
    // 학점 : credit
    // A : 90 ~ 100
    // B : 80 ~ 90(미만)
    // C : 70 ~ 80(미만)
    // D : 60 ~ 70(미만)
    // F : 60(미만)
    
    // 점수
    byte score = 0;
    char credit = 'F';
    byte score2 = 0;    // if문 체크용 변수
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("점수 입력 : ");
    score = (byte)(sc.nextInt());
    
    //score2 = (byte)(score/10);    // 수동 형변환
    score2 /= 10;                   // 대입 연산자는 자동 형변환 기능이 있다
    
    if (score2 == 9 || score2 == 10) {
      credit = 'A';
    } else if (score2 == 8) {
      credit = 'B';
    } else if (score2 == 7) {
      credit = 'C';
    } else if (score2 == 6) {
      credit = 'D';
    } else {
      credit = 'F';
    }

    System.out.printf("점수 : %d \n학점 : %s", score, credit);
  }
}
