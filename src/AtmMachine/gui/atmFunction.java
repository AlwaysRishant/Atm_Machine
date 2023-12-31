/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMachine.gui;

import AtmMachine.dao.UserDAO;
import AtmMachine.dbutil.dbConnection;
import AtmMachine.pojo.CurrentUser;
import AtmMachine.pojo.miniStatementPojo;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class atmFunction extends javax.swing.JFrame {

    /**
     * Creates new form atmFunction3
     */
    private List<miniStatementPojo> detailTransact;
    private Date today;
    private SimpleDateFormat sdf, sdf1;

    public atmFunction() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelchangepin.setVisible(false);
        lblalertpin.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelchangepin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtpin = new javax.swing.JTextField();
        btnwithdrawn = new javax.swing.JButton();
        btnchangepin = new javax.swing.JButton();
        btndeposit = new javax.swing.JButton();
        btnministatement = new javax.swing.JButton();
        btncheckbalance = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        lblalertpin = new javax.swing.JLabel();

        jButton6.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SATI BANK");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("MINI STATEMENT");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("WITHDRAW");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CHANGE PIN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DEPOSIT");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("DELETE ACCOUNT");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("CHECK BALANCE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        panelchangepin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Enter PIN");

        txtpin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpinKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelchangepinLayout = new javax.swing.GroupLayout(panelchangepin);
        panelchangepin.setLayout(panelchangepinLayout);
        panelchangepinLayout.setHorizontalGroup(
            panelchangepinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelchangepinLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelchangepinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(44, 44, 44))
        );
        panelchangepinLayout.setVerticalGroup(
            panelchangepinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelchangepinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        btnwithdrawn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwithdrawnActionPerformed(evt);
            }
        });

        btnchangepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangepinActionPerformed(evt);
            }
        });

        btndeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndepositActionPerformed(evt);
            }
        });

        btnministatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnministatementActionPerformed(evt);
            }
        });

        btncheckbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckbalanceActionPerformed(evt);
            }
        });

        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout.setText("LOG OUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblalertpin.setBackground(new java.awt.Color(204, 0, 0));
        lblalertpin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblalertpin.setForeground(new java.awt.Color(204, 51, 0));
        lblalertpin.setText("pin can be of 6 digit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(panelchangepin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblalertpin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnministatement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btncheckbalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnwithdrawn, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(btnchangepin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btndeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(95, 95, 95)
                                .addComponent(btnlogout)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnwithdrawn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnchangepin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btndeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnministatement, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btncheckbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelchangepin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblalertpin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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
    }// </editor-fold>//GEN-END:initComponents

    private void txtpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpinKeyPressed
        lblalertpin.setVisible(false);
        String pin = txtpin.getText().trim();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (pin.length() < 6 || pin.length() > 6) {
                lblalertpin.setVisible(true);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (UserDAO.checkPin(pin)) 
                {
                     if (pin.length() == 6) 
                    {
                        lblalertpin.setVisible(false);

                        if (UserDAO.ChangePin(pin, CurrentUser.getPin())) {
                            JOptionPane.showMessageDialog(null, "PIN change succesfully", "SUCCES", JOptionPane.INFORMATION_MESSAGE);
                            CurrentUser.setPin(pin);
                            panelchangepin.setVisible(false);
                            new Home().setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "PIN can't Change Due to some cause", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                             new Home().setVisible(true);
                             this.dispose();
                        }
                    } 
                }
                else {
                        JOptionPane.showMessageDialog(null, "PLZZ ENTER UNIQUE PIN", "PIN ALREADY USED!!", JOptionPane.INFORMATION_MESSAGE);
                        txtpin.setText("");
                     }
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Unable to change pin in database", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_txtpinKeyPressed

    private void btnwithdrawnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwithdrawnActionPerformed
        new withDrawn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnwithdrawnActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new atmMachine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnchangepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangepinActionPerformed
        panelchangepin.setVisible(true);
    }//GEN-LAST:event_btnchangepinActionPerformed
    private boolean isNumber(String input) {
        boolean result = false;
        for (int i = 0; i < input.length(); i++) {
            result = Character.isDigit(input.charAt(i));
            if (result == false) {
                return false;
            }
        }
        return true;
    }
    private void btndepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndepositActionPerformed
        String money = JOptionPane.showInputDialog(null, "How much Do you want to Deposit", "DEPOSIT!!", JOptionPane.INFORMATION_MESSAGE);
        if (money == null) {
            money = "";
            new atmFunction().setVisible(true);
            this.dispose();
            return;
        }
        if (money.isEmpty() == false) {
            try {
                if (isNumber(money)) {
                    double oldmoney = UserDAO.MoneyCheck(CurrentUser.getPin());
                    double newmoney = oldmoney + Integer.parseInt(money);
                    if (UserDAO.moneyDeposit(String.valueOf(newmoney), CurrentUser.getPin())) {
                        JOptionPane.showMessageDialog(null, "Your Money Deposit Succesfully", "DEPOSIT SUCCESFULLY!!", JOptionPane.INFORMATION_MESSAGE);
                        today = new Date();
                        sdf = new SimpleDateFormat("dd-MMM-YYYY");
                        sdf1 = new SimpleDateFormat("H:mm:s");
                        String date = sdf.format(today);
                        String time = sdf1.format(today);
                        miniStatementPojo ms = new miniStatementPojo();
                        ms.setDate_transact(date);
                        ms.setTime_transact(time);
                        ms.setMoneyDeducted(0);
                        ms.setSifcCode(CurrentUser.getSifc());
                        ms.setMoneyDeposit((Double.parseDouble(money)));
                        UserDAO.setTimeDateDeposit(ms);
                        new Home().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Problem in depositing the money", "DEPOSIT UNSUCCESFULLY!!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Input should be Numeric", "INPUT NUMERIC", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Problem in depositing the money in the databse", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter the Money First", "EMPTY INPUT", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btndepositActionPerformed

    private void btnministatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnministatementActionPerformed
        new miniStatement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnministatementActionPerformed

    private void btncheckbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckbalanceActionPerformed
        try {
            double money = UserDAO.MoneyCheck(CurrentUser.getPin());
            JOptionPane.showMessageDialog(null, "Your Balance is " + money, "SUCCES", JOptionPane.INFORMATION_MESSAGE);
            new Home().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problem in retrieving the money in the databse", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btncheckbalanceActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "do you want to delete account", "Delete Account", JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try {
                boolean result3, result2, result1 = UserDAO.deleteAccountfromMini(CurrentUser.getSifc());
                result2 = UserDAO.deleteAccountfromAcc(CurrentUser.getSifc());
                if ((result1 && result2) || (result1) || (result2)) {
                    JOptionPane.showMessageDialog(null, "Account Deleted Succesfully", "SUCCESFULL", JOptionPane.INFORMATION_MESSAGE);
                    UserDAO.delAlllimit(CurrentUser.getSifc());
                    new Home().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "No record Found to Delete", "UNSUCCESFULL", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Problem in deleting the account in the database", "ERROR!!", JOptionPane.ERROR_MESSAGE);
            }
        } else if (result == JOptionPane.CANCEL_OPTION) {
            return;
        } else {
            new Home().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(atmFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atmFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atmFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atmFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atmFunction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnchangepin;
    private javax.swing.JButton btncheckbalance;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndeposit;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnministatement;
    private javax.swing.JButton btnwithdrawn;
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
    private javax.swing.JLabel lblalertpin;
    private javax.swing.JPanel panelchangepin;
    private javax.swing.JTextField txtpin;
    // End of variables declaration//GEN-END:variables
}
