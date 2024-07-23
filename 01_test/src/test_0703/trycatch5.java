package test_0703;

import java.io.FileInputStream;
import java.io.IOException;

public class trycatch5 {

  public static void main(String[] args) {
    
    
    FileInputStream fi = new FileInputStream("file.txt");
    // 자원 자동 반납 : AutoColoseable 관계가 있어야 가능!!
    try(fi) {
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    } finally {
      
    }
    
  }
}
