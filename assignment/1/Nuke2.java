import java.net.*;
import java.io.*;

class Nuke2 {
  public static void main(String[] arg) throws Exception {
	  BufferedReader keyboard;
	  String input;
	  keyboard = new BufferedReader(new InputStreamReader(System.in));
	  System.out.print("Please input: ");
	  System.out.flush();
	  input = keyboard.readLine();
	  String output;
	  output = input.substring(0,1) + input.substring(2);
	  System.out.println(output);
  }
}

// substring : extract substring of a string