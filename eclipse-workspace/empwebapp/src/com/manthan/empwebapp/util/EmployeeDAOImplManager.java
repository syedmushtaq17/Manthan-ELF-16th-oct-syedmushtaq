package com.manthan.empwebapp.util;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOimpl;

public class EmployeeDAOImplManager {

	private EmployeeDAOImplManager() {
		//constructor can be private we are not allowing anybody to make obj of it.
	}
	public static EmployeeDAO getDaoInstance() {
		return new EmployeeDAOimpl();
	}
	
	
	
}
