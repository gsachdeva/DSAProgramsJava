package starpatterns;

public class NumberRightHalfPyramidPattern {
    public static void main(String[] args){
        int n=5;
        numberTrianglePattern(n);
    }
    public static void numberTrianglePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
Output :-
1
22
333
4444
55555
*/