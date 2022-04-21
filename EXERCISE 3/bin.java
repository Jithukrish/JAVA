// Binary Search

import java.util.*;

class binary{
     public static void main(String args[])
{
            Scanner s=new Scanner(System.in);
            int i;

            System.out.print("\nEnter Number of elements: ");
            int n=s.nextInt();
            int arr[]=new int[n];                                    //declaring array
            int k=0;

             System.out.print("Enter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();                                   //reading values
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

           
             int first=0,last=n-1,mid=(first+last)/2;
            while(first<=last)
             {
              if(a>arr[mid])                                      //element is in right 
               {
                 first=mid+1;
                 mid=(first+last)/2;
                }
               else if(a<arr[mid])                                  // element is in left 
              {
                 last=mid-1;
                 mid=(first+last)/2;
                 
               }
             else                                              //case if found
              {
               System.out.print("\nenement at index "+mid);
              k=1;
                break;
                
               }

             }
             if(k==0)
             {
               System.out.print("\nelement found! ");
              }
             



}
}
/**Enter Number of elements: 3
Enter the elements in sorted order: 1
2
3
Enter the element to search: 4

element found!

Enter Number of elements: 3
Enter the elements in sorted order: 1 2 3
Enter the element to search: 2 

element at index 1*/
