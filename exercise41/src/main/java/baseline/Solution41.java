/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 41
 *  Copyright 2021 Anthony Sevarino
 */


/* have input and output file ready in baseline
 * create function to sort names alphabetically until no more entries in input
 * add the names from the input file
 * write these names to output file listing number of names
 * close to avoid mem leak
 * scan input file
 * insert names into array and sort
 */


package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution41 {

    public static void inp_File(Scanner scnr, ArrayList<String> names){
        //continue reading names until there are none remaining
        while(scnr.hasNextLine()){
            names.add(scnr.nextLine());
        }
    }


    public static void out_File(ArrayList<String> names) throws IOException {
        FileWriter out = new FileWriter("exercise41_output.txt");
        out.write("Total of " + names.size() + " names\n");
        out.write("----------\n");

        for (String i : names) {
            out.write(i + "\n");
        }

        out.close();
    }

    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(new File("exercise41_input.txt"));

        ArrayList<String> names = new ArrayList<>();

        inp_File(scnr, names);


        names.sort(String.CASE_INSENSITIVE_ORDER);

        scnr.close();

        out_File(names);
    }
}
