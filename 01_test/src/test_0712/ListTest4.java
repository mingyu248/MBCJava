package test_0712;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest4 {

  public static void main(String[] args) {
    
    List<String> list1 = new ArrayList<>();
    list1.add("jsp");
    list1.add("jsp");
    list1.add("servlet");
    list1.add("servlet");
    list1.add("html");
    list1.add("html");
    list1.add("css");
    list1.add("css");
    
    // 중복 저장 안됨
    Set<String> set1 = new HashSet<>();
    set1.add("jsp");
    set1.add("jsp");
    set1.add("servlet");
    set1.add("servlet");
    set1.add("html");
    set1.add("html");
    set1.add("css");
    set1.add("css");
    
    
    System.out.println("list1의 사이즈 : " + list1.size());
    System.out.println("set1의 사이즈 : " + set1.size());
    
    for (String l : list1) {
      System.out.print(l + " ");
    }
    System.out.println();
    
    for (String s : set1) {
      System.out.print(s + " ");
    }
    System.out.println();
    
    set1.forEach(x -> System.out.print(x + " "));
    
  }
}
