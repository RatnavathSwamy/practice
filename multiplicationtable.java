package com.practice.all;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter table no:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(n+"*"+i+"="+(n*i));
}

	}

}
