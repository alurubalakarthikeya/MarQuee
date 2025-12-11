import java.util.Scanner;
class recurse
{//                               2025,202,20
    private static int nod_helper( long data )
	{   // base case
		if ( data < 100 )
		    return 2;
		return 1 + nod_helper(data/10);		
	}
	//                                 2025   45
    public static int numberOfDigits ( long data )
	{
	   // handle arm length solution
	   if ( data == 0 )
	       return 0;
	   if ( data < 10 )
           return 1;
       if ( data < 100 )
           return 2;
      // environment

      // call helper - recursive, pass, initiate
      return nod_helper( data );	  
	}
	private static int sod_helper ( long data )
	{
	    if ( data < 100 )
		    return (int) (data%10+data/10);
	    return (int) (data % 10) + sod_helper ( data / 10);
	}
	public static int sumOfDigits( long data )
	{
	   // arm 
	   if ( data < 10 )
            return (int)data;
       if ( data < 100 )
            return (int)(data%10+data/10);

        // environment



       // call helper - recursive, pass, initiate
       return sod_helper ( data );	   
	}
	private static int sofn_helper ( int n )
	{
	  if ( n==4)
	      return 10;
		  return n + sofn_helper ( n - 1);
	}
    public static int sumOfFirstN( int n )
    {
	     if ( n == 0 || n==1)
		      return n;
	     if ( n == 2 )
              return 3;
         if ( n == 3 )
              return 6;
       // environment
	   
	   // call helper - recursive , pass, initiate
	   return sofn_helper ( n );
			  
    }	
	private static int rev_helper ( int data, int power )
	{
	   if ( data < 100)
              return (data%10)*10+(data/10);	
	   
	   return (data % 10 * power ) + rev_helper(data/10, power/10);
	}
	public static int reverse ( int data)
	{
	   // arm 
	   if ( data < 10 )
	        return data;
	   if ( data < 100)
              return (data%10)*10+(data/10);	
	    // environment , find the power
        int pp; // positional power
        pp = 1;
		while ( data / pp > 9 )
		{
		    pp*=10;
		}
        // call helper - recursive, pass, initiate
		return rev_helper( data, pp );



/*
if (c1 is true )
	dont do anything
else
{

if ( ! c1 )
{
}

if ( c1 is true )
{
	;
}
else
{
}
*/
		
	}
	private static long gcd_helper ( long  n1, long n2 )
	{
		if ( n1 == 0 )
			return n2;
	    if ( n2 == 0)
			 return n1;
		 System.out.printf("n1 = %d n2 = %d\n", n1, n2);
		return gcd_helper ( n2, n1%n2);
	}
	public static long gcd ( long num1, long num2 )
	{
		return gcd_helper( num1, num2);
	}
	public static void main( String [] parameters )
	{
            long testdata1;
			int testdata2;
			Scanner kbrd = new Scanner ( System.in  );
			testdata1 = 123456789123456789L;
			int sod;
			int nod;
			sod = sumOfDigits ( testdata1 );
			nod = numberOfDigits ( testdata1 );
			testdata2 = 123456;
			int rev = reverse ( testdata2 );
			System.out.printf("sod = %d nod =%d rev = %d\n", sod, nod, rev);
	        long n1;
			long n2;
			n1 = kbrd.nextLong();
			n2 = kbrd.nextLong();
			long res = gcd( n1, n2);
		System.out.printf("gcd of %d and %d is %d", n1, n2, res);
	}
}