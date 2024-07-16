package com.practice.all;

public class maxminofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {5,6,4,7,4};int temp=0;
		for(int i=1;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
					
			}
		}
		System.out.println("max and min element is"+array[array.length-1]+"and"+array[0]);

	}

}
