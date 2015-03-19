package com.exam;
import java.util.Scanner;
import java.util.StringTokenizer;
public class exam {

	/**
	 * @param args
	 */
	//final data
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String data=sc.nextLine();
		int length=data.length();
		int cut=length;
		int space=0;
		char ch[]=data.toCharArray();
		for(int i=length-1;i>=0;i-- )
		{
			space++;
			if(ch[i] == ' ' || i==0)
			{	
				if(i==0)
				{
					System.out.print(" ");
				}
				for(int j=i;j<=cut-1;j++ )
				{
					System.out.print(ch[j]);
				}
				i=length-space;
				cut=i;
			}		
		}
	}
}
