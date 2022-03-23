/**write a java program to find the number of days in a month for the given year also check leap year*/
import java.util.Scanner; 
public class leap { 
     public static void main(String[] args) { 
	int month, year;

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the month and year: ");
    month=sc.nextInt();
    year=sc.nextInt();
    if(((month==2) && (year%4==0)) || ((year%100==0)&&(year%400==0)))
    {
         System.out.println("Number of days is 29");
    }
    else if(month==2)
    {
        System.out.println("Number of days is 28");
    }
    else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
    {
         System.out.println("Number of days is 31");
    }
    else
    {
         System.out.println("Number of days is 30");
    }
           
          if (year % 4 == 0){ 
              if (year % 100 == 0){ 
                  if (year % 400 == 0){ 
                      System.out.println(year + " is a leap year"); 
                  } 
                  else{ 
                      System.out.println(year + " is not a leap year"); 
                  } 
              } 
              else{ 
                  System.out.println(year + " is a leap year"); 
              } 
          } 
          else{ 
              System.out.println(year + " is not a leap year"); 
          } 
      } 
  } 
/** out put
enter the month and year: 
3
2004
Number of days is 31
2004 is a leap year
*/

