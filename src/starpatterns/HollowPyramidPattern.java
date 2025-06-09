package starpatterns;
// To print the below-given output, we need to first analyze the steps and divide into multiple parts
// Step 1:- Need to print spaces first from first row to nth row...As rows will increment,stars count are increasing
// Step 2:- Next shift to star print part where first and nth row have all stars and middle rows have spaces b/w stars
// So, will enter the check that for 1 and nth row to print stars
//Step 3:- Next print are into middle rows, where we will first check the stars and spaces in between and as we going down
// then the spaces counts are increased. Suppose, in 2nd row, space is 1 in-between and in 3rd row, spaces are 3 and 5 in
// 4th row...then we will implement the 2n-3 to print spaces.

public class HollowPyramidPattern {
    public static void main(String[] args){
        int n=5;
        //Function
        printHollowPyramidPattern(n);
    }
    public static void printHollowPyramidPattern(int n){
        // Logic = each row is made up of
        // 1. Spaces
        // 2. Stars+ spaces in between
        for(int i=1;i<=n;i++){
            //inner loop logic given above
            //taking care of spaces part
            for(int col=1;col<=n-i;col++){
                System.out.print(" ");
            }

            if(i==1){
                System.out.print("*");
            }else if(i==n){
                //print 2*n-1 stars
                for(int j=1;j<=2*n-1;j++){
                    System.out.print("*");
                }
            }else{
                //middle rows
                //Step 1: Print *
                System.out.print("*");
                //Step 2:- Print some spaces
                for(int col=1;col<=2*i-3;col++){
                    System.out.print(" ");
                }
                //Step 3:- Print *
                System.out.print("*");
            }
            // Next lines
            System.out.println();
        }

    }
}
/*  Output:-
    *
   * *
  *   *
 *     *
*********
*/