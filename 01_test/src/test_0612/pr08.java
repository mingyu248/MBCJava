package test_0612;

public class pr08 {

  public static void main(String[] args) {
    
    int[][] array = {
      {95, 86},
      {83, 92, 96},
      {78, 83, 93, 87, 88}
    };
    
    int sum = 0;
    int cnt = 0;
    double avg = 0;
    for(int i=0; i<array.length; i++) {
      for(int j=0; j<array[i].length; j++) {
        sum += array[i][j];
        cnt++;
      }
    }
    avg = (double)sum/cnt;
    System.out.printf("합 : %d\n평균 : %.2f",sum,avg);
  }

}
