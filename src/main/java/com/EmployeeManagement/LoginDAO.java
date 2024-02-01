package com.EmployeeManagement;
import java.sql.*;
public class LoginDAO {
	public AdminData ad=null;
	public AdminData login(String uName,String pWord) {
	try
	{
		Connection con =DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("Select * from AdminTab57 where uname=? and pword=?");
		ps.setString(1, uName);
		ps.setString(2, pWord);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			ad=new AdminData();
			ad.setuName(rs.getString(1));
			ad.setpWord(rs.getString(2));
			ad.setfName(rs.getString(3));
			ad.setlName(rs.getString(4));
			ad.setAddr(rs.getString(5));
			ad.setmId(rs.getString(6));
			ad.setPhNo(rs.getLong(7));
		}
		
	}
	catch(Exception e) {e.printStackTrace();}
	return ad;
	
	}

}
