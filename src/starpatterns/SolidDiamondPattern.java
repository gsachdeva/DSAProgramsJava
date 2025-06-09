package starpatterns;

public class SolidDiamondPattern {
    public static void main(String[] args){
        int n=3;
        printSolidDiamondPattern(n);
    }
    public static void printSolidDiamondPattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("-");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        n--;
        for(int row=n;row>=n;row--){
            for(int col=1;col<=n-1;col++){
                System.out.print("-");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
