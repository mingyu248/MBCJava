package test_0612;


public class A26_Ex34 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    // 가변 배열(행 고정, 열 가변 할당)
    int arr1[][] = new int[3][];
    // int arr1[][] = new int[][2];    // (X)
    
    arr1[0] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};
    arr1[1] = new int[] { 1, 2, 3, 4, 5, 6 };
    arr1[2] = new int[] { 1, 2, 3 };
    
    for (int[] arr2 : arr1) {
      for (int n : arr2) {
        System.out.print(n + " ");
      }
      System.out.println();
    }
    
    
    
    
    
    
    System.out.println("\n프로그램 종료...");
  } // main 메소드 끝
}
