package starpatterns;

public class HollowRectanglePattern {
    public static void main(String[] main){
        int n=4,m=6;
        printHollowPattern(n,m);
    }
    public static void printHollowPattern(int n,int m){
        //i should be declared as per rows
        for(int i=1;i<=n;i++){
            // if(i is 1 and n, then need to print stars
            if(i==1 || i==n){
                for(int j=1;j<=m;j++){
                    System.out.print("* ");
                }
            }else{
                //Star printed in 2nd to n-1 row
                System.out.print("* ");
                //Space print from 2nd column to n-2 column(because 1st column star will be printed and last column star
                //will be printed
                for(int j=1;j<=m-2;j++){
                    System.out.print("  ");
                }
                //Star printed in last row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*   Output:-
 * * * * * *
 *         *
 *         *
 * * * * * *
 */