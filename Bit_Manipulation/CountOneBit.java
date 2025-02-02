package Bit_Manipulation;

import java.util.Scanner;

public class CountOneBit {
    public static int onesBit(int num){
        int bin=NumberConverter.toBin(num);
        int nbits=0;
        while(bin>0){
            if(bin%10==1) nbits++;
            bin /=10;
        }
        return nbits;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number");
        int bin= sc.nextInt();
        System.out.print("No. of ones bits: "+onesBit(bin));
    }
}
