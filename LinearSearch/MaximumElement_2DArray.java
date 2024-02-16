package Algorithm.LinearSearch;

import java.util.Scanner;

public class MaximumElement_2DArray {
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
        int maximum = returnMaximumElement(array);
        System.out.println(maximum+" is the largest element");
    }
    static int returnMaximumElement(int array[][]){
        int maximum = Integer.MIN_VALUE;
        for(int arr[]: array){
            for(int anInt: arr){
                if(anInt>maximum)
                    maximum = anInt;
            }
        }
        return maximum;
    }
}
