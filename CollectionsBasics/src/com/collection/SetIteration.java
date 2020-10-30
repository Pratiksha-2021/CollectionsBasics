package com.collection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
public class SetIteration {
static HashSet<String> set;
public	SetIteration(){
  set=new HashSet<>();
}
   
//Creating HashSet and adding elements  
public HashSet<String> createAndPrintHashTableElements() {
		set.add("Pratiksha");  
		set.add("Anuja");  
		set.add("Ragini");  
		set.add("somya");
		
		
	//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
		System.out.println();
		return set;
		
		} 

public  void removeSetElement() {
	// display map values
	System.out.println("Original set data  : " +set);
	// Remove entry 104
	set.remove("somya");
	System.out.println("updated set data " + set);
	System.out.println();
	
}
	public void sizeOfSet(){
		int totalsize=set.size();
		System.out.println("size is>>>"+totalsize);
		
		
	}	
	
	public  void ContainsOfSet(){
		System.out.println("Original set data  : " +set);
		set.add("Priyanka");
		boolean contains123 = set.contains("Pratiksha");
       System.out.println("data is present...>>"+contains123);
		//return true; 
	}
	public void clearDataOfSet(){
		 System.out.println("Hash set Elements: "+ set);  
         //Clear set values  
         set.clear();  
         System.out.println("Hash set elements after clear: "+ set);   
         }  
	}
	
	
	



