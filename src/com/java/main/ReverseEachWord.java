package com.java.main;


	import java.util.Scanner;

	public class ReverseEachWord {

		public static void ReverseSentence(String s)
		{
			StringBuffer sb=new StringBuffer();
			String[] str=s.split(" ");
			
			for(int i=str.length-1;i>=0;i--)
			{
				sb.append(str[i]);
				sb.append(" ");
			}
			
				String st=sb.toString();
				String[] str2=st.split(" ");
		
			System.out.println("reverse sentence"+" "+sb.toString());
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter the string");
			Scanner in=new Scanner(System.in);
			String original=in.nextLine();
			ReverseSentence(original);

		}

	}


