package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistIteration {
	 public static void main(String[] args) { 
	     ArrayList al = new ArrayList();
	     al.add("pratiksha");
	     al.add("Anuja");
	     al.add("Sukanya");
	     System.out.println(al.size());
	     //to check if Arraylist is empty
	     al.isEmpty();
	   System.out.println("iteration of Arraylist by for loop"); 
	     for (int i = 0; i < al.size(); i++) {
	        System.out.println(al.get(i));
	    }
	   System.out.println("iteration of Arraylist by Iterator");
	     Iterator itr = al.iterator();
	        while (itr.hasNext()) { 
	          Object obj = itr.next(); 
	           String str = (String) obj; 
	          // String str=(String) itr.next();
	           System.out.println(str);
	         }
	   System.out.println("iteration of Arraylist by List Iterator");
	     ListIterator ltr = al.listIterator(); 
	        while (ltr.hasNext()) {
	           Object o = ltr.next();
	           String s = (String) o; 
	           System.out.println(s);	
	           //Object op = ltr.previous();
	           /*String prevStr = (String) op; 
	           System.out.println(prevStr);*/
	        }
	    }
	}


