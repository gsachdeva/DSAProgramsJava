package starpatterns;

public class RhombusPattern {
    public static void main(String[] args){
        printRhombusPattern();
    }
    public static void printRhombusPattern(){
        int n=4;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Output :-

 ****
 ****
 ****
 ****
 
*/

