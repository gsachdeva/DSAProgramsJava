package starpatterns;

public class SolidDiamondPattern {
    public static void main(String[] args){
        int n=3;
        printSolidDiamondPattern(n);
    }
    public static void printSolidDiamondPattern(int n){
        //First we will implement part 1

        int nPart1=3;
        for(int row=1;row<=nPart1;row++){
            //Below part will print spaces
            for(int j=nPart1;j>=row;j--){
                System.out.print(" ");
            }
            //Below part will start printing stars
            for(int k=1;k<=2*row-1;k++){
                System.out.print("*");
            }

            System.out.println();

            /*
            Part 1 output
             *
            ***
           *****

            */
        }
        //Part 2 will print seven stars
        int nPart2=7;
        for(int i=1;i<=nPart2;i++){
            System.out.print("*");
        }
        System.out.println();
        //Part 3 will print
        /*
         *****
          ***
           *
         */
        int nPart3=3;
        for(int row=nPart3;row>=1;row--){
            //Below part will print spaces
            for(int j=nPart1;j>=row;j--){
                System.out.print(" ");
            }
            //Below part will start printing stars
            for(int k=1;k<=2*row-1;k++){
                System.out.print("*");
            }

            System.out.println();

            /*
            output
             *
            ***
           *****
          *******
           *****
            ***
             *

            */
        }

    }

}
