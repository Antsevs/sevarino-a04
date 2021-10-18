/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 44
 *  Copyright 2021 Anthony Sevarino
 */


/*
 * store data from file in object
 * set products in array and take user input
 * get user information
 * compare input and JSON object
 * if matching, give pertinent information
 */

package baseline;


import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Solution44 {
    public static void main(String[] args) {
        //To read json file, first you need to add one external library
        //This is the library json-simple-1.1.1.jar
        //Create one json parser object
        JSONParser parser = new JSONParser();
        try {
            //Read json file using parser and store it in obj
            Object obj = parser.parse(new FileReader("D:/products.json"));
            //Create json object to read internal values
            JSONObject jsonObject = (JSONObject)obj;
            //Reading products array from  the file
            JSONArray subjects = (JSONArray)jsonObject.get("products");
            //Create buffered reader object to take user input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //Create string variable
            String input;
            //Flag is used whether given string is present or not
            int flag = 0;
            System.out.print("What is the product name? ");
            input = bufferedReader.readLine();
            //Create iterator for products array
            Iterator iterator = subjects.iterator();
            //Loop through the iterator
            while (iterator.hasNext()) {
                //Create another json
                JSONObject json = (JSONObject) iterator.next();
                //Get the name value
                String name = (String)json.get("name");
                //Compare it with given input
                if(input.toLowerCase().equals(name.toLowerCase())){
                    System.out.println("Name: "+name);
                    System.out.println("Price: "+json.get("price"));
                    System.out.println("Quantity: "+json.get("quantity"));
                    flag = 1;
                }
            }
            //If flag value is zero, then value is not found
            if(flag == 0){
                System.out.println("Sorry, that product was not found in our inventory");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
}
