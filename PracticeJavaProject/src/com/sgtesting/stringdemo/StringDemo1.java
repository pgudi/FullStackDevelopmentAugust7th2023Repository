package com.sgtesting.stringdemo;

public class StringDemo1 {
	public static void main(String[] args) {
		lowercaseDemo();
		uppercaseDemo();
		strLength();
		extractCharBasedOnIndex();
		compareStrings1();
		compareStrings2();
		repalceString();
		existanceOfString();
		splitDemo();
		getCharacters();
		findPosition();
		subStringDemo();
		convertToString();
		concatenationDemo();
		trimDemo();
	}
	
	private static void lowercaseDemo()
	{
		String s1=new String("WELCOME");
		String s2=s1.toLowerCase();
		System.out.println("Lowercase :"+s2);
		System.out.println("--------------");
	}
	
	private static void uppercaseDemo()
	{
		String s1=new String("programming");
		System.out.println("Uppercase :"+s1.toUpperCase());
		System.out.println("--------------");
	}
	
	private static void strLength()
	{
		String s1=new String("programming");
		System.out.println("# of Chars :"+s1.length());
		System.out.println("--------------");
	}
	
	private static void extractCharBasedOnIndex()
	{
		String s1=new String("WELCOME");
		System.out.println("Character at 3rd Position:"+s1.charAt(3));
		System.out.println("--------------");
	}
	
	private static void compareStrings1()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are Equal :"+(s1.equals(s2)));
		System.out.println("Ignoring Case , s1 and s2 are Equal :"+(s1.equalsIgnoreCase(s2)));
		System.out.println("--------------");
	}
	
	private static void compareStrings2()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are Equal :"+(s1.compareTo(s2)));
		System.out.println("Ignoring Case , s1 and s2 are Equal :"+(s1.compareToIgnoreCase(s2)));
		System.out.println("--------------");
	}
	
	private static void repalceString()
	{
		String s1="It is a new palace";
		String s2=s1.replace("is",	"was");
		System.out.println("Replaced Result :"+s2);
		System.out.println("--------------");
	}
	
	private static void existanceOfString()
	{
		String s1="It is a new palace";
		System.out.println("Starts-With :"+s1.startsWith("It"));
		System.out.println("Ends-With :"+s1.endsWith("palace"));
		System.out.println("Contains :"+s1.contains("new"));
		System.out.println("--------------");
	}
	
	private static void splitDemo()
	{
		String s1="Apple,Mango,Banana,Orange,Grapes";
		String str[]=s1.split(",");
		for(String kk:str)
		{
			System.out.println(kk);
		}
		System.out.println("--------------");
	}
	
	private static void getCharacters()
	{
		String s1="Welcome";
		char ch[]=s1.toCharArray();
		for(char ch1 :ch)
		{
			System.out.println(ch1);
		}
		System.out.println("--------------");
	}
	
	private static void findPosition()
	{
		String s=new String("xxaxxaxxaXXAXXA");
		System.out.println("position of 'a' :"+s.indexOf('a'));
		System.out.println("position of 'A' :"+s.indexOf('A'));
		System.out.println("position of 'a' :"+s.lastIndexOf('a'));
		System.out.println("position of 'A' :"+s.lastIndexOf('A'));
		System.out.println("--------------");
	}
	
	private static void subStringDemo()
	{
		String s="Programming";
		System.out.println("substring 1 :"+s.substring(3));
		System.out.println("substring 2 :"+s.substring(3,7));
		System.out.println("--------------");
	}
	
	private static void convertToString()
	{
		String s=String.valueOf(125);
		System.out.println(s);
		String s2=String.valueOf(12.75);
		System.out.println(s2);
		String s3=String.valueOf(true);
		System.out.println(s3);
		System.out.println("--------------");
	}
	
	private static void concatenationDemo()
	{
		String s="Java";
		String s1=s.concat(" Lanaguage");
		System.out.println("Concatenation Result :"+s1);
		System.out.println("--------------");
	}
	
	private static void trimDemo()
	{
		String s="        Java        ";
		System.out.println("Trimed String :"+s.trim().length());
		System.out.println("--------------");
	}
}
