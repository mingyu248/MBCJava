package test_0703;

public class trycatch3 {

  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;  // 0이 나올 수 있음
    int num3 = 0;
    int res = 0;
    
    try {
      num1 = 10;
      num2 = (int)((Math.random()) * 2);  // 0 or 1 랜덤
      num3 = (int)((Math.random()) * 3) + 1;  // 1 ~ 3
      System.out.println("num1 : " + num1 + "\nnum2 : " + num2 + "\nnum3 : " + num3);
      
      int []arr = new int[3];
      System.out.println(arr[num3]);    // 먼저 걸리는 에러만 체크되고, 아래로는 실행되지 않음
      
      if (num2 == 0) {
        throw new ArithmeticException("나누는 수의 오류(0으로 나눔)");
      }
      res = num1 / num2;
      
    } catch(ArithmeticException e) {
      System.err.println("나누기 에러 발생");
      e.printStackTrace();
    } catch(ArrayIndexOutOfBoundsException e2){
      System.out.println("배열 에러 발생. 인덱스 범위 밖");
    } finally {
      
    }
  }
}
