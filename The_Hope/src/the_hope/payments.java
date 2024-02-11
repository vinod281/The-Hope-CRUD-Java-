package the_hope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class payments
{
     public boolean jan=false,feb=false,mar=false,apr=false,may=false,jun=false,jul=false,aug=false,sep=false,oct=false,nov=false,dec=false;
     
     public void findPayments(String s_ID)
     {
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";
        String sql="SELECT s_ID,jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,`dec` FROM payments WHERE s_ID=?";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, s_ID);
            ResultSet result=pst.executeQuery();
            
            if(result.next())
            {
                jan=result.getBoolean("jan");
                feb=result.getBoolean("feb");
                mar=result.getBoolean("mar");
                apr=result.getBoolean("apr");
                may=result.getBoolean("may");
                jun=result.getBoolean("jun");
                jul=result.getBoolean("jul");
                aug=result.getBoolean("aug");
                sep=result.getBoolean("sep");
                oct=result.getBoolean("oct");
                nov=result.getBoolean("nov");
                dec=result.getBoolean("dec");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Could nod find payment details!");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Find : "+e.getMessage());
        }
     }
     
     
     
     public void addPayments(String s_ID,String s_name)
     {
         
         
         Connection con;
         
         String url="jdbc:mysql://localhost:3306/Hope";
         String name="root";
         String pass="";
         String sql="INSERT INTO payments (s_ID, jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, `dec`,s_name) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         
         try
         {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, s_ID);
            pst.setInt(2, jan ? 1 : 0); // Convert boolean to integer (0 or 1)
            pst.setInt(3, feb ? 1 : 0);
            pst.setInt(4, mar ? 1 : 0);
            pst.setInt(5, apr ? 1 : 0);
            pst.setInt(6, may ? 1 : 0);
            pst.setInt(7, jun ? 1 : 0);
            pst.setInt(8, jul ? 1 : 0);
            pst.setInt(9, aug ? 1 : 0);
            pst.setInt(10, sep ? 1 : 0);
            pst.setInt(11, oct ? 1 : 0);
            pst.setInt(12, nov ? 1 : 0);
            pst.setInt(13, dec ? 1 : 0);
            pst.setString(14,s_name);
            pst.execute();
             
         }
         catch(Exception e)
         {
             System.out.println("Add payments error :"+e.getMessage());
         }
     }
     
     
     public void updatePayments(String s_ID)
     {
         
         
         Connection con;
         
         String url="jdbc:mysql://localhost:3306/Hope";
         String name="root";
         String pass="";
         String sql = "UPDATE payments SET jan=?, feb=?, mar=?, apr=?, may=?, jun=?, jul=?, aug=?, sep=?, oct=?, nov=?, `dec`=? WHERE s_ID=?";

         
         try
         {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setInt(1, jan ? 1 : 0); // Convert boolean to integer (0 or 1)
            pst.setInt(2, feb ? 1 : 0);
            pst.setInt(3, mar ? 1 : 0);
            pst.setInt(4, apr ? 1 : 0);
            pst.setInt(5, may ? 1 : 0);
            pst.setInt(6, jun ? 1 : 0);
            pst.setInt(7, jul ? 1 : 0);
            pst.setInt(8, aug ? 1 : 0);
            pst.setInt(9, sep ? 1 : 0);
            pst.setInt(10, oct ? 1 : 0);
            pst.setInt(11, nov ? 1 : 0);
            pst.setInt(12, dec ? 1 : 0);
            
            pst.setString(13, s_ID);
            pst.execute();
             
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
     }
     
     public void deletePayments(String s_ID)
    {
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";
        String sql="DELETE FROM payments WHERE s_ID=?";
        
        
        
            try
            {
                con=DriverManager.getConnection(url,name,pass);
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1, s_ID);
                pst.execute();

                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                
            }
        }
    
    
}
