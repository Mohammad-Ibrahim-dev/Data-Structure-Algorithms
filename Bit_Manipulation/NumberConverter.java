package Bit_Manipulation;

import java.util.Scanner;

public class NumberConverter {
    public static int toBin(int num){
       if(num==1) return 1;
       int bin=num%2;
       num/=2;
       return toBin(num)*10+bin;
    }
    public static int toDec(int bin){
        if(bin==0) return 0;
        int rem=bin%10;
        bin/=10;
        return toDec(bin)*2+rem;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number= sc.nextInt();
        System.out.println("binary : "+toBin(number));
        System.out.println("enter the binary number: ");
        int bin= sc.nextInt();
        System.out.println("decimal: "+toDec(bin));
    }
}
