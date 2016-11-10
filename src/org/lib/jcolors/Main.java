package org.lib.jcolors;

import java.io.UnsupportedEncodingException;

public class Main {
	// Use the ANSI escape codes to print the colors in the console.
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	
	// Reset code
	public static final String RESET = "\u001B[0m";
	
	private static final String CHECK_MARK = "\u2713";
	private static final String ERROR_MARK = "\u2717";
	
	// -----------------------------------------------------------------------------------------
	
	public enum PrintColor {

		  BLACK("\u001B[30m"),
		  RED("\u001B[31m"),
		  GREEN("\u001B[32m"),
		  YELLOW("\u001B[33m"),
		  BLUE("\u001B[34m"),
		  PURPLE("\u001B[35m"),
		  CYAN("\u001B[36m"),
		  WHITE("\u001B[37m");

		  private String ansiColor;

		  PrintColor(String ansiColor) {
			  this.ansiColor = ansiColor;
			  }

		  public String getAnsiColor() {
			  return ansiColor;
			  }
		  }
	
	public static void main(String[] args) {
		
		System.out.println(CHECK_MARK + " wrong check mark");
	    try(PrintColorWriter out = new PrintColorWriter(System.out)) {
	      out.println(PrintColor.GREEN, CHECK_MARK +" A green message");
	      out.println(PrintColor.RED, ERROR_MARK +" A red message");
	      out.green(CHECK_MARK +" A green message");
	      out.red(ERROR_MARK +" A red message");
	    } catch (UnsupportedEncodingException e) {
	      e.printStackTrace();
	      }
	    }
}
