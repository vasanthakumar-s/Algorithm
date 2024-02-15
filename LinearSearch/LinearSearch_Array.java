package Algorithm.LinearSearch;

import java.util.Scanner;

public class LinearSearch_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        int array[] = new int[length];
        System.out.print("Enter the elements: ");
        for(int i=0; i<length; i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter the number to be found: ");
        int target = input.nextInt();

        int index = returnIndex(array, target);
        System.out.println(target+" is in the index number "+index);
        int element = returnElement(array, target);
        System.out.println(element+" is the element");
    }

    static int returnIndex(int array[],int target){
        for(int i=0; i<array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int returnElement(int array[],int target){
        for(int num: array){
            if(num==target){
                return num;
            }
        }
        return Integer.MAX_VALUE;
    }

}

/*

Linear Search

Linear Search is used to find an elament from multiple elements.
Best Time Complexity - O(1) - If element is found in the 0th index
Worst Time Complexity - O(n) - If the element is not present in the array and 'n' may denote the length of the array

Consider we have to find a element in the array.
array = 3, 9, 7, 1, 6, 5, 8

Step 1: Traverse the array
Step 2: Match the key element with array element
Step 3: If key element is found, return the index position of the array element
Step 4: If key element is not found, return -1

*/