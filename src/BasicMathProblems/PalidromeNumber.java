package BasicMathProblems;

public class PalidromeNumber {
    public static void main(String[] args){
        int num=-1221;
        checkIfPalidromeOrNot(num);
    }
    public static void checkIfPalidromeOrNot(int num){
        num=Math.abs(num);
        int rev=reverseNumber(num);
        if(num == rev){
            System.out.print("Number is palidrome");
        }else{
            System.out.print("Number is not palidrome");
        }

    }

    public static int reverseNumber(int num){
        int rev=0;
        int rem=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
}
