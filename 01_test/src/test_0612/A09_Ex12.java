package test_0612;

public class A09_Ex12 {
  public static void main(String[] args) {
    
    if(true) {
      System.out.println("무조건 실행");
    }
    if(false) {
      System.out.println("무조건 실행 안됨");
    }
    
    int num1 = 6;
    int num2 = 19;
    if (num1 <= num2 || num1 == num2) {    // 6 <= 19 -> 참, 6 == 19 -> 거짓, 참 || 거짓 -> 참
      System.out.println("실행1");
    }
    
    // (위 코드 부정)
    int num3 = 6;
    int num4 = 19;
    if (!(num3 > num4 && num3 != num4)) {    // 6 <= 19 -> 참, 6 == 19 -> 거짓, 참 || 거짓 -> 참
      System.out.println("실행2");
    }
    
    
    int num5 = (int)(Math.random()*4);
    if (num5 == 0) {
      System.out.println("num5 는 " + num5);
    } else if (num5 == 1) {
      System.out.println("num5 는 " + num5);
    } else {
      System.out.println("num5 는 " + num5);
    }
    
    
    
  }
}
