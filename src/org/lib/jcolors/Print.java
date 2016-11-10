package org.lib.jcolors;

public class Print {
	
	private static final String CHECK_MARK = "\u2713";
	  private static final String ERROR_MARK = "\u2717";

	  public static void main(String[] args)  {

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
