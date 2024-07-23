package test_0612;

public class A25_Ex33 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    
    // 다차원 배열(2차원 배열 이상) 선언
    int arr1[][];
    // int [][]arr2;      // (O)
    // int []arr2[];      // (O)
    // int [] arr2 [];    // (O)
    
    // arr2 = new int[][];   // (X)
    arr1 = new int[3][2];    // (O)
    
    // 행렬(matrix)
    arr1 = new int[][] { {1, 2 } ,
                         {3, 4 } ,
                         {5, 6 } };
    // 낱개 조회
    System.out.println("arr1[0][0] : " + arr1[0][0]);
    
    int arr2[][] = { {1, 2 } ,
                     {3, 4 } ,
                     {5, 6 } };
    // 낱개 조회
    System.out.println("arr2[0][0] : " + arr2[0][0]);
    
    // 배열의 길이
    System.out.println("배열의 길이 : " + arr2.length);
    
    // 전체 요소의 길이(갯수)
    System.out.println("전체길이 : " + arr2.length * arr2[0].length);
    System.out.println();
    
    // 전체 조회
    for (int i = 0; i < arr2.length; i++) {
      for(int j = 0; j < arr2[i].length; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    
    // foreach (enhanced(향상된) for) loop
    for (int[] arr3 : arr2) {
      for (int n : arr3) {
        System.out.print(n + " ");
      }
      System.out.println();
    }
    
    
    
    System.out.println("\n프로그램 종료...");
  } // main 메소드 끝
}
