package com.practice.string;

public class ConvertStringToInt {

    static int str2int(String st) {
	char[] ch = st.toCharArray();
	int sum = 0;
	for (int i = 0; i < ch.length; i++) {
	    if (ch[i] >= 48 && ch[i] <= 57) {
		sum = sum * 10 + (ch[i] - 48);
	    } else {
		System.out.println("invalid data");
		System.exit(0);
	    }
	}
	return sum;
    }

    public static void main(String[] args) {
	String st1 = "125";
	String st2 = "25";
	// Using custom logic
	int n1 = str2int(st1);
	// converting string to integer by valueOf()
	int n2 = Integer.valueOf(st2);
	System.out.println(n1 + n2);
    }
}
