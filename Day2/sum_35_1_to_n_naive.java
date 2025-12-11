

import java.util.Scanner;
class sum_35_1_to_n_naive
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
		for ( num= 1 ; num <= n;num++)
		{
		    if ( num % 3==0|| num % 5 ==0)
			   sum+=num;
		}
		long stop = System.currentTimeMillis();
		double duration = ( stop - start ) / 1000.0;
		System.out.printf( " n = %d, sum = %d, time taken = %.3f", n, sum, duration);
	}
}