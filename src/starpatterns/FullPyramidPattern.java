package starpatterns;

public class FullPyramidPattern {
   public static void main(String[] args){
       // For inverted pyramid, we need to count rows first.The pattern which we are going to print have 5 rows
       int n=5;
       // The outer loop will be started for the iteration of no. of rows in decreasing order because top row have more stars
       // and bottom rows have lesser
       for(int i=1;i<=n;i++){
       // The inner loop first implement the spaces in the pattern.Firstly, it will check in first row where n=1 and first iteration
       // i=1 then n-i = 5. So, there will not be space printed.
           for(int j=0;j<n-i;j++){
               System.out.print(" ");
           }
       // The 2nd inner loop will print stars. In first row, suppose i=5 then 2*i-1 = 1. Then,1 starts will be printed on top.
       //In next line, i=2,then 3 starts will be printed
           for(int k=0;k<2*i-1;k++){
               System.out.print("*");
           }
       //Pattern will print to next line
           System.out.println();
       }
   }
}
/* Output will be:-

       *
      ***
     *****
    *******
   *********

*/