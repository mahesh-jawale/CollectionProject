package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public void aadharCardInfo()
	{
		 Set<AadharCardInfo> set=new HashSet<AadharCardInfo>();  
		
		AadharCardInfo objAadharCardInfoPerson1=new AadharCardInfo("Mahesh", "Jawale",25,"Akola");
		AadharCardInfo objAadharCardInfoPerson2=new AadharCardInfo("Sachin", "Khade",25,"Yavatmal");
		AadharCardInfo objAadharCardInfoPerson3=new AadharCardInfo("John", "Abraham",30,"Mumbai");
	
		
		set.add(objAadharCardInfoPerson1);
		set.add(objAadharCardInfoPerson2);
		set.add(objAadharCardInfoPerson3);
		set.add(objAadharCardInfoPerson3);
		
		for(AadharCardInfo aadharCardInfoPerson:set)
		{
			System.out.println("Name : "+aadharCardInfoPerson.strName+"\n"
									+"Surname : "+aadharCardInfoPerson.strSurName+"\n"
									+"Age : "+aadharCardInfoPerson.intAge+"\n"
									+"City : "+aadharCardInfoPerson.strCity+"\n");
									
		}
		
		
	}

}
