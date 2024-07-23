package test_0712;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest5 {

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
    
    System.out.println("list1의 사이즈 : " + list1.size());
    
    for (String l : list1) {
      System.out.print(l + " ");
    }
    System.out.println();
    
    // list1에서 중복 제거
    list1 = list1.stream().distinct().toList();
    
    list1.forEach(x -> System.out.print(x + " "));
    System.out.println();
   
    System.out.println(list1.indexOf("html"));
    String str = "";
    list1.forEach(x -> System.out.println(x));
    System.out.print("출력메소드 람다로 돌리기 : ");
    list1.forEach(x -> new ListTest5().stringPrinter(x));
    System.out.println();
    
    System.out.print("인터페이스의 출력메소드 람다로 돌리기 : ");
    list1.forEach(x -> new Machine() {
      @Override
      public void stringPrinter(String x) {
        System.out.print(x + " ");
      }
    }.stringPrinter(x));
    System.out.println();
    
    System.out.println("람다?");
    // m 의 단 하나뿐인 메소드에 인자로 x 를 주고 메소드의 기능을 구현(오버라이딩)한다
    Machine m = (x) -> System.out.print(x + " ");
    // 리스트 돌리면서(반복) 나오는 값을 인자로 줘서 m(오버라이딩 된 Machine 객체) 의 메소드를 실행한다
    list1.forEach(x -> m.stringPrinter(x));
    System.out.println();
    // 같다
    list1.forEach(m::stringPrinter);
  }
  
  public void stringPrinter(String x) {
    System.out.print(x + " ");
  }
}

interface Machine {
  public void stringPrinter(String x);
}
