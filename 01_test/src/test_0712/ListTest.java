package test_0712;

import java.util.List;

public class ListTest {

  public static void main(String[] args) {
    
    List<String> list = List.of("jsp", "servlet", "html", "css");
    
    // List.of 를 사용하면 불변 리스트를 생성할 수 있다 -> 중요한 지정된 값을 보존할 수 있다
    // 예외 발생 : 불변(immutable) 리스트 객체
    // 캡슐화
    // java.lang.UnsupportedOperationExeption
    // list.add("mybatis");      // (X)
    // list.remove(0);           // (X)
    // list.add(1,"mybatis");    // (X)
    list.add("mybatis");
    
    System.out.println(list.get(4));
    
    
    
    
  }

}
