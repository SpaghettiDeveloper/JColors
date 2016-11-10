package org.lib.jcolors;

public class PrintColorWriter extends PrintWriter {

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
