package com.ustglobal.phoneApp.util;

import com.ustglobal.phoneApp.dao.PhoneDAO;
import com.ustglobal.phoneApp.dao.PhoneDAOImpl;

public class PhoneManagerFactory {
	
private PhoneManagerFactory() {}
	
	public static PhoneDAO getPhoneDAO() {
		
		return new PhoneDAOImpl();
		
	}


}
