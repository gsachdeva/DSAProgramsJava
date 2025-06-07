package starpatterns;

public class InvertedFullPyramidPattern {
   public static void main(String[] args){
      int n=5;
      invertedPyramidPattern(n);
   }
    public static void invertedPyramidPattern(int n){
        // For inverted pyramid, we need to count rows first.The pattern which we are going to print have 5 rows

        // The outer loop will be started for the iteration of no. of rows in decreasing order because top row have more stars
        // and bottom rows have lesser
        for(int i=n;i>=1;i--){
            // The inner loop first implement the spaces in the pattern.Firstly, it will check in first row where n=5 and first iteration
            // i=5 then n-i = 5. So, there will not be space printed.
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            // The 2nd inner loop will print stars. In first row, suppose i=5 then 2*i-1 = 9. Then,9 starts will be printed on top.
            //In next line, i=4,then 7 starts will be printed
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            //Pattern will print to next line
            System.out.println();
        }
    }

}
/* Output will be:-

 *********
  *******
   *****
    ***
     *



*/