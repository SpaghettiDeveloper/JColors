package org.lib.jcolors;

import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.lib.jcolors.Main.PrintColor;

/*
 * I chose to use a basic flow character instead of a byte stream as a basis Printstream.
 * This class add a new println method that receives the color and the string to be
 * printed on the console, also have a utility method such as green and red for the press
 * to the desired color console.
 */

public class PrintColorWriter extends PrintWriter{

	  private static final String ANSI_RESET = "\u001B[0m";

	  public PrintColorWriter(PrintStream out) throws UnsupportedEncodingException {
		  super(new OutputStreamWriter(out, "UTF-8"), true);
		  }

	  public void println(PrintColor color, String string) {
		  print(color.getAnsiColor());
		  print(string);
		  println(ANSI_RESET);
		  flush();
		  }

	  public void green(String string) {
		  println(PrintColor.GREEN, string);
		  }

	  public void red(String string) {
		  println(PrintColor.RED, string);
		  }
}
