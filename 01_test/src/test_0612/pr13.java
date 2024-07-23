package test_0612;

public class pr13 {

  public static void main(String[] args) {
    long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
    String str = "test";
    for(int i = 0; i<100000; i++) {
      str += str;
      str = "test";
    }
          
  long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
  long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
  System.out.println("시간차이(ms) : "+secDiffTime);

  }

}
