package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentInfodao {

	Connection con=Cont.connect();
	boolean insert(StudentInfo e) {
		String sql="insert into StudentInfo(Firstname,Lastname,city,Contactno,percentageoflastyear,Stream,Age,Emailid)values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);	
			ps.setString(1,e.getFirstname());
			ps.setString(2,e.getLastname());
			ps.setString(3, e.getCity());
			
			ps.setString(4, e.getContactno());
			ps.setDouble(5, e.getPercentageoflastyear());
			ps.setString(6, e.getStream());
			ps.setInt(7, e.getAge());
			ps.setString(8, e.getEmailid());
			int result=ps.executeUpdate();
			if(result>0) {
				return true;
			}
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}
	
	boolean update(StudentInfo e) {
		String sql="update StudentInfo set Firstname=?, Lastname=?, city=?, Contactno=?, percentageoflastyear=?, Stream=?,Age=?, Emailid=? where Srno=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);	
		    ps.setInt(9,e.getSrno());
			ps.setString(1,e.getFirstname());
			ps.setString(2,e.getLastname());
			ps.setString(3, e.getCity());
			ps.setString(4, e.getContactno());
			ps.setDouble(5, e.getPercentageoflastyear());
			ps.setString(6, e.getStream());
            ps.setInt(7, e.getAge());
            ps.setString(8, e.getEmailid());

            int result=ps.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
            
            
            
			
	}
	

	boolean delete( StudentInfo e) {
		String sql="delete from StudentInfo where Srno=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);	
		    ps.setInt(1,e.getSrno());
			int result=ps.executeUpdate();
			if(result>0) {
				return true;
			}
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	 List<StudentInfo> select(){
		   String sql="select * from StudentInfo";
		   List<StudentInfo> data=new ArrayList<>(); 
		   try {
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 StudentInfo em=new StudentInfo();
				 em.setSrno(rs.getInt("Srno"));
				 em.setFirstname(rs.getString("Firstname"));
				 em.setLastname(rs.getString("Lastname"));
				 em.setCity(rs.getString("city"));
				 em.setContactno(rs.getString("ContactNO"));
				 em.setPercentageoflastyear(rs.getDouble("percentageoflastyear"));
				 em.setStream(rs.getString("Stream"));
				 em.setAge(rs.getInt("Age"));
				 em.setEmailid(rs.getString("EmailId"));
				 data.add(em);
			 }
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 return data;  
	   }
	
	
	
}
