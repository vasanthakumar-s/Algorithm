package Algorithm.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch_2DArray{
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
        System.out.print("Enter the element to find: ");
        int target = input.nextInt();
        int index[] = findAnElement(array, rows, columns, target);
        System.out.println(target+ " lies in ["+index[0]+","+index[1]+"]");
    }

    static int[] findAnElement(int array[][], int rows, int columns, int target){
        //int index[] = new int[2];
        for(int row=0; row<rows; row++){
            for(int col=0; col<columns; col++){
                if(array[row][col]==target){
                    // index[0] = row;
                    // index[1] = col;
                    // return index;
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}