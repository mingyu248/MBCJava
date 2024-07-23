package test_0612;

public class A45_Ex45 {
  
  public class InstanceClass{}
  A45_Ex45(){
    InstanceClass isClass = new InstanceClass();
  }
  void isMethod() {
    InstanceClass isClass = new InstanceClass();
  }
  
  public static class StaticClass{}
  StaticClass stClass = new StaticClass();
  static StaticClass stClass2 = new StaticClass();
  void stMethod() {
    StaticClass stClass = new StaticClass();
  }
  static void stMethod2() {
    StaticClass stClass = new StaticClass();
  }
  
  public static void main(String[] args) {
    
    A45_Ex45 isObj1 = new A45_Ex45();
    A45_Ex45.InstanceClass isObj2 = isObj1.new InstanceClass();
    
    
    
    
    StaticClass stClass = new StaticClass();
    A45_Ex45.StaticClass stObj = new A45_Ex45.StaticClass();
    
  }
  
}
