package com.Examples;

/*
Java StringBuffer class is used to create mutable (modifiable) String objects. 
The StringBuffer class in Java is the same as String class except it is mutable 
i.e. it can be changed.

Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. 
So it is safe and will result in an order.

*/
public class StringBufferDemo 
{
   public static void main(String args[])
   {
	   StringBuffer s1 = new StringBuffer(); // It creates an empty String buffer with the initial capacity of 16.
	   System.out.println(s1.capacity()); // Ans : 16
	   
	   StringBuffer s2 = new StringBuffer(20); // It creates an empty String buffer with the specified capacity as length.
	   System.out.println(s2.capacity());
	   
	   StringBuffer s3 = new StringBuffer("Welcome"); // It creates a String buffer with the specified string..
	   System.out.println(s3.capacity());
	   
	    s3 = s3.append(" Alien"); // It keeps Welcome in string pool and creates Welcome Alien String in string pool.
	   System.out.println(s3);
   }
}
