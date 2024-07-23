package test_0716;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class set {

  public static void main(String[] args) {
    
    Set<String> set = new TreeSet<>(); // 오름차순 정렬 set, 성능 떨어짐
    
    set.add("01java");
    set.add("05spring");
    set.add("03spring");
    
    set.addAll(Arrays.asList("07jsp","04servlet", "06html", "02jdbc"));
    set.addAll(Arrays.asList(new String[] {"08jsp","11servlet", "09html", "10jdbc"}));

    System.out.println(set);
    
    
    NavigableSet<String> navSet = new TreeSet<>(); // 오름차순, 내림차순도 된다
    
    navSet.add("01java");
    navSet.add("05spring");
    navSet.add("03spring");
    
    navSet.addAll(Arrays.asList("07jsp","04servlet", "06html", "02jdbc"));
    navSet.addAll(Arrays.asList(new String[] {"08jsp","11servlet", "09html", "10jdbc"}));

    Iterator<String> it = navSet.descendingIterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
    System.out.println();
    navSet.forEach(x -> System.out.print(x + " "));
    System.out.println();

    // 일반 set 은 사용할 수 없음
    System.out.println("첫 요소 : " + navSet.first());
    System.out.println("첫 요소 : " + navSet.last());
    
    // A(포함) 부터 B(미포함) 까지 뽑기
    navSet.subSet("04servlet", "09html").forEach(x -> System.out.print(x + " "));
    System.out.println();
    // A(미포함) 부터 B(포함) 까지 뽑기
    navSet.subSet("04servlet", false, "09html",true).forEach(x -> System.out.print(x + " "));
    System.out.println();
    
    // A(미포함) 까지뽑기
    navSet.headSet("07jsp").forEach(x -> System.out.print(x + " "));
    System.out.println();
    // A(포함) 까지 뽑기
    navSet.headSet("07jsp", true).forEach(x -> System.out.print(x + " "));
    System.out.println();
    
    // A(포함) 부터 뽑기
    navSet.tailSet("07jsp").forEach(x -> System.out.print(x + " "));
    System.out.println();
    // A(미포함) 부터 뽑기
    navSet.tailSet("07jsp", false).forEach(x -> System.out.print(x + " "));
    System.out.println();
  }
}
