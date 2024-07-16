package com.practice.all;

public class polyndrom {
	public static void main(String[] args) {
		String k="nani";
		String l="";
		for(int i=k.length()-1;i>=0;i--)
		{
			l=l+k.charAt(i);
		}
		if(k.equals(l))
		{
			System.out.println(k+" is polyndrome");
		}
		else 
		{
			System.out.println(k+"is not a polyndrome");
		}
		System.out.println("the reversed string is :"+l);
	}

}
