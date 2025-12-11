// 48 20
// find the smallest
// n1 and n2
// temp=n1  ------------> 1
// the first common factor is the GCD
import java.util.Scanner;
class gcd
{
	public static void main( String [] parameters )
	{
		long n1;
		long n2;
		long temp;
		long gcd;
		gcd = 1L;
		Scanner kbrd = new Scanner ( System.in );
		n1 = kbrd.nextLong();
		n2 = kbrd.nextLong();
		if ( n2 % n1 == 0)
		    gcd = n1;
			else
			{
		for ( temp = n1/2; temp >= 1; temp -- )
		{
		    if ( n1 % temp == 0 && n2 % temp == 0 )
			{
			   gcd=temp;
			   break;
			}
		}
		System.out.printf("gcd of %d and %d is %d", n1, n2, gcd);
		}
	}
}