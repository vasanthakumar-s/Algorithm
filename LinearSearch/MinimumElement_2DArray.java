package Algorithm.LinearSearch;

import java.util.Scanner;

public class MinimumElement_2DArray {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        int array[][] = new int[rows][columns];
        for(int row=0; row<rows; row++){
            for(int col=0; col<columns; col++){
                array[row][col] = input.nextInt();
            }
        }
        int minimum = returnMinimumElement(array);
        System.out.println(minimum+" is the smallest number in the array");
    }
    static int returnMinimumElement(int array[][]){
        int minimum = Integer.MAX_VALUE;
        for(int arr[]:array){
            for(int num: arr){
                if(num<minimum)
                    minimum = num;
            }
        }
        return minimum;
    }
}
