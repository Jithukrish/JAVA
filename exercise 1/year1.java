/**Write a Java program to find the number of days in a month for a given year.
Check Leap year also*/
import java.util.Scanner;
public class year1
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
                int number_Of_DaysInMonth = 0;
		String Month = "Unknown";
		System.out.println("input a month number");
		int month=input.nextInt();
		System.out.println("input a year");
		int year=input.nextInt();
		switch(month)
		{
			case 1:
			Month ="january";
			number_Of_DaysInMonth=31;
			break;
			case 2:
			Month ="febrauary";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{
				number_Of_DaysInMonth=29;
			}
			else
			{
				number_Of_DaysInMonth=28;
			}
			break;
			case 3:
			Month ="march";
			number_Of_DaysInMonth=31;
			break;
			case 4:
			Month ="april";
			number_Of_DaysInMonth=30;
			break;
			case 5:
			Month ="may";
			number_Of_DaysInMonth=31;
			break;
			case 6:
			Month ="june";
			number_Of_DaysInMonth=30;
			break;
			case 7:
			Month ="july";
			number_Of_DaysInMonth=31;
			break;
			case 8:
			Month ="August";
			number_Of_DaysInMonth=31;
			break;
			case 9:
			Month ="september";
			number_Of_DaysInMonth=30;
			break;
			case 10:
			Month ="october";
			number_Of_DaysInMonth=31;
			break;
			case 11:
			Month ="november";
			number_Of_DaysInMonth=30;
			break;
			case 12:
			Month ="december";
			number_Of_DaysInMonth=31;
			break;
		}
		System.out.print(Month + " " + year + " has " + number_Of_DaysInMonth + " days\n");
	if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			System.out.println("Specified year is a leap year");
		 else
        		 System.out.println("Specified year is not a leap year");	 
}
}
/**input a month number
2
input a year
2005
febrauary 2005 has 28 days
Specified year is not a leap year

input a month number
3
input a year
2014
march 2014 has 31 days
Specified year is not a leap year

input a month number
3
input a year
2004
march 2004 has 31 days
Specified year is a leap year
*/
