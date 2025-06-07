package starpatterns;

public class FloydTrianglePattern {
    public static void main(String[] args){
        int n=4;
        numberTrianglePattern(n);
    }
    public static void numberTrianglePattern(int n){
        int number=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                number++;
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
