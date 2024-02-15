package Algorithm.LinearSearch;

import java.util.Scanner;

public class MaximumNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        int maximum = findMaximumNumber(array);
        System.out.println(maximum+ " is the largest number in the array");
    }
    static int findMaximumNumber(int[] array){
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            if(array[i]>maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }
}