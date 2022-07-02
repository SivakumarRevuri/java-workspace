package com.pgpractice.june16;

public class NamingConversion {

	public String decToBin(int x) {
		String bin="";
		while(x!=0){
			int r= x%2;
			bin= r+bin;
			x=x/2;
		}
		return bin;
	}
	public String decToOct(int x) {
		String bin="";
		while(x!=0){
			int r= x%8;
			if(r<8){
			bin= r+bin;
			}else 
				
			x=x/8;
		}
		return bin;
	}	
	public String decToHex(int x) {
		String hx="";
		while(x!=0){
			int r= x%16;
			if(r<10){
				hx= r+hx;
			}else 
				hx=(char)(r+55)+hx;
			x=x/16;
		}
		return hx;
	}
	public static void main(String[] args) {
		NamingConversion nc=new NamingConversion();
		String st= nc.decToBin(59);
		System.out.println("binary number is "+st);
		String st1= nc.decToOct(59);
		System.out.println("octal number is "+st1);
		String st2= nc.decToHex(59);
		System.out.println("hexa number is "+st2);
	}

}
