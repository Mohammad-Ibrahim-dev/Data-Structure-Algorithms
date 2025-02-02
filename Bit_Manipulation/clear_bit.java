package Bit_Manipulation;

import java.util.Scanner;

public class clear_bit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt() ;
        System.out.println("enter the position to clear bit");
        int pos= sc.nextInt();
        int bitmask=1<<pos;
        int compliment=~bitmask;
        int newnumber=num & compliment;
        System.out.println(newnumber);
    }
}
