package com.EmployeeManagement;
import java.sql.*;
public class AddEmployeeDAO {
  public int k=0;
  public int add(EmployeeBean eb)
  {
	  try {
		  Connection con=DBConnection.getCon();
		  PreparedStatement ps=con.prepareStatement("insert into Employee57 values(?,?,?,?,?,?,?)");
		  ps.setString(1, eb.getEid());
		  ps.setString(2, eb.getEname());
		  ps.setString(3, eb.getEdesg());
		  ps.setLong(4, eb.getBsal());
		  ps.setLong(5, eb.getHra());
		  ps.setLong(6, eb.getDa());
		  ps.setLong(6, eb.getTatsal());
	  }
	  catch(Exception e)
	  {e.printStackTrace();}
	  return k;
	  
  }
	
}
