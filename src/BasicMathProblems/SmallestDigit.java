package BasicMathProblems;

public class SmallestDigit {
    public static void main(String[] args){
        int n=4534;
        printSmallestDigit(n);
    }
    public static void printSmallestDigit(int n){
            int minValue=Integer.MAX_VALUE;
            int reminder=0;
            while(n!=0){
                reminder=n%10;
                if(minValue>reminder){
                    minValue=reminder;
                }
                n=n/10;
            }
            System.out.print("min value of 4534 is: "+minValue);

    }
}
