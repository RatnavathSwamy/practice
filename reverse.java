package com.practice.all;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=453,rev=0;
		while(n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
System.out.println("the reverse of a number is"+rev);
	}

}
