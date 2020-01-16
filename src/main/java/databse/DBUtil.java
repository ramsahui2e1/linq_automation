package databse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
  public static int getOtp(Connection con ,String mobile) {
	  int otp=0;
  	try {
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery("select top 1 otp from t_swapp_device where mobile='0000000382' order by otp_issued_time desc ");
			while (rs.next()) {
				  otp = rs.getInt("otp");
				  System.out.println(otp + "\n");
				}
  	} catch (SQLException e) {
			// TODO Auto-generated catch block
  		   
			e.printStackTrace();
		}
  	return otp;
  }
}
