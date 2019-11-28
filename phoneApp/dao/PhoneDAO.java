package com.ustglobal.phoneApp.dao;

import java.util.List;

import com.ustglobal.phoneApp.dto.PhoneBean;

public interface PhoneDAO {
	
	public List<PhoneBean> getAllContact();
	public PhoneBean searchContact(String name);
	public int addContact(PhoneBean addInfo);
	public int deleteContact(String name);
	public int editContact(PhoneBean editInfo ,String name);

}
