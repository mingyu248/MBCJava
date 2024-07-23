package test_0703;

public class trycatch {

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = (int)((Math.random()) * 3);  // 0이 나올 수 있음
    int res = 0;
    System.out.println("num1 : " + num1 + "\nnum2 : " + num2);
    
    try {
      res = num1 / num2;
    } catch(Exception e) {
      System.out.println("에러 정보 보기1 : " + e.toString());
      System.out.println("에러 정보 보기2 : " + e.getMessage());
      System.out.print("에러 정보 보기3 : ");
      e.printStackTrace();
      System.out.println("num2가 0이 나와 num1을 그대로 저장");
      res = num1;
    } finally {
      System.out.println("finally 실행\nres : " + res);
    }
  }
}
