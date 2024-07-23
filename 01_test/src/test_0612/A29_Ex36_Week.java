package test_0612;

public enum A29_Ex36_Week {
  SUNDAY(1),
  MONDAY(2),
  TUESDAY(3),
  WEDNESDAY(4),
  THURSDAY(5),
  FRIDAY(6),
  SATURDAY(7);
  
  private final int val;
  
  A29_Ex36_Week(int val) {
    this.val = val;
  }
  
  public int getVal() {
    return val;
  }
}
