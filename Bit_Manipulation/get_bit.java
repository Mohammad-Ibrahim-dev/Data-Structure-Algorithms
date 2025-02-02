package Bit_Manipulation;
import java.util.Scanner;

public class get_bit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();
        System.out.println("enter the position:");
        int pos = sc.nextInt()-1;
        int bitMask = 1<<pos;
        if ((bitMask & n )== 0) {
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
}
