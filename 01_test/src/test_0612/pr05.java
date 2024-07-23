package test_0612;

import java.util.Random;
import java.util.Scanner;

public class pr05 {
  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cnt=0;
		int sixcnt=0;
		int bcnt = 0;
		long cntsum = 0;
		int cntavg = 0;
		int pst = 100000;
  		
		Random rd = new Random();
  	
		int l=0;
		
		while(l<pst) {
  		while(true) {
  		  
  			++cnt;
  			if(cnt==1000000) break;
       
  			int i = rd.nextInt(6)+1;
  			
  			if(i==6) {
  			  sixcnt++;
  			} else {
  			  sixcnt=0;
  			}

  			if(sixcnt==6) {
  			  cntsum += cnt;
  			  bcnt++;
  			  l++;
  			  
  			  sixcnt=0;
  			  cnt=0;
  			  break;
  			}
  		}
      if(l%(pst/100)==0) {
        System.out.printf("%d %%\n",(int)((double)l/pst*100));
      }
    }
    cntavg=(int)(cntsum/bcnt);
    System.out.println(bcnt+"회차");
    System.out.println("평균 "+cntavg+"번");
	}

}
