package Algorithm.BinarySearch;

import java.util.Scanner;

public class BinarySearch_Ascending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        int array[] = new int[length];
        System.out.print("Enter the elements: ");
        for(int index=0; index<length; index++){
            array[index] = input.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = input.nextInt();
        System.out.println(binarySearchAscending(array, target));
    }
    static int binarySearchAscending(int array[], int target){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target>array[mid]){
                start = mid+1;
            }
            else if(target<array[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
//1 2 3    4    5 6 7
//2
//4 = mid