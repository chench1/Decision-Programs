package sortstrings;
/*
Charles - 
Date - 11/10/2021
Purpose - 
*/

import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputs = new String[3];
        System.out.println("This program will ask for three strings that you, the user, will input. The program will then sort the 3 strings in lexicographical order. Please enter 3 strings and each string followed by the enter key: ");
        inputs[0] = (scan.nextLine());
        inputs[1] = (scan.nextLine());
        inputs[2] = (scan.nextLine());
        Arrays.sort(inputs);
        for (String input : inputs) {
            System.out.println(input);
        }
    }

}
