package Bit_Manipulation;

import java.util.Scanner;

public class update_bit {
    public static int updateZero(int num ,int pos){
        int bitmask=1<<pos-1;
        int complement=~bitmask;
        return num & complement;
    }

    public static int updateOne(int num,int pos) {
        int bitmask=1<<pos-1;
        return num | bitmask;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        System.out.println("enter the position:");
        int pos= sc.nextInt();
        System.out.println("value after update zero: "+updateZero(num,pos));
        System.out.println("value after update one: "+updateOne(num , pos));
    }
}
