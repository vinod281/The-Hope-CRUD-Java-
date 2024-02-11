package the_hope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class DeleteStudent 
{
    String S_ID;
    
    public DeleteStudent(String S_ID)
    {
        this.S_ID=S_ID;
    }
    
    public void delete()
    {
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";
        String sql="DELETE FROM HopeStu WHERE s_ID=?";
        
        if(S_ID==null || S_ID.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter student Id!");
        }
        else
        {
        
            try
            {
                con=DriverManager.getConnection(url,name,pass);
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1, S_ID);
                pst.execute();

                JOptionPane.showMessageDialog(null,"Deleted.");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Delete failed!");
            }
        }
    }
}
