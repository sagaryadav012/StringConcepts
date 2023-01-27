package com.Examples;

/*
In Java, string is basically an object that represents sequence of char values. 
An array of characters works same as Java string
And String class in immutable
*/
public class StringDemo 
{
   public static void main(String args[])
   {
	  // Ways to create string
	   
	   String str1 = "Happy World,";
	   String str2 = new String("Happy Face");
	   
	   char[] chars = {'S','A','G','A','R'};
	   String str3 = new String(chars);
	   
	   System.out.println(str3+" "+str1+" "+str2);
   }
}
