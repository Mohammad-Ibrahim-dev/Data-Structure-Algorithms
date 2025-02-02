package Sortings;

import java.util.Scanner;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        int[] data= new int[size];
        System.out.println("enter the array :");
        for (int i = 0; i <size; i++) {
            data[i]= sc.nextInt();
        }
        int[] SortedResult=bubbleSort(data);
        System.out.println("Your Sorted data:");
        for (int k: SortedResult){
            System.out.print(k+" ");
        }
    }
}