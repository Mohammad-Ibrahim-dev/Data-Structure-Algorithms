package Array;

// Take an array of numbers as input and check if it is an array sorted in ascending Order.

import java.util.Scanner;

public class IsAscending {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean isAscending=true;
        int size=5;
        int[] numbers =new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= sc.nextInt();
        }
        for(int j=0 ;j< numbers.length-1;j++){
            if (numbers[j] > numbers[j + 1]) {
                isAscending = false;
                break;
            }
        }
        System.out.println("IsAscending : "+isAscending);
    }
}
