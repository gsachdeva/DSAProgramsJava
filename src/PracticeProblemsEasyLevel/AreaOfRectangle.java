package PracticeProblemsEasyLevel;

/*
In this problem, you are required to write a program that calculates the area
of a rectangle. You will be provided with two integers as input: the length and breadth of the rectangle.
Your task is to compute the area using these inputs and print the result based on the well-known mathematical formula
for the area of a rectangle.
*/
//Problem 200 - Codehelp
public class AreaOfRectangle {
    public static void main(String[] args) throws java.lang.Exception
    {
        int a = 59;
        int b = 95;


        long area= areaOfRectangle(a, b);
        System.out.print(area+"");

    }
    public static long areaOfRectangle(int a, int b) {
        long area = (long)a*b;
        return area;
    }
}
