//import stuff here
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main(String[] args){
        Scanner intScanner = new Scanner(System.in);
        int int1 = 0;
        int int2 = 0;
        int sum = 0;
        int diff = 0;
        int max = 0;
        int min = 0;
        int dist = 0;
        int prod = 0;
        double avg = 0;
        System.out.println("Type an integer: (1/2)");
        int1 = intScanner.nextInt();
        System.out.println("Type an integer: (2/2)");
        int2 = intScanner.nextInt();
        sum = int1 + int2;
        diff = int1 - int2;
        if(int1 > int2){
            max = int1;
            min = int2;
        }else{
            max = int2;
            min = int1;
        }
        prod = int1 * int2;
        avg = (double)(int1 + int2) / 2 ;
        dist = Math.abs(diff);
        System.out.println("the original numbers are " + int1 + " and " + int2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Average = " + avg);
        System.out.println("Absolute Value = " + dist);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
//Paste console output below:
/*
Type an integer: (1/2)
13
Type an integer: (2/2)
20
the original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute Value = 7
Max = 20
Min = 13


*/
