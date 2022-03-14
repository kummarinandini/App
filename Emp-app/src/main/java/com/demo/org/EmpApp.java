package com.demo.org;

import com.demo.org.EmpDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmpApp<listPersonBycity> {


	public String findEmp(int EmpId) {
		if(EmpDB.db.containsKey(EmpId)) {
			return EmpDB.db.get(EmpId).getDetails();
		}else {
			return "No Data found";
		}
	}

	public List<String> listPersonBycity(String name) {

		List<String> persons = new ArrayList<String>();

		Set<Integer> keys = EmpDB.db.keySet();

		for (Integer key : keys) {
			Emp p = EmpDB.db.get(key);
			if (p.getName().equals(name))
				persons.add(p.getDetails());
		}

		return persons;
	
	}



	public static void main(String[] args) {

		String name = "Raja";

		EmpApp app = new EmpApp();

		System.out.println(app.findEmp(103));

		for (String p : app.listPersonBycity("name")) {
			System.out.println(p);
		}
	}
}
		
	



