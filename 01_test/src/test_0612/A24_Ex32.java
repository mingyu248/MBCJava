package test_0612;

public class A24_Ex32 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    int arr[];
    // arr = new int[];              // (X)
    // arr = { 1, 2, 3 };            // (X)
    // arr = new int[3];             // (O)
    // arr = new int[3] {1, 2, 3};   // (X)
    arr = new int[] {1, 2, 3};       // (O)
    System.out.println("arr[0] : " + arr[0]);
    
    System.out.print("arr for문 출력 : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    
    // foreach loop : index 검색 (X)
    // 다음 요소(next element) 검색 (O) 빠르다
    // Iterator(반복자) 패턴 방식
    System.out.print("arr foreach loop 출력 : ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    
    
    
    
    
    System.out.println("\n프로그램 종료...");
  } // main 메소드 끝
}
