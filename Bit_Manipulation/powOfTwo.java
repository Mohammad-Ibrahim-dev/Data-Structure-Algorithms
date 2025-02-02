package Bit_Manipulation;

import java.util.Scanner;

public class powOfTwo {
    public static boolean isPowOfTwo(int number){
        int num =number;
        while(num>0){
            if (num%2==0) {
                num/=2;
            }
            else break;
        }
        return num == 1;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("result: "+isPowOfTwo(num));
    }
}
