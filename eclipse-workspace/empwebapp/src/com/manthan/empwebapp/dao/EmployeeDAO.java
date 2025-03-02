package com.manthan.empwebapp.dao;

import java.sql.ResultSet;

import com.manthan.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {

	 public EmployeeInfoBean searchEmployee(int empId);
	 public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	 public  EmployeeInfoBean authenticate(int empId,String password);
	 public boolean deleteEmp(int empId);
	 public boolean updateEmp(int empId,String desg);
	 public ResultSet seeAllEmployee();
}
