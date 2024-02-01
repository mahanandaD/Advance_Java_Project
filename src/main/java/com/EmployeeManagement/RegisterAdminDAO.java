package com.EmployeeManagement;

import java.sql.*;

public class RegisterAdminDAO {
	public int k=0;
	public int register(AdminData ad)
	{
		try {
			
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into AdminTab57 values(?,?,?,?,?,?,?)");
			ps.setString(1,ad.getuName());
			ps.setString(2,ad.getpWord());
			ps.setString(3,ad.getfName());
			ps.setString(4,ad.getlName());
			ps.setString(5,ad.getAddr());
			ps.setString(6,ad.getmId());
			ps.setLong(7, ad.getPhNo());
			k=ps.executeUpdate();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}

}
