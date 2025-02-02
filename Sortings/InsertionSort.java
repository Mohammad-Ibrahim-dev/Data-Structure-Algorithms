package Sortings;

import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("entre the size :");
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int[] data = new int[size];
        System.out.println("enter the your data :");
        for (int i = 0; i < size; i++) {
            data[i]= sc.nextInt();
        }
        int[] sortedData=insertionSort(data);
        System.out.println("Sorted data :");
        for (int k :sortedData){
            System.out.print(k+" ");
        }
    }
}
