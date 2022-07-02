package com.practice;

public class StackDemo {
	boolean isBalanced(String st) {
	String s="(()){}";
	Stack stk=new Stack();
	char ch[]=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if (ch[i]=='{'||ch[i]=='('||ch[i]=='[') {
			stk.push(ch[i]);
		}
		else {
			char pc=(char)stk.pop();
			switch(ch[i])
			{
			case '}':if(pc!='{')	
				return false;
			case ')':if(pc!='(')	
				return false;
			case ']':if(pc!='[')	
				return false;
			default:return false;
			}
		}
	}
	return true;
}
}

