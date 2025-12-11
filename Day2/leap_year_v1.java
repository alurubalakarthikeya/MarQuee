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

class leap_year_v1
{
	public static void main( String [] parameters )
	{
		int year;
		Scanner kbrd = new Scanner ( System.in );
		year = kbrd.nextInt();
		if ( year % 4 == 0)
		{
		    if ( year % 100 ==  0)
			{
			    if ( year % 400 == 0 )
				{
				    System.out.println("LEAP");
				}
				else
				{
				    System.out.println("NOT LEAP");

				}
			}
			else
			{
				    System.out.println("LEAP");
			}
		}
		else
		{
				    System.out.println("NOT LEAP");
		}
		
	}
}












					
   		 