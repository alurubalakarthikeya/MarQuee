

import java.util.Scanner;
class sum_35_1_to_n_yash
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
		for ( num= 3 ; num <= n;)
		{
		    if ( num % 3==0)
			{
			   sum+=num;
			   num+=2;
			   }
			   else if ( num % 5 == 0 )
			   {
			      sum+=num;
				  num++;
			   }
			   else num++;
		}
		long stop = System.currentTimeMillis();
		double duration = ( stop - start ) / 1000.0;
		System.out.printf( " n = %d, sum = %d, time taken = %.3f", n, sum, duration);
	}
}