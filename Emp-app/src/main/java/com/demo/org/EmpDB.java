package com.demo.org;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;



public class EmpDB {

		static HashMap<Integer, Emp> db;

		static {

		db=new HashMap<Integer, Emp>();

		db.put(100, new Emp(100, "Shantanu", "Hyderabad", 45000));

		db.put(101, new Emp(101, "Pavan", "Hyderabad", 45000));

		db.put(102, new Emp(102, "Arun", "Chennai", 45000));

		db.put(103, new Emp(103, "Raja", "Chennai", 45000));

		db.put(104, new Emp(104, "Ranga", "Bangalore", 45000));

		db.put(105, new Emp(105, "Pretham", "Bangalore", 45000));

		db.put(106, new Emp(106, "Chandra", "Pune", 45000));

		db.put(107, new Emp(107, "Vamshi", "Pune", 45000));

		}

		public static HashMap<Integer, Emp> getDb() {
			return db;
		}

		public static void setDb(HashMap<Integer, Emp> db) {
			EmpDB.db = db;
		}

}
