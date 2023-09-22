package com.gentech.programs;

public class VowelDemo {

	public static void main(String[] args) {
		
		char ch=args[0].charAt(0);
		switch (ch) 
		{
		case 'A':case 'E':case 'I':case 'O':case 'U':
			System.out.println(ch+" is a Vowel");
		//	break;
		default:
			System.out.println("It is not a Vowel");
		}

	}

}
