package com.practice.all;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,n=6;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+"is a prime number");
		}
		else
		{
			System.out.println(n+"is not a prime number");
		}

	}

}
