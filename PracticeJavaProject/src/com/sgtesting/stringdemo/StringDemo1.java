package com.sgtesting.stringdemo;

public class StringDemo1 {
	public static void main(String[] args) {
		
		String s1="Java";
		String s2="java";
		String s3="Java";
		String s4=new String("Java");
		String s5=new String("java");
		String s6=new String("Java");
		
		System.out.println("(s1==s2) :"+(s1==s2));
		System.out.println("(s1==s3) :"+(s1==s3));
		System.out.println("(s1==s4) :"+(s1==s4));
		System.out.println("(s4==s6) :"+(s4==s6));
		System.out.println("(s1.equals(s4):"+s1.equals(s4));
	}
}
