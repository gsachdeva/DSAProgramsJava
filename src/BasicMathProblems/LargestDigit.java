package BasicMathProblems;

public class LargestDigit {
    public static void main(String[] args){
        int n=4539994;
        printLargestDigit(n);
    }
    public static void printLargestDigit(int n){
        int maxValue=Integer.MIN_VALUE;
        int reminder=0;
        while(n!=0){
            reminder=n%10;
            if(maxValue<reminder){
                maxValue=reminder;
            }
            n=n/10;
        }
        System.out.print("Min value of 4534 is: "+maxValue);

    }
}
