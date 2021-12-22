package com.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	public void aadharCardInfo()
	{
		 List<AadharCardInfo> list=new LinkedList<AadharCardInfo>();  
		
		AadharCardInfo objAadharCardInfoPerson1=new AadharCardInfo("Mahesh", "Jawale",25,"Akola");
		AadharCardInfo objAadharCardInfoPerson2=new AadharCardInfo("Sachin", "Khade",25,"Yavatmal");
		AadharCardInfo objAadharCardInfoPerson3=new AadharCardInfo("John", "Abraham",30,"Mumbai");
		
		list.add(objAadharCardInfoPerson1);
		list.add(objAadharCardInfoPerson2);
		list.add(objAadharCardInfoPerson3);
		list.add(objAadharCardInfoPerson3);
		
		for(AadharCardInfo aadharCardInfoPerson:list)
		{
			System.out.println("Name : "+aadharCardInfoPerson.strName+"\n"
									+"Surname : "+aadharCardInfoPerson.strSurName+"\n"
									+"Age : "+aadharCardInfoPerson.intAge+"\n"
									+"City : "+aadharCardInfoPerson.strCity+"\n");
									
		}
		
		
	}

}
