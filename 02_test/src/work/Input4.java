package work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input4 {
  
  public static void main(String[] args) {
    // 스캐너 객체 생성
    Scanner scanner = new Scanner(System.in);
    
    int score = 0;
    
    while (true) {  // 무한 반복문
    
      // 국/영/수 점수 입력 : 100 80 90
      System.out.print("점수 입력 : ");
      
      try {
        // 문자열 입력받기
        score = scanner.nextInt();
        
        // 조건적 분기
        // 0 ~ 100 사이의 점수 입력시 분기
        if (score >= 0 && score <= 100) {
          break;
        } else {
          throw new InputMismatchException();    // 강제 에러 발생 (숫자는 맞지만 0 ~ 100 사이의 자연수가 아닌 경우)
        }
        
      } catch (InputMismatchException e) {
        
        System.out.println("점수는 0 ~ 100 사이의 자연수를 입력하세요");
        scanner.nextLine();
        continue;
        
      }
    }
    
    System.out.println("점수 : " + score);
    
    scanner.close();
    
  }
}
