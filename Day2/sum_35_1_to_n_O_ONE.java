// 30
// 3 6 9 12 15 18 21 24 27 30
// 5 10 15 20 25 30
// 15 30 
/*
3		1
6		2
9		3
12		4
15		5
18		6
21		7
24		8
27		9
30		10
		55 * 3 = 165
5		1
10		2	
15		3
20		4
25		5
30		6
		21 * 5 = 105
				 270
15		1	
30		2
		3 * 15  = 45
		         225
				 O(1)
				 O(n) 
				
*/

import java.util.Scanner;
class sum_35_1_to_n_O_ONE
{
	public static void main( String [] parameters )
	{
		int n;
		Scanner kbrd = new Scanner ( System.in );
		int num3;
		int num5;
		int num15;
		long sum3;
		long sum5;
		long sum15;
		long sum;
		// populate
		n = kbrd.nextInt();
		// priming
		
		// process
		long begin = System.nanoTime();
		num3 = n / 3;
		sum3 = 3 * (num3*(num3+1L))/2;
		num5 = n / 5;
		sum5 = 5 * (num5*(num5+1L))/2;
		num15 = n / 15;
		sum15 = 15 * (num15*(num15+1L))/2;

        sum = (sum3 + sum5 ) - sum15;
		long stop = System.nanoTime();
		double duration = ( stop - begin )/1000000000.0;
		System.out.printf( " n = %d, sum = %d, time taken = %.3f",n, sum, duration);

		
		
		
		}
}












