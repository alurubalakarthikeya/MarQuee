/*
input year

	if year is div by 4
	     if year is div by 100
		      if year  div by 400
			        LEAP
			  else
			        NOT LEAP
	     else 
                    LEAP
	else
                    NOT LEAP
*/






import java.util.Scanner;

class leap_year_v2
{
	public static void main( String [] parameters )
	{
		int year;
		Scanner kbrd = new Scanner ( System.in );
		year = kbrd.nextInt();
		// 
		// int num = 0;
		// if ( num != 0 && ++num && num++)
		//     f         c2       c3
		
		if ( (year%4==0 && year %100!=0) || year % 400==0 )
				{
				    System.out.println("LEAP");
				}
				else
				{
				    System.out.println("NOT LEAP");

				}
	}
}












					
   		 