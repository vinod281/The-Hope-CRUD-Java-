package the_hope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class UpdateStudent 
{
    public String S_ID;
    public String Address,Tel,Class;
    
    public UpdateStudent(String S_ID,String Address,String Tel,String Class)
    {
        this.S_ID=S_ID;
        this.Address=Address;
        this.Tel=Tel;
        this.Class=Class;
    }
    
    public void Update()
    {
        Connection con;
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";
        String sql="UPDATE HopeStu SET s_address=?,s_tel=?,s_class=? WHERE s_ID=?";
        
        try
        {
            if(S_ID==null || S_ID.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter student Id!");
            }
            
            else
            {
                con=DriverManager.getConnection(url,name,pass);
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1, Address);
                pst.setString(2, Tel);
                pst.setString(3, Class);
                pst.setString(4, S_ID);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Detaiils updated.");
            
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            
            JOptionPane.showMessageDialog(null, "Detaiils update failed!");
        }
    }
    
}
