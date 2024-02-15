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

*/