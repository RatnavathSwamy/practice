package com.practice.all;

public class countingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=736846843;
		int r,rev=0,count=0;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			count++;
		}
		System.out.println("total digits is:"+count);

	}

}
