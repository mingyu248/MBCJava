package test_0612;

import java.util.UUID;

public class A46_Ex46 {
  public static void main(String[] args) {
    
    System.out.println("UUID : " + UUID.randomUUID());    // 고유 코드 랜덤
    
    Object obj = new Object();
    System.out.println("obj.hashCode() : " + obj.hashCode());    // obj의 10진수 해시코드
    System.out.println("Integer.toHexString(obj.hashCode()) : " + Integer.toHexString(obj.hashCode()));    // obj의 10진수 해시코드를 16진수로
    System.out.println("obj.toString() : " + obj.toString());    // -> 뒤에 붙는 건 obj의 16진수 해시코드
    // 객체 => 문자열 변환 ? => 객체의 멤버 필드들의 내용 확인
    System.out.println("obj : " + obj);    // -> 뒤에 붙는 건 obj의 16진수 해시코드
    // java.lang.Object@5ce65a89 : 객체(인스턴스) 고유값(클래스 명세 + 메모리 주소)
    
    
    Car car = new Car();
    System.out.println("car.toString() : " + car.toString());
    
    Object obj2 = new Object();
    // 객체 고유값(주소)으로 비교
    // "같다" => 특성(속성 => 멤버 필드)들을 비교
    System.out.println("obj.equals(obj2) : " + obj.equals(obj2));
  }
}
class Car{
  
}