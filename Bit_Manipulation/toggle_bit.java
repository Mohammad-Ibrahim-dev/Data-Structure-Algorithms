package Bit_Manipulation;
import java.util.Scanner;

public class toggle_bit {
    public static int getBit(int num,int pos){
        int bitmask=1<<pos-1;
        return ((bitmask & num) ==0)?0:1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result;
        System.out.println("enter the number:");
        int num =sc.nextInt();
        System.out.println("enter the position:");
        int pos= sc.nextInt();
        int bit=getBit(num,pos);
        if (bit == 0) {
            result=update_bit.updateOne(num,pos);
            System.out.println("Result: "+result);
        }
        else{
            result=update_bit.updateZero(num,pos);
            System.out.println("Result: "+result);
        }
    }
}
