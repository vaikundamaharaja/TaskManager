package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LearnJava8 {

	public static void main(String[] args) throws TestException {
		//ArithmeticException
		//System.out.println(10/0);
		//System.out.println(getSourceCodeLine());
		//throw new TestException();
		//System.out.println("<html><a>https//google.com </a></html>");
		
		/*List<Integer> list= new LinkedList<Integer>();
		list.add(15);list.add(5);list.add(11);list.add(8);
		System.out.println(list.stream().count());
		
		String str=new String("Java");
		String str1=new String("Java");
				System.out.println(str.hashCode()+"  "+str1.hashCode());
				
				HashMap<String, String> mp=new HashMap<String, String>();
		mp.hashCode();
*/
		sortMapByValue();
	}
	
	public static void sortMapByValue() {
		 HashMap<String, String> codenames = new HashMap<String, String>();
		 
		 //TreeMap<K, V>
	        
	        codenames.put("JDK 1.1.4", "Sparkler");
	        codenames.put("J2SE 1.2", "Playground");
	        codenames.put("J2SE 1.3", "Kestrel");
	        codenames.put("J2SE 1.4", "Merlin");
	        codenames.put("J2SE 5.0", "Tiger");
	        codenames.put("Java SE 6", "Mustang");
	        codenames.put("Java SE 7", "Dolphin");
	       /* 
	        * Java8 Ordering map by value not worked properly in List. Worked well in Map. Code below
	        * 
	        * List<Map.Entry<String, String>> order = new ArrayList<>(codenames.entrySet());
	        System.out.println(order);
	        Collections.sort(order,(o1,o2)-> o1.getKey().compareTo(o2.getValue()));
	        System.out.println(order);
	      //  List<Map.Entry<String, String>> order=codenames.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
	      //  System.out.println(order);
	        */
	        /*Iterator<String> iterator = codenames.keySet().iterator();
	        int s=0;
	        while(iterator.hasNext()){
	         iterator.next();
	          if(s==0){
	            iterator.remove();
	        	 // codenames.put("sd","sdf");
	          }
	          s=1;
	        }
	        
	        System.out.println(codenames);*/
	       // Map.Entry<K, V>
	        /*
	         //* Sorting map by values using Java 8 return linked list
	       //  * 
	        Map<String, String> sortedByValue=codenames.entrySet().stream().sorted(Map.Entry.<String,String>comparingByValue()).
	        collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2)->o1, LinkedHashMap::new));
	        System.out.println(sortedByValue);*/
	        /*
	         * Sort Map by value without comparator
	         * 
	         * Set<Entry<String, String>> entries = codenames.entrySet();
	        List<String> nameList=new LinkedList<>();
	        for(Entry<String, String> ent:entries)
	        	nameList.add(ent.getValue());
	        Collections.sort(nameList);
	        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>();
	        for(String eachName:nameList)
	        {
	        	for(Entry<String, String> ent:entries) {
	        		if(eachName.equals(ent.getValue()))
	        			sortedByValue.put(ent.getKey(), ent.getValue());
	        	}
	        }
	        System.out.println(sortedByValue);*/
	        /*
	         * Sort Map by value Using comparator
	         * 
	         * Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>() {
	            
	            @Override
	            public int compare(Entry<String, String> e1, Entry<String, String> e2) {
	                String v1 = e1.getValue();
	                String v2 = e2.getValue();
	                return v1.compareTo(v2);
	            }
	        };
	        List<Entry<String, String>> listOfEntries = new ArrayList<Entry<String, String>>(entries);
	        
	        // sorting HashMap by values using comparator
	        Collections.sort(listOfEntries, valueComparator);
	        
	        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());
	        
	        // copying entries from List to Map
	        for(Entry<String, String> entry : listOfEntries){
	            sortedByValue.put(entry.getKey(), entry.getValue());
	        }
	        System.out.println("HashMap after sorting entries by values ");
	        Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
	        
	        for(Entry<String, String> mapping : entrySetSortedByValue){
	            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
	        }*/
	        
	}
	
	public static String getSourceCodeLine() {
	    // An index of 1 references the calling method
	    StackTraceElement ste = new Throwable().getStackTrace()[1]; 
	    return "(" + ste.getFileName() + ":" + ste.getLineNumber() + ")(https//google.com)";
	}

}
