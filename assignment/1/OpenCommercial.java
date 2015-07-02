/* OpenCommercial.java */

import java.net.*;
import java.io.*;
import java.util.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;  // use BufferedReader when you input something from outside device
    String inputLine;   // use String and readLine to transform the BufferedReader into string

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    URL web = new URL("http://www." + inputLine + ".com/");
    BufferedReader in = new BufferedReader(new InputStreamReader(web.openStream()));
    String input;
    List<String> output = new ArrayList<String>();    // create a immutable list
    //List output = new ArrayList();
	int i = 0;
    while (i < 5 && (input = in.readLine()) != null) {
        output.add(input);
        i++;
    }
    //in.close();
    System.out.println(output);
	int j;
    for (i = output.size() - 1; i >= 0; i--) {
		j = i + 1;
        System.out.println("Line"+ j +":"+output.get(i));   // .get(i)  obtain the i-th element of the list
    }
  }
}