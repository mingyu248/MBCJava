package test_0703;

public class trycatch2 {

  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;  // 0이 나올 수 있음
    int res = 0;
    
    try {
      num1 = 10;
      num2 = (int)((Math.random()) * 2);  // 1 or 0 랜덤
      System.out.println("num1 : " + num1 + "\nnum2 : " + num2);
      
      if (num2 == 0) {
        throw new ArithmeticException("나누는 수의 오류(0으로 나눔)");
      }
      res = num1 / num2;
      
    } catch(Exception e) {
      System.err.println("나누기 에러 발생");
      e.printStackTrace();
    } finally {
      
    }
  }
}
