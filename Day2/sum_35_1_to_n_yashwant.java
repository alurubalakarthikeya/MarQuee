// 30
// 3 6 9 12 15 18 21 24 27 30
// 5 10 15 20 25 30
// 15 30 

import java.util.Scanner;
class sum_35_1_to_n_yashwant
{
	public static void main( String [] parameters )
	{
		int n;
		Scanner kbrd = new Scanner ( System.in );
		long sum;
		// populate
		n = kbrd.nextInt();
		
		// priming 
        sum = 0;		
		// process
		int num;
		long start = System.currentTimeMillis();
		for ( num= 3 ; num <= n;num+=3)
		{
		 //   if ( num % 3==0|| num % 5 ==0)
			   sum+=num;
		}
		for ( num= 5 ; num <= n;num+=5)
		{
		 //   if ( num % 3==0|| num % 5 ==0)
	//		 if ( num % 3 == 0) continue;
			   sum+=num;
		}
		for ( num= 15 ; num <= n;num+=15)
		{
		 //   if ( num % 3==0|| num % 5 ==0)
	//		 if ( num % 3 == 0) continue;
			   sum-=num;
		}
		
		long stop = System.currentTimeMillis();
		double duration = ( stop - start ) / 1000.0;
		System.out.printf( " n = %d, sum = %d, time taken = %.3f", n, sum, duration);
	}
}