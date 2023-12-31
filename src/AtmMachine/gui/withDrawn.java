/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMachine.gui;

import AtmMachine.pojo.miniStatementPojo;
import AtmMachine.dao.UserDAO;
import AtmMachine.dbutil.dbConnection;
import AtmMachine.pojo.CurrentUser;
import java.util.List;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class withDrawn extends javax.swing.JFrame {

    /**
     * Creates new form withdrawn
     */
    private miniStatementPojo ms1;
    private long ms3, ms4,ms5,ms6;
    private int count = 3;
    private int counter;
    private Date today;
    private SimpleDateFormat sdf, sdf1;

    public withDrawn() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmoney = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        lblsati = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnenter = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter Money");

        txtmoney.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
                .addComponent(txtmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        btnback.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblsati.setBackground(new java.awt.Color(0, 102, 102));
        lblsati.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsati.setForeground(new java.awt.Color(255, 255, 255));
        lblsati.setText("SATI ATM");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("WITHDRAW MONEY SECTION");

        btnenter.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnenter.setText("Enter");
        btnenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnlogout.setText("LOG OUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(btnenter, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(lblsati, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnlogout))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsati, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnenter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new atmFunction().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed
    private miniStatementPojo setTimeWithdraw() {
        today = new Date();
        sdf = new SimpleDateFormat("dd-MMM-YYYY");
        sdf1 = new SimpleDateFormat("H:mm:s");
        String date = sdf.format(today);
        String time = sdf1.format(today);
        miniStatementPojo ms = new miniStatementPojo();
        ms.setDate_transact(date);
        ms.setTime_transact(time);
        ms.setMoneyDeducted(Double.parseDouble(txtmoney.getText()));
        ms.setSifcCode(CurrentUser.getSifc());
        ms.setMoneyDeposit(0);
        return ms;
    }
    private void btnenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenterActionPerformed
        if (txtmoney.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a money to withdraw", "Enter Money", JOptionPane.WARNING_MESSAGE);
            return;
        }
         

        double amt = Double.parseDouble(txtmoney.getText());
        try {
            ms5 = UserDAO.getMilisecondsFirst(CurrentUser.getSifc());
            ms6= new Date().getTime() - ms5;
                 if(ms5!=0 && ms6>86400000){
                UserDAO.delAlllimit(CurrentUser.getSifc());
                UserDAO.setDetailInWithdraw(CurrentUser.getSifc(), 3, new Date().getTime(), new Date().getTime());
            }
            double deposit = UserDAO.MoneyCheck(CurrentUser.getPin());
            if ((amt < deposit) && (amt >= 100)) {
                counter = UserDAO.getCount(CurrentUser.getSifc());
                if (counter == 0) {
                    ms3 = UserDAO.getMiliseconds(CurrentUser.getSifc());
                    if (ms3 != 0) {
                        ms4 = new Date().getTime() - ms3;
                       if (ms4 < 486400000) {
                            JOptionPane.showMessageDialog(null, "You reached the limit of Withdraw in a day\n\nTry Again after " + (24 - ((ms4 / 1000) / 60 / 60)) + " Hours", "LIMIT CROSS", JOptionPane.INFORMATION_MESSAGE);
                            new EnterSifcCode().setVisible(true);
                            this.dispose();
                            return;
                        } 
                    }
                }
                else if (counter == -1) {
                    UserDAO.setDetailInWithdraw(CurrentUser.getSifc(), 3, new Date().getTime(), new Date().getTime());
                    counter = UserDAO.getCount(CurrentUser.getSifc());
                }
                if (counter != -1) {
                    double transact = deposit - amt;
                    if (UserDAO.WithdrawUpdate(transact, CurrentUser.getPin())) {
                        ms1 = setTimeWithdraw();
                        UserDAO.setTimeDateWithdraw(ms1);
                        int result = JOptionPane.showConfirmDialog(null, "Take Your Money or Do you Want to see the Balance\n\n" + (counter - 1) + " Attempts left in Withdrawing in a day", "Succes", JOptionPane.OK_CANCEL_OPTION);
                        UserDAO.setCount(CurrentUser.getSifc(), counter - 1, new Date().getTime());
                        if (result == JOptionPane.OK_OPTION) {
                            JOptionPane.showMessageDialog(null, "Your balance is " + UserDAO.MoneyCheck(CurrentUser.getPin()), "Your Balance!!", JOptionPane.INFORMATION_MESSAGE);
                            new Home().setVisible(true);
                            this.dispose();
                        } else {
                            new EnterSifcCode().setVisible(true);
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Problem in Withdrawing", "WARNING", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "InSufficient Money to Withdraw or Atleast enter 100 RS", "LESS MONEY", JOptionPane.WARNING_MESSAGE);
                txtmoney.setText("");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problem in withdrawing the money in database", "WARNING", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnenterActionPerformed

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
            java.util.logging.Logger.getLogger(withDrawn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withDrawn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withDrawn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withDrawn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withDrawn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnenter;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblsati;
    private javax.swing.JTextField txtmoney;
    // End of variables declaration//GEN-END:variables

}
