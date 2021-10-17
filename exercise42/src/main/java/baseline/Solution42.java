/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 42
 *  Copyright 2021 Anthony Sevarino
 */

/*
 * Access input file
 * separate each string with ,
 * print in table format
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution42 {
    public void entry(String output){
        try {
            File out = new File(output);
            Scanner scnr = new Scanner(out);
            while(scnr.hasNext()){
                String strng = scnr.nextLine();
                String[] x = strng.split(",");
                System.out.printf("%-10s%-10s%-10s\n", x[0], x[1], x[2]);
            }
        } catch (FileNotFoundException ex){
            System.out.println("File Not Found");
        }
    }

    public static void main(String[] args) {
        Solution42 data = new Solution42();
        System.out.printf("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        System.out.println("----------------------------");
        data.entry("exercise42_input.txt");
    }
}
