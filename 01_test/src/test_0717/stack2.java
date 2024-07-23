package test_0717;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack2 {
  public static void main(String[] args) {
    
    // 삽입 삭제가 빈번하게 일어나는 경우 좋다(HashMap 보다)
    // FIFO 선입선출
    Queue<String> queue = new LinkedList<>();
    System.out.println(queue);
    queue.offer("1번");
    System.out.println(queue);
    queue.offer("2번");
    System.out.println(queue);
    queue.offer("3번");
    System.out.println(queue);
    queue.offer("4번");
    System.out.println(queue);
    queue.offer("5번");
    
    System.out.println("stack.size() : " + queue.size());
    System.out.println(queue);
    
    System.out.println(queue.poll());
    System.out.println("stack.size() : " + queue.size());
    System.out.println(queue);
    
    System.out.println(queue.poll());
    System.out.println("stack.size() : " + queue.size());
    System.out.println(queue);
    
    System.out.println(queue.poll());
    System.out.println("stack.size() : " + queue.size());
    System.out.println(queue);
    
    System.out.println(queue.poll());
    System.out.println("stack.size() : " + queue.size());
    System.out.println(queue);
    
    System.out.println(queue.poll());
    System.out.println("stack.size() : " + queue.size());
    System.out.println(queue);
    
    
    
  }
}
