package Bit_Manipulation;

import java.util.Scanner;

public class set_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        System.out.println("enter the position:");
        int pos= sc.nextInt();
        int bitmask=1<<pos;
        int newnumber=bitmask | num;
        System.out.println(newnumber);
    }
}
