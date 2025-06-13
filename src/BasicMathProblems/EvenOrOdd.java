package BasicMathProblems;

public class EvenOrOdd {
    public static void main(String[] args){
        int num=123;
        checkNumberEvenOrOdd(num);
    }
    //We are trying to keep less dependency on modulus operator
    //Here the use of bit o
    public static void checkNumberEvenOrOdd(int num){
        if((num & 1)==1){
            System.out.print("Number is odd");
        }else{
            System.out.print("Number is even");
        }
    }
}
