package test_0612;

import java.util.Random;
import java.util.Scanner;

public class pr02 {
  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a=0,b=0,c=0,d=0,e=0,f=0;
		double pa=0;
		double pb=0;
		double pc=0;
		double pd=0;
		double pe=0;
		double pf=0;
		int sum=0;
		int cnt=0;
		int sixcnt=0;
		int bcnt = 0;
		int cntsum = 0;
		int cntavg = 0;
  		
		Random rd = new Random();
  		
		while(true) {
  		while(true) {
  			++cnt;
  			System.out.println(cnt+" 번째 반복");
  //			Scanner sc = new Scanner(System.in);
  //			String cat = sc.nextLine();
  //			if(cat.equals("x")) break;
  			if(cnt==1000000) break;
  
  			int i = rd.nextInt(1,7);
  			System.out.println("나온 숫자 : "+i);
  			
  			if(i==6) {
  			  sixcnt++;
  			} else {
  			  sixcnt=0;
  			}
  			
  			
  			
  			switch(i) {
  			case 1: a++; break;
  			case 2: b++; break;
  			case 3: c++; break;
  			case 4: d++; break;
  			case 5: e++; break;
  			case 6: f++; break;
  			}
  			
  
  			sum = a+b+c+d+e+f;
  			pa = (double)a/sum*100;
  			pb = (double)b/sum*100;
  			pc = (double)c/sum*100;
  			pd = (double)d/sum*100;
  			pe = (double)e/sum*100;
  			pf = (double)f/sum*100;
  			
  			System.out.printf("%.2f %% \n%.2f %%\n%.2f %%\n%.2f %%\n%.2f %%\n%.2f %%", pa, pb, pc, pd, pe, pf);
  			
  			if(sixcnt==6) {
  			  System.out.println("\n출력6!");
  			  cntsum += cnt;
  			  bcnt++;
  			  
  			  sixcnt=0;
  			  cnt=0;
  			  a=0;b=0;c=0;d=0;e=0;f=0;
  			  pa=0;pb=0;pc=0;pd=0;pe=0;pf=0;
  			  sum=0;
  			  break;
  			}
  			
  			System.out.println("-------------------------------------------------");
  		}
  		
  		cntavg=cntsum/bcnt;
  		System.out.println(bcnt+"회차");
  		System.out.println("평균 "+cntavg+"번");
  		String exit = sc.nextLine();
  		if(exit.equals("x")) {
  		  break;
  		}
	  }

	}

}
