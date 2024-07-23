package test_0612;

public class pr09 {

  public static void main(String[] args) {
    
    test(0);
  }

  static void test(int i) {
    i++;
    System.out.print(i + " ");
    if(i>=10) {
      System.out.println("\nㄴ");
      return;
    }
    test(i);
    
    System.out.print(i + " ");
  }
}
