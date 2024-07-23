package test_0612;

public class A23_Ex31 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    // 배열 변수의 선언
    // int arr[10];  // (X)
    int arr[];
    // System.out.println(arr[0]);    // 아직은 사용 불가
    
    // 배열 변수는 지역 변수일지라도 메모리 할당시 초기값 자동 할당(대입)
    // String => null, int => 0
    arr = new int[3];  // 메모리 공간 할당, 할당된 값이 없어 초기값(int의 초기값 0) 이 들어간다
    System.out.println("arr[0] : " + arr[0]);
    
    
    int arr2[] = new int[3];    // 선언과 동시에 할당
    
    int arr3[] = {'1', '2', '3'};    // 선언과 동시에 할당
    // System.out.println(arr3[3]);      // (X)
    // System.out.println(arr3[-1]);     // (X)
    // System.out.println(arr3[1.5f]);   // (X)
    System.out.println("배열의 길이 : " + arr.length);
    
    System.out.println("\n프로그램 종료...");
  } // main 메소드 끝
}
