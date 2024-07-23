package test_0716;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {
  
  public static void main(String[] args) {
    
    Map<String, String> map = new HashMap<>();
    
    // 중복 허용 안된다. 중복 put 하면 덮어씌워진다
    map.put("신림", "순대");
    map.put("종로", "닭한마리");
    map.put("을지로", "골뱅이");
    map.put("장충", "족발");
    map.put("종로", "닭한마리");
    map.put("응암", "감자탕");
    map.put("신당", "떡볶이오리지날");
    map.put("신당", "떡볶이리메이크");
    
    System.out.println(map);
    System.out.println("map.size() : " + map.size());
    System.out.println("map.get(\"을지로\") : " + map.get("을지로"));
    
    Set<Entry<String, String>> set = map.entrySet();
    
    Iterator<Entry<String, String>> it = set.iterator();
    
    System.out.print("{");
    while (it.hasNext()) {
      //Entry<String, String> entry = it.next();
      Entry<?, ?> entry = it.next(); // 와일드 카드
      
      String key = (String) entry.getKey();
      String val = (String) entry.getValue();
      System.out.print(key + "=" + val);
      if (it.hasNext()) {
        System.out.print(", ");
      } else {
        System.out.println("}");
      }
    }
    System.out.println("람다1");
    map.entrySet().forEach(x->System.out.print(x + "    "));
    System.out.println();
    System.out.println();
    
    System.out.println("람다2");
    map.entrySet().forEach(System.out::println);
    
  }
  
}














