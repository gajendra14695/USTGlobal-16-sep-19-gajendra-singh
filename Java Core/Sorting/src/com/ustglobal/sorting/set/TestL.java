package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestL {

		
		public static void main(String[] args) {
			
			SortById si = new SortById();
			SortByCustName sn= new SortByCustName();
			SortByCustSalary ss= new SortByCustSalary();
			TreeSet<Customer> ts = new TreeSet<Customer>(ss);

			ts.add(new Customer(1,"gajendra",678908));
			ts.add(new Customer(9,"Sumit",56568908));
			ts.add(new Customer(6, "Ranjeet",90678908));
			ts.add(new Customer(4,"Amrit",3478908));
			//ts.add(new CustomerBank("CANARA",56004,3478908));

			System.out.println("======================================");

			Iterator<Customer> it = ts.iterator();
			while(it.hasNext()) {
				Customer e = it.next();
				System.out.println("ID is "+e.id);
				System.out.println("name is "+e.name);
				System.out.println("Salary is "+e.salary);
				System.out.println("=============================================");

			}
		}
}
