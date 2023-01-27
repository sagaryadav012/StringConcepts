package com.Examples;

public class StringEx2 
{
   public static void main(String args[])
   {
	   String s1 = "never";
	   String s2 = "chaNGed";
	   
	   String s3 = "The java string split method splits this string";
	   
	   System.out.println(s1.toUpperCase()); // NEVER
	   System.out.println(s2.toLowerCase()); // changed
	   System.out.println(s2.length()); // 7
	   System.out.println(s1.charAt(3)); // e
	   System.out.println(s2.indexOf('N'));  // index starts from 0, So answer is 3
	   System.out.println(s2.substring(1, 4)); // haN
	   System.out.println(s1.concat(s2)); // neverchaNGed
	   
	   String[] strs = s3.split(" "); // It splits s3 at whitespace
	   
	   for(String str : strs)
	      System.out.println(str);
	  
   }
}
