/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package the_hope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinodrahal
 */
public class CheckPayments extends javax.swing.JFrame {

    /**
     * Creates new form CheckPayments
     */
    public CheckPayments() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        selectMonth = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        nonPay = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Non Paid List");
        setPreferredSize(new java.awt.Dimension(324, 580));

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 580));

        jLabel1.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 15)); // NOI18N
        jLabel1.setText("Select Month :");

        selectMonth.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 15)); // NOI18N
        selectMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November", "December" }));
        selectMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectMonthItemStateChanged(evt);
            }
        });
        selectMonth.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                selectMonthPropertyChange(evt);
            }
        });

        nonPay.setForeground(new java.awt.Color(255, 0, 0));
        nonPay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student ID", "Student Name"
            }
        ));
        nonPay.setPreferredSize(new java.awt.Dimension(300, 440));
        nonPay.setSize(new java.awt.Dimension(284, 70));
        jScrollPane1.setViewportView(nonPay);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(selectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectMonthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selectMonthPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_selectMonthPropertyChange

    private void selectMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectMonthItemStateChanged
        // TODO add your handling code here:
        
        if(selectMonth.getSelectedIndex()==1)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE jan=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //feb
        
        if(selectMonth.getSelectedIndex()==2)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE feb=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //mar
        
        if(selectMonth.getSelectedIndex()==3)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE mar=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //apr
        
        if(selectMonth.getSelectedIndex()==4)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE apr=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //may
        
        if(selectMonth.getSelectedIndex()==5)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE may=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //jun
        
        if(selectMonth.getSelectedIndex()==6)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE jun=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //jul
        
        if(selectMonth.getSelectedIndex()==7)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE jul=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //aug
        
        if(selectMonth.getSelectedIndex()==8)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE aug=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //sep
        
        if(selectMonth.getSelectedIndex()==9)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE sep=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //oct
        
        if(selectMonth.getSelectedIndex()==10)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE oct=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //nov
        
        if(selectMonth.getSelectedIndex()==11)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE nov=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        
        //dec
        
        if(selectMonth.getSelectedIndex()==12)
        {
        
        
        Connection con;
        
        String url="jdbc:mysql://localhost:3306/Hope";
        String name="root";
        String pass="";

        String sql="SELECT s_ID,s_name FROM payments WHERE `dec`=0";
        
        try
        {
            con=DriverManager.getConnection(url,name,pass);
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet result=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)nonPay.getModel();
            model.setRowCount(0);
            
            while(result.next())
            {
                model.addRow(new String[]{result.getString(1),result.getString(2)});
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
    }//GEN-LAST:event_selectMonthItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckPayments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable nonPay;
    private javax.swing.JComboBox<String> selectMonth;
    // End of variables declaration//GEN-END:variables
}
