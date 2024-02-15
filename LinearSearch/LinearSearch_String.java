package Algorithm.LinearSearch;

import java.util.Scanner;

public class LinearSearch_String{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        System.out.print("Enter the character to find: ");
        char target = input.next().charAt(0);
        
        int index = findCharacter1(str, target);
        System.out.println(target+" is found at index "+index);
        System.out.println(findCharacter2(str, target));

    }

    static int findCharacter1(String str, char character){
        for(int i=0; i<str.length(); i++ ){
            if(str.charAt(i) == character){
                return i;
            }
        }
        return -1;
    }

    static boolean findCharacter2(String str, char target){
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

}