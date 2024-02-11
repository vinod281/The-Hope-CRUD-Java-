package the_hope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class FindStudent 
{
    String S_ID;
    
    public String Id,Name,BDate,Address,Tel,Class,GName;
    
    public FindStudent(String S_ID)
    {
        this.S_ID=S_ID;
    }
    
    public void find()
    {
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";
        String sql="SELECT s_ID,s_name,s_date,s_address,s_tel,s_class,g_name FROM HopeStu WHERE s_ID=?";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,S_ID);
            ResultSet result=pst.executeQuery();
            
            if(result.next())
            {
                Id=result.getString("s_ID");
                Name=result.getString("s_name");
                BDate=result.getString("s_date");
                Address=result.getString("s_address");
                Tel=result.getString("s_tel");
                Class=result.getString("s_class");
                GName=result.getString("g_name");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Could not find student details!");
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
