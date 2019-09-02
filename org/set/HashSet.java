package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet{
	public static void main(String[] args) {
		//List<String> lid=new ArrayList<String>();
		Set<Employee> li=new LinkedHashSet<>();
		Employee e=new Employee();
		
		//assign value for 1st employee
		e.setName("shambhu");
		e.setEmpId(12345);
		e.setAddress("Moggapair");
		e.seteMail("shambhu@7788");
		e.setPhone(9543647348l);
		e.setSal(566664);
		e.setGender("male");
		e.setDob(11-7-1995);
		e.setDoj(12-6-2019);
		
		li.add(e);
		for (Employee x : li) {
			System.out.println(x.getEmpId());
			System.out.println(x.getName());
			System.out.println(x.getDob());
			
		}
	}

}
