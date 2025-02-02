package String;

//Take an array of Strings input from the user & find the cumulative(combined) length of all those strings.

import java.util.Scanner;

public class LenCombString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =5;
        int totalLength=0;
        String[] arr= new String[size];
        System.out.println("enter your data :");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.next();
            totalLength+=arr[i].length();
        }
        System.out.println("total length of array is : "+totalLength);
    }
}
