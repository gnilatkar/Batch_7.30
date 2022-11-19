package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> empNameList= new ArrayList<String>();
		empNameList.add("Ravi");
		empNameList.add(null);
		empNameList.add("Raju");
		empNameList.add("Ravi");
		empNameList.add("Akash");
		System.out.println("Size of List1:"+empNameList.size());
		System.out.println("EmpList1:"+empNameList);
		
		List<String> empNameList2= new ArrayList<String>();
		empNameList2.add("Rani");
		empNameList2.add("Ramesh");
		System.out.println("Size of List2:"+empNameList2.size());
		System.out.println("EmpList1:"+empNameList2);
		empNameList.addAll(empNameList2);
		
		System.out.println("Size of List after add list1:"+empNameList.size());
		
		empNameList2.clear();
		System.out.println("After clear Size of List2:"+empNameList2.size());
		
		//System.out.println("Size:"+empNameList2.size());
		
		
		
		
		//empNameList.remove(4);
		
		

	}

}
