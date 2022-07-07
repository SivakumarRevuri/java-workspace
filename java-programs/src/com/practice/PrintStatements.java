package com.practice;

/*
 * In print statements belongs to OutputStream class
 * System class of out datamembers works as
 *    * See the {@code println} methods in class {@code PrintStream}.
     *
     * @see     java.io.PrintStream#println()
     * @see     java.io.PrintStream#println(boolean)
     * @see     java.io.PrintStream#println(char)
     * @see     java.io.PrintStream#println(char[])
     * @see     java.io.PrintStream#println(double)
     * @see     java.io.PrintStream#println(float)
     * @see     java.io.PrintStream#println(int)
     * @see     java.io.PrintStream#println(long)
     * @see     java.io.PrintStream#println(java.lang.Object)
     * @see     java.io.PrintStream#println(java.lang.String)
     *    public static final PrintStream out = null;
 * */

public class PrintStatements {

    public static void main(String[] args) {
	// Printing the statement
	System.out.print("Programming is awsome");
	// Printing the statement in new line
	System.out.println("Programming is awsome");
	// Printing the error statement
	System.err.println("Programming sucks!!!");
    }
}
