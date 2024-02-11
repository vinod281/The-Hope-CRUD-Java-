
package the_hope;

import javax.swing.JOptionPane;


public class Hope_Menu extends javax.swing.JFrame {


    public Hope_Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        clear = new javax.swing.JMenuItem();
        close = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSID = new javax.swing.JTextField();
        txtBdate = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        txtParent = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jan = new javax.swing.JCheckBox();
        mar = new javax.swing.JCheckBox();
        feb = new javax.swing.JCheckBox();
        apr = new javax.swing.JCheckBox();
        may = new javax.swing.JCheckBox();
        jun = new javax.swing.JCheckBox();
        jul = new javax.swing.JCheckBox();
        aug = new javax.swing.JCheckBox();
        sep = new javax.swing.JCheckBox();
        oct = new javax.swing.JCheckBox();
        nov = new javax.swing.JCheckBox();
        dec = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();

        clear.setText("Clear details");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPopupMenu1.add(clear);

        close.setText("Close window");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPopupMenu1.add(close);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Hope - Students");

        jPanel1.setComponentPopupMenu(jPopupMenu1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setComponentPopupMenu(jPopupMenu1);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel2.setText("Student ID              :");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel3.setText("Birth Date               :");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel4.setText("Student Name       :");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel5.setText("Address                  :");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel6.setText("Telephone              :");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel7.setText("Guardian's Name  :");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel8.setText("Class                       :");

        txtSID.setForeground(new java.awt.Color(255, 0, 51));
        txtSID.setText("Don't use when adding students.");
        txtSID.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtSIDInputMethodTextChanged(evt);
            }
        });
        txtSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSIDActionPerformed(evt);
            }
        });
        txtSID.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtSIDPropertyChange(evt);
            }
        });
        txtSID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSIDKeyTyped(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(" ADD ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("All Students");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText(" Find  ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtBdate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtParent, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(44, 44, 44)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("The Hope English Academy");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jan.setText("January");

        mar.setText("March");

        feb.setText("February");

        apr.setText("April");

        may.setText("May");
        may.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayActionPerformed(evt);
            }
        });

        jun.setText("June");

        jul.setText("July");

        aug.setText("August");
        aug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                augActionPerformed(evt);
            }
        });

        sep.setText("September");
        sep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepActionPerformed(evt);
            }
        });

        oct.setText("Octomber");
        oct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octActionPerformed(evt);
            }
        });

        nov.setText("November");
        nov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novActionPerformed(evt);
            }
        });

        dec.setText("December");
        dec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decActionPerformed(evt);
            }
        });

        jButton5.setText("Payments");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dec)
                    .addComponent(nov)
                    .addComponent(oct)
                    .addComponent(sep)
                    .addComponent(aug)
                    .addComponent(jul)
                    .addComponent(jun)
                    .addComponent(may)
                    .addComponent(feb)
                    .addComponent(mar)
                    .addComponent(apr)
                    .addComponent(jan))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(feb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(may)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nov)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dec)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jan.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id=txtSID.getText();
        String name=txtName.getText();
        String b_day=txtBdate.getText();
        String address=txtAddress.getText();
        String tel=txtTel.getText();
        String Class=txtClass.getText();
        String parent=txtParent.getText();
        
        
        AddStudent ads1=new AddStudent(id,name,b_day,address,tel,Class,parent);
        ads1.add();
        
        txtSID.setText(ads1.GID);
        txtName.setText(ads1.Name);
        txtBdate.setText(ads1.BDate);
        txtAddress.setText(ads1.Address);
        txtTel.setText(ads1.Tel);
        txtClass.setText(ads1.Class);
        txtParent.setText(ads1.GName);
        
        payments pay=new payments();
        
        if(jan.isSelected())
        {
            pay.jan=true;
        }
        if(feb.isSelected())
        {
            pay.feb=true;
        }
        if(mar.isSelected())
        {
            pay.mar=true;
        }
        if(apr.isSelected())
        {
            pay.apr=true;
        }
        if(may.isSelected())
        {
            pay.may=true;
        }
        if(jun.isSelected())
        {
            pay.jun=true;
        }
        if(jul.isSelected())
        {
            pay.jul=true;
        }
        if(aug.isSelected())
        {
            pay.aug=true;
        }
        if(sep.isSelected())
        {
            pay.sep=true;
        }
        if(oct.isSelected())
        {
            pay.oct=true;
        }
        if(nov.isSelected())
        {
            pay.nov=true;
        }
        if(dec.isSelected())
        {
            pay.dec=true;
        }
        
        
        pay.addPayments(txtSID.getText(),txtName.getText());
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSIDActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        FindStudent fs1=new FindStudent(txtSID.getText());
        fs1.find();
        txtName.setText(fs1.Name);
        txtBdate.setText(fs1.BDate);
        txtAddress.setText(fs1.Address);
        txtTel.setText(fs1.Tel);
        txtClass.setText(fs1.Class);
        txtParent.setText(fs1.GName);
        
        payments pay=new payments();
        
        
        
        pay.findPayments(txtSID.getText());
        
        if(pay.jan)
        {
            jan.setSelected(true);
        }
        else
        {
            jan.setSelected(false);
        }
        if(pay.feb)
        {
            feb.setSelected(true);
        }
        else
        {
            feb.setSelected(false);
        }
        if(pay.mar)
        {
            mar.setSelected(true);
        }
        else
        {
            mar.setSelected(false);
        }
        if(pay.apr)
        {
            apr.setSelected(true);
        }
        else
        {
            apr.setSelected(false);
        }
        if(pay.may)
        {
            may.setSelected(true);
        }
        else
        {
            may.setSelected(false);
        }
        if(pay.jun)
        {
            jun.setSelected(true);
        }
        else
        {
            jun.setSelected(false);
        }
        if(pay.jul)
        {
            jul.setSelected(true);
        }
        else
        {
            jul.setSelected(false);
        }
        if(pay.aug)
        {
            aug.setSelected(true);
        }
        else
        {
            aug.setSelected(false);
        }
        if(pay.sep)
        {
            sep.setSelected(true);
        }
        else
        {
            sep.setSelected(false);
        }
        if(pay.oct)
        {
            oct.setSelected(true);
        }
        else
        {
            oct.setSelected(false);
        }
        if(pay.nov)
        {
            nov.setSelected(true);
        }
        else
        {
            nov.setSelected(false);
        }
        if(pay.dec)
        {
            dec.setSelected(true);
        }
        else
        {
            dec.setSelected(false);
        }
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UpdateStudent us1=new UpdateStudent(txtSID.getText(),txtAddress.getText(),txtTel.getText(),txtClass.getText());
        us1.Update();
        
        payments pay=new payments();
        
        if(jan.isSelected())
        {
            pay.jan=true;
        }
        if(feb.isSelected())
        {
            pay.feb=true;
        }
        if(mar.isSelected())
        {
            pay.mar=true;
        }
        if(apr.isSelected())
        {
            pay.apr=true;
        }
        if(may.isSelected())
        {
            pay.may=true;
        }
        if(jun.isSelected())
        {
            pay.jun=true;
        }
        if(jul.isSelected())
        {
            pay.jul=true;
        }
        if(aug.isSelected())
        {
            pay.aug=true;
        }
        if(sep.isSelected())
        {
            pay.sep=true;
        }
        if(oct.isSelected())
        {
            pay.oct=true;
        }
        if(nov.isSelected())
        {
            pay.nov=true;
        }
        if(dec.isSelected())
        {
            pay.dec=true;
        }
        
        pay.updatePayments(txtSID.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        payments pay=new payments();
        pay.deletePayments(txtSID.getText());
        
        DeleteStudent ds1=new DeleteStudent(txtSID.getText());
        ds1.delete();
        
        txtSID.setText("");
        txtName.setText("");
        txtBdate.setText("");
        txtAddress.setText("");
        txtTel.setText("");
        txtClass.setText("");
        txtParent.setText("");
        
        jan.setSelected(false);
        feb.setSelected(false);
        mar.setSelected(false);
        apr.setSelected(false);
        may.setSelected(false);
        jun.setSelected(false);
        jul.setSelected(false);
        aug.setSelected(false);
        sep.setSelected(false);
        oct.setSelected(false);
        nov.setSelected(false);
        dec.setSelected(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        txtSID.setText("");
        txtName.setText("");
        txtBdate.setText("");
        txtAddress.setText("");
        txtTel.setText("");
        txtClass.setText("");
        txtParent.setText("");
        
        jan.setSelected(false);
        feb.setSelected(false);
        mar.setSelected(false);
        apr.setSelected(false);
        may.setSelected(false);
        jun.setSelected(false);
        jul.setSelected(false);
        aug.setSelected(false);
        sep.setSelected(false);
        oct.setSelected(false);
        nov.setSelected(false);
        dec.setSelected(false);
        
        
    }//GEN-LAST:event_clearActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        AllStudents as1=new AllStudents();
        as1.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void augActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_augActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_augActionPerformed

    private void sepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sepActionPerformed

    private void octActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_octActionPerformed

    private void novActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novActionPerformed

    private void decActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decActionPerformed

    private void mayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mayActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        CheckPayments chp=new CheckPayments();
        
        chp.show();
       // this.disable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtSIDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtSIDInputMethodTextChanged
        // TODO add your handling code h
    }//GEN-LAST:event_txtSIDInputMethodTextChanged

    private void txtSIDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtSIDPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSIDPropertyChange

    private void txtSIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSIDKeyTyped
        // TODO add your handling code here:
        txtName.setText("");
        txtBdate.setText("");
        txtAddress.setText("");
        txtTel.setText("");
        txtClass.setText("");
        txtParent.setText("");
        
        jan.setSelected(false);
        feb.setSelected(false);
        mar.setSelected(false);
        apr.setSelected(false);
        may.setSelected(false);
        jun.setSelected(false);
        jul.setSelected(false);
        aug.setSelected(false);
        sep.setSelected(false);
        oct.setSelected(false);
        nov.setSelected(false);
        dec.setSelected(false);
    }//GEN-LAST:event_txtSIDKeyTyped

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
            java.util.logging.Logger.getLogger(Hope_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hope_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hope_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hope_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hope_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox apr;
    private javax.swing.JCheckBox aug;
    private javax.swing.JMenuItem clear;
    private javax.swing.JMenuItem close;
    private javax.swing.JCheckBox dec;
    private javax.swing.JCheckBox feb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    public javax.swing.JCheckBox jan;
    private javax.swing.JCheckBox jul;
    private javax.swing.JCheckBox jun;
    private javax.swing.JCheckBox mar;
    private javax.swing.JCheckBox may;
    private javax.swing.JCheckBox nov;
    private javax.swing.JCheckBox oct;
    private javax.swing.JCheckBox sep;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBdate;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtParent;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
