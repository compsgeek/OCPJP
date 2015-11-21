package ocpjp.chapter1;

import java.lang.*;  // imported by default
import java.util.*; // utilities like date n time functions
import java.io.*;  // for i/o manipulations


// * = api,exceptions,interfaces and classes

@SuppressWarnings("unused")
public class Intro { // public,default,private,protected are access specifiers for class intro

	public static void main(String[] args) { 
		
		/*
		 *  if 'public' not written -  compiles , error = main method not public 
		 *  if 'static' not written -  compiles , exception = NoSuchMethodError 
		 *  if 'void' not written - fails to compile , error = return type required 
		 *  if 'main' not written - fails to compile , error = <identifier> expected
		 *  if 'int' is written instead of void - compiles , NoSuchMethodError */
		
		System.out.println("hello world");
	}

}

