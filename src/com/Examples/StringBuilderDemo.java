package com.Examples;

/*
	Java StringBuilder class is used to create mutable (modifiable) String.
	The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.
*/
public class StringBuilderDemo 
{
   public static void main(String args[])
   {
	   StringBuilder sb1 = new StringBuilder(); // It creates an empty String Builder with the initial capacity of 16.
	   System.out.println(sb1.capacity());
	   
	   StringBuilder sb2 = new StringBuilder(20); // It creates an empty String Builder with the specified capacity as length.
	   System.out.println(sb2.capacity());
	   
	   StringBuilder sb3 = new StringBuilder("Hello"); // It creates a String Builder with the specified string.
	   System.out.println(sb3.capacity());
	   
	   // It has all method what stringBuilder have. Main difference is StringBuilder is not thread safe.
   }
}
