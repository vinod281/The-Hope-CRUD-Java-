
package the_hope;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class AddStudent 
{
    public String Id,Name,BDate,Address,Tel,Class,GName,GID;
    
    public AddStudent(String Id,String Name,String BDate,String Address,String Tel,String Class,String GName)
    {
        this.Id=Id;
        this.Name=Name;
        this.Address=Address;
        this.BDate=BDate;
        this.Tel=Tel;
        this.Class=Class;
        this.GName=GName;
        
    }
    
    public void add()
    {
        Connection con;
    
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";
        String sql="INSERT INTO HopeStu (s_name,s_date,s_address,s_tel,s_class,g_name)VALUES(?,?,?,?,?,?)";
        String sql1="SELECT * FROM HopeStu WHERE s_ID=?";
        String sql3="SELECT s_ID FROM `HopeStu` ORDER BY s_ID DESC LIMIT 1";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            //pst.setString(1, Id);
            pst.setString(1, Name);
            pst.setString(2, BDate);
            pst.setString(3, Address);
            pst.setString(4, Tel);
            pst.setString(5, Class);
            pst.setString(6, GName);
            
            PreparedStatement pst1=con.prepareStatement(sql1);
            pst1.setString(1,Id);
            ResultSet result=pst1.executeQuery();
            
            if(result.next())
            {
                JOptionPane.showMessageDialog(null, "Enter a valid Student ID!");
            }
            else
            {
            if(Name==null || Address==null || BDate==null || Tel==null || Class==null || GName==null  
            || Name.equals("") || BDate.equals("") || Address.equals("") || Tel.equals("") || Class.equals("")
            || GName.equals(""))
                
            {
                JOptionPane.showMessageDialog(null, "Please fill all the details!");
                
            }
            
            else
            {
            pst.execute();
            
            //JOptionPane.showMessageDialog(null, "Adding success.");
            PreparedStatement pst3=con.prepareStatement(sql3);
                ResultSet result1=pst3.executeQuery();
                if(result1.next())
                {
                    GID=result1.getString("s_ID");
                    JOptionPane.showMessageDialog(null,"Adding success,Your student ID is :"+GID);
                }
            }
           }
        }
        catch(Exception e)
        {
            System.out.println("Error sql "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Adding failed.");
        }
        
    }
}
