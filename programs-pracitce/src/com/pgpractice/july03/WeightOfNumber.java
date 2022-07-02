/* w a j p to calculate weight of given number  based on following rules 
 * 
 * 5 if divisible by 5
 * 4 if even
 * 3 if divisible by 3
 */
package com.pgpractice.july03;
import java.util.Scanner;
public class WeightOfNumber {
	void meth(int i){
		int w=0;
		if(i%5==0){
			w=w+5;
		} if (i%2==0){
			 w=w+4;
		} if (i%3==0){
			w=w+3;
		}	System.out.println("weight of  "+ i+ " is " +w );
	}
	public static void main(String[] args) {
		System.out.println("enter the value to find the weight");
		Scanner s= new Scanner(System.in);
		int i=s.nextInt();
		WeightOfNumber w= new WeightOfNumber();
		w.meth(i);
		s.close();
	}
}
