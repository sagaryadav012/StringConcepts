package com.Examples;

/*
Each time you create a string literal, the JVM checks the "string constant pool" first. 
If the string already exists in the pool, a reference to the pooled instance is returned. 
If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
*/
public class StringEx1 
{
   public static void main(String args[])
   {
	   String s1 = "Something"; // Something string created in sting pool
	   String s2 = new String("Something"); // s2 object refers to instance created in non pool
	   String s3 = "Never";
	   String s4 = "Something"; // refers to "Something" created at s1
	   
	   // Equals checks the content of String object
	   System.out.println(s1.equals(s2));  // true : content is same
	   System.out.println(s1.equals(s3));  // false : content is not same
	   
	   // == check the reference points of both objects
	   System.out.println(s1==s2); // false : content is same but reference points are different
	   System.out.println(s1==s3); // false : content is not same and also reference is not same.
	   System.out.println(s1==s4); // true : reference points are same;
   }
}
