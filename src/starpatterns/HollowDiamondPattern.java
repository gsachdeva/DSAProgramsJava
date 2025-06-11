package starpatterns;

public class HollowDiamondPattern {
    public static void main(String[] args){
        printHollowStarPattern();
    }
    public static void printHollowStarPattern(){
        //Part 1
        int part1=2;
        for(int row=1;row<=part1;row++){
            for(int col=part1;col>=row;col--){
                System.out.print(" ");
            }
            if(row==1){
                System.out.print(" *");
            }else{
                System.out.print("*");
                for(int col=1;col<=2*part1-1;col++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        //Part 2 starts
        int part2=3;
        System.out.print("* ");
        for(int row=1;row<=part2;row++){
            System.out.print(" ");
        }
        System.out.print(" *");
        System.out.println();

        //Part 3 starts
        int part3=2;
        for(int row=1;row<=part3;row++){
            for(int j=1;j<=row;j++){
                System.out.print(" ");
            }
            if(row==part3){
                System.out.print(" *");
            }else{
                System.out.print("*");
                for(int col=1;col<=2*part3-1;col++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
/*
    Output:-

   *
 *   *
*     *
 *   *
   *

*/