package com.basic;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindTheDuplicateElementInTheListwithoutusingSet {

	public static void main(String[] args) {
		findDuplicatesInList(List.of(0, 1, 1, 2, 3, 5, 6, 0, 0, 1,6));
	}
	
	public static Set<?> findDuplicatesInList(List<?> beanList) {
	    System.out.println("findDuplicatesInList::"+beanList);
	    Set<Object> duplicateRowSet=null;
	    duplicateRowSet=new LinkedHashSet<Object>();
	            for(int i=0;i<beanList.size();i++){
	                Object superString=beanList.get(i);
	                System.out.println("findDuplicatesInList::superString::"+superString);
	                for(int j=0;j<beanList.size();j++){
	                    if(i!=j){
	                         Object subString=beanList.get(j);
	                         System.out.println("findDuplicatesInList::subString::"+subString);
	                         if(superString.equals(subString)){
	                             duplicateRowSet.add(beanList.get(j));
	                         }
	                    }
	                }
	            }
	            System.out.println("findDuplicatesInList::duplicationSet::"+duplicateRowSet);
	        return duplicateRowSet;
	  }
}
