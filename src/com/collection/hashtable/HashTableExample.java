package com.collection.hashtable;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.collection.list.AadharCardInfo;

public class HashTableExample {
	
	public void aadharCardInfo()
	{
		
		 Map<Integer,AadharCardInfo> map=new Hashtable<Integer,AadharCardInfo>();  
			
			AadharCardInfo objAadharCardInfoPerson1=new AadharCardInfo("Mahesh", "Jawale",25,"Akola");
			AadharCardInfo objAadharCardInfoPerson2=new AadharCardInfo("Sachin", "Khade",25,"Yavatmal");
			AadharCardInfo objAadharCardInfoPerson3=new AadharCardInfo("John", "Abraham",30,"Mumbai");
			
			map.put(1,objAadharCardInfoPerson1);
			map.put(2,objAadharCardInfoPerson2);
			map.put(3,objAadharCardInfoPerson3);
			map.put(4,objAadharCardInfoPerson3);
			
		/*	map.forEach((key,value)->{
				System.out.print(key);
				System.out.print("=>");
				System.out.print(value);
				System.out.print("\n");
			});*/
			
			for(Map.Entry<Integer,AadharCardInfo> aadharCardInfoPerson : map.entrySet())
			{
				 int key=aadharCardInfoPerson.getKey(); 
				 System.out.println(key+" "); 
			     AadharCardInfo value=aadharCardInfoPerson.getValue(); 
				System.out.println("Name : "+value.strName+"\n"
										+"Surname : "+value.strSurName+"\n"
										+"Age : "+value.intAge+"\n"
										+"City : "+value.strCity+"\n");
										
			}
		
	}

}
