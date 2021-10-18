/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 43
 *  Copyright 2021 Anthony Sevarino
 */


/*
 * Ask user for name of site, author, and if they want folder for java and css files
 * create index.html with above information
 * output to program directory
 */

package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is the name of your website?");
        String name = scnr.nextLine();

        System.out.println("Who is the author of your website?");
        String author = scnr.nextLine();

        System.out.println("Do you want a folder for JavaScript files? (y/n)");
        String javaChoice = scnr.nextLine();

        System.out.println("Do you want a folder for CSS files? (y/n)");
        String cssChoice = scnr.nextLine();

        new File("C:" + File.separator + "Users" + File.separator + "sevar" + File.separator + "Desktop" + File.separator + "sevarino-a04"
                + File.separator + "exercise43" + File.separator + "outputFiles" + File.separator + name).mkdirs();

        String dir = "C:" + File.separator + "Users" + File.separator + "sevar" + File.separator + "Desktop" + File.separator + "sevarino-a04"
                + File.separator + "exercise43" + File.separator + name;
        String indexHTML = "index.html";
        FileWriter indexData = new FileWriter(indexHTML);
        indexData.write("<!doctype html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>" + name + "</title>\n" +
                "    <meta>" + author + "</meta>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <p>This is an example paragraph. Anything in the " +
                "<strong>body</strong> tag will appear on the page, just like this <strong>p</strong> tag and its contents.</p>\n" +
                "  </body>\n" +
                "</html>");
        indexData.close();

        System.out.println("Created " + dir);
        System.out.println("Created " + dir + File.separator + indexHTML);

        if(javaChoice.equals("y") || javaChoice.equals("Y")){
            new File("C:" + File.separator + "Users" + File.separator + "sevar" + File.separator + "Desktop" + File.separator + "sevarino-a04"
                    + File.separator + "exercise43" + File.separator + "outputFiles" + File.separator + name + File.separator + "js").mkdirs();
            System.out.println("Created " + dir + File.separator + "js" + File.separator);
        }

        if(cssChoice.equals("y") || cssChoice.equals("Y")){
            new File("C:" + File.separator + "Users" + File.separator + "sevar" + File.separator + "Desktop" + File.separator + "sevarino-a04"
                    + File.separator + "exercise43" + File.separator + "outputFiles" + File.separator + name + File.separator + "css").mkdirs();
            System.out.println("Created " + dir + File.separator + "css" + File.separator);
        }
    }
}
