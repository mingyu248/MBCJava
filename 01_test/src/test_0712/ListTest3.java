package test_0712;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

  public static void main(String[] args) {
    
    List<String> list1 = new ArrayList<>();
    list1.add("jsp");
    list1.add("servlet");
    list1.add("html");
    list1.add("css");
    
    List<String> list2 = new ArrayList<>();
    list2.add("jsp");
    list2.add("servlet");
    list2.add("mybatis");
    list2.add("jdbc");
    
    // 배열로 역치환
    String[] strArr1 = new String[list1.size()];
    strArr1 = list1.toArray(strArr1);
    
    System.out.println("배열의 첫 요소 : " + strArr1[0]);
    
    
    
    
    // 배열 <-> 배열 () 연산자 치환 (X)
    // 예외 발생 : java.lang.ClassCastException (cannot be cast to class)
    Object[] objArr = new Object[list2.size()];
    String strArr2[] = (String[])list2.toArray();
    
    System.out.println("배열의 첫 요소 : " + strArr2[0]);
    
  }

}
