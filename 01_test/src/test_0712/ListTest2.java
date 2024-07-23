package test_0712;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

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
    
    list1.forEach(x -> System.out.print(x + " "));
    System.out.println();
    list2.forEach(x -> System.out.print(x + " "));
    System.out.println();
    System.out.print(list1.retainAll(list2));   // list1과 list2를 교집합해서 list1이 된다, list1에 바뀐게 있으면 true
    System.out.println();
    list1.forEach(x -> System.out.print(x + " "));
    System.out.println();
    list2.forEach(x -> System.out.print(x + " "));
    
    
    
    
  }

}
