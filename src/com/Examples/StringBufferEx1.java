package com.Examples;

public class StringBufferEx1 
{
    public static void main(String args[])
    {
    	StringBuffer s1 = new StringBuffer("Inever");
    	s1.insert(1, "Changed");
    	System.out.println(s1);  // s1 = IChangednever
    	
    	s1.replace(1, 8, " Space "); // s1 = I Space never
    	System.out.println(s1);
    	
    	s1.delete(1, 8);
    	System.out.println(s1); // s1 = Inever
    	
    	s1.reverse();
    	System.out.println(s1); // s1 = revenI
    	
    	System.out.println(s1.substring(2,4)); // ve
    	
    	System.out.println(s1.length()); // 6
    	
    	System.out.println(s1.charAt(5)); // I
    }
}
