package com.exam;
import java.util.*;

public class DuplicateString {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string");
		String line=sc.nextLine();
		char ch[]=line.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < line.length(); i++) {
		  char c = line.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    map.put(c, ++cnt);
		  } else {
		    map.put(c, 1);
		  }
		}
		
		
	}

}
