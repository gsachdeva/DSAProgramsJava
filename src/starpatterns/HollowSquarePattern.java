package starpatterns;

public class HollowSquarePattern {
    public static void main(String[] args){
        int n=5;
     //   printHollowPatternWay1(n);
        printHollowPatternWay2(5);
    }
    public static void printHollowPatternWay1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }else{
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void printHollowPatternWay2(int n){
        //i should be declared as per rows
        for(int i=1;i<=n;i++){
        // if(i is 1 and n, then need to print stars
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
            }else{
                //Star printed in 2nd to n-1 row
                System.out.print("* ");
                //Space print from 2nd column to n-2 column(because 1st column star will be printed and last column star
                //will be printed
                for(int j=1;j<=n-2;j++){
                    System.out.print("  ");
                }
                //Star printed in last row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

Output:-
*****
*   *
*   *
*   *
*****
*/
