/*
498765
     ^
^

LSD 
10

copy the data 


digit = copy %10;   // query the LSD 
                    // process the digit 	 
copy /= 10;         // loose the LSD
Loop until all digits are processed



MSD
75865
10000

Calulate the power 10000


digit = copy / power; 75865 / 10000 => 7
// process
copy %= power         75865 % 10000 => 5865
power /= 10           10000/10 -> 1000
Loop as long as power >= 1





*/




// convert deci to octal
/*
May I Have a Large Container of Coffee
3.1415926
remainder of division of 8
form octal 
quotient by dividing by 8
multiply pv by 10

*/
import java.util.Scanner;

class converter
{
   public static long ten_2_8 ( long data )
   {
     long copy_data;
	 long res;
     long pp; // positionl power
     int remainder;
     // populate
	 copy_data = data;
	 // priming
	 pp = 1;
	 res = 0;
	 // process
	 
	 while ( copy_data != 0)
	 {
	 remainder =(int) (copy_data % 8);
	 res = res + remainder * pp;
	 copy_data /= 8;
	 pp *= 10;
	 }
	 return res;	 
   }
   
   public static long octa_2_bina ( long inOctal )
   {
	   /*
	      6574
		  1
		  10
		  100
		  1000
		  6
		  110
		  5
		  110101
		  7
		  110101111
		  4
		  110101111100
	   */
	   long pp ; // positional power 
	   long copy_inOctal;
	   pp = 1;
	   copy_inOctal = inOctal;
	   while ( copy_inOctal / pp > 9 )
	   {
		    pp*=10;
	   }
	   int msd;
	   long res;
	   res = 0;
       while ( pp > 0 )
	   {
	   msd = (int) (copy_inOctal / pp) ;
	   switch ( msd )
	   {
		   case 0 : res = res * 1000; break;
		   case 1 : res = res * 1000 + 1; break;
		   case 2 : res = res * 1000 + 10; break;
		   case 3 : res = res * 1000 + 11; break;
		   case 4 : res = res * 1000 + 100; break;
		   case 5 : res = res * 1000 + 101; break;
		   case 6 : res = res * 1000 + 110; break;
		   case 7 : res = res * 1000 + 111; break;
		   
	   }
	   copy_inOctal %= pp;
	   pp/=10;
       }
	   return res;
	   
	   
   }
   public static long bina_2_octa ( long bin )
   {
	   /*
	   
	     extract 3 digits from bin -> LSD 
		 
		 add as MSD of octa 
		 
		 loose 3 digits
		 
		 repeat until all digits in bin are over 
	   
	   
	   */
	   int bits;
	   long copy_bin;
	   long octa;
	   long pp; // positional power
	   
	   // populate
	   copy_bin = bin;
	   
	   // priming
	   octa = 0;
	   pp = 1;
	   
	   while ( copy_bin != 0)
	   {
		   bits = (int) (copy_bin % 1000);
		   switch ( bits )
		   {
				case 0 : octa = 0 * pp + octa; break;
				case 1 : octa = 1 * pp + octa; break;
				case 10 : octa = 2 * pp + octa; break;
				case 11 : octa = 3 * pp + octa; break;
				case 100 : octa = 4 * pp + octa; break;
				case 101 : octa = 5 * pp + octa; break;
				case 110  : octa = 6 * pp + octa; break;
				case 111 : octa = 7 * pp + octa; break;
				
		   }		   
		   pp*= 10;
		   copy_bin /= 1000;
       }	   
	   
	   
	   
	   return octa;
	   
   }
   public static long ten_2_any ( long data , int base)
   {
     long copy_data;
	 long res;
     long pp; // positionl power
     int remainder;
     // populate
	 copy_data = data;
	 // priming
	 pp = 1;
	 res = 0;
	 // process
	 
	 while ( copy_data != 0)
	 {
	 remainder =(int) (copy_data % base);
	 res = res + remainder * pp;
	 copy_data /= base;
	 pp *= 10;
	 }
	 return res;	 
   }

	public static void main( String [] parameters )
	{
		long deci;
		Scanner kbrd = new Scanner ( System.in );
		deci = kbrd.nextLong();
		long octa;
		octa = ten_2_8( deci );
		System.out.printf("(%d)10 = (%d)8\n", deci,octa);
		long bin;
		long hexa;
		long tri;
		bin = ten_2_any( deci, 2);
		hexa = ten_2_any ( deci, 6 );
		tri  = ten_2_any ( deci, 3);
		System.out.printf("(%d)%d = (%d)%d = (%d)%d = (%d)%d\n",deci,10,bin,2,tri,3,octa,8); 
        bin = octa_2_bina ( octa );
		System.out.printf("\n(%d)%d = (%d)%d", octa, 8, bin, 2);
		bin = kbrd.nextLong();
		octa = bina_2_octa ( bin );
		System.out.printf("\n(%d)%d = (%d)%d", octa, 8, bin, 2);

	}
}


