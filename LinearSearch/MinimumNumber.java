package Algorithm.LinearSearch;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        int minimum = findMinimumNumber(array);
        System.out.println(minimum+ " is the smallest number in the array");
    }
    static int findMinimumNumber(int[] array){
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<array.length;i++){
            if(array[i]<minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }
}
