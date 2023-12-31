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
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class miniStatement extends javax.swing.JFrame {
private DefaultTableModel model1,model2;
 private List<miniStatementPojo> detailTransact;   
/**
     * Creates new form miniStatement
     */
    public miniStatement() {
        initComponents();
        this.setLocationRelativeTo(null);
        model1=(DefaultTableModel)tblhistory.getModel();
        model2=(DefaultTableModel)tblhistory1.getModel();
        loadAllWithdrawResult();
        loadAllDepositResult();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhistory = new javax.swing.JTable();
        btnlogout1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblhistory1 = new javax.swing.JTable();
        btnclearwithdraw = new javax.swing.JButton();
        btncleardeposit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SATI BANK");

        tblhistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SIFC CODE", "Money Deducted", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblhistory);

        btnlogout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout1.setText("LOG OUT");
        btnlogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogout1ActionPerformed(evt);
            }
        });

        tblhistory1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SIFC CODE", "Money Deposit", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblhistory1);

        btnclearwithdraw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclearwithdraw.setText("Clear History of Withdraw");
        btnclearwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearwithdrawActionPerformed(evt);
            }
        });

        btncleardeposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncleardeposit.setText("Clear History of Deposit");
        btncleardeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncleardepositActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deposit Statements");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Withdraw Statements");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(190, 190, 190)
                .addComponent(btnlogout1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(btncleardeposit)
                .addGap(274, 274, 274))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(btnclearwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnlogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclearwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncleardeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnlogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogout1ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogout1ActionPerformed

    private void btnclearwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearwithdrawActionPerformed
        try{
            if(UserDAO.deleteWithdrawHistory(CurrentUser.getSifc()))
            {
                JOptionPane.showMessageDialog(null,"History Cleared of Withdraw","CLEAR!!",JOptionPane.INFORMATION_MESSAGE );
                new Home().setVisible(true);
                this.dispose();
            }
            else{
                 JOptionPane.showMessageDialog(null,"No transaction or deposit Found","Not FOUND!!",JOptionPane.INFORMATION_MESSAGE );
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in Clearing History in Database","ERROR",JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_btnclearwithdrawActionPerformed

    private void btncleardepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncleardepositActionPerformed
         try{
            if(UserDAO.deleteDepositHistory(CurrentUser.getSifc()))
            {
                JOptionPane.showMessageDialog(null,"History Cleared of Deposit","CLEAR!!",JOptionPane.INFORMATION_MESSAGE );
                new Home().setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"No transaction or deposit Found","Not FOUND!!",JOptionPane.INFORMATION_MESSAGE );
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in Clearing History in Database","ERROR",JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_btncleardepositActionPerformed

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
            java.util.logging.Logger.getLogger(miniStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(miniStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(miniStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(miniStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new miniStatement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncleardeposit;
    private javax.swing.JButton btnclearwithdraw;
    private javax.swing.JButton btnlogout1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblhistory;
    private javax.swing.JTable tblhistory1;
    // End of variables declaration//GEN-END:variables
    private void loadAllWithdrawResult() {
         try{
            detailTransact=UserDAO.gettransHistoryWithdraw(CurrentUser.getSifc());
            for(miniStatementPojo detail: detailTransact){
                Vector<String> row=new Vector<>();
                row.add(detail.getSifcCode());
                row.add((String.valueOf(detail.getMoneyDeducted())));
                row.add(detail.getDate_transact());
                row.add(detail.getTime_transact());
                model1.addRow(row);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "SQL Error","Db problem",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); 
        } 
    }
    private void loadAllDepositResult() {
         try{
            detailTransact=UserDAO.gettransHistoryDeposit(CurrentUser.getSifc());
            for(miniStatementPojo detail: detailTransact){
                Vector<String> row=new Vector<>();
                row.add(detail.getSifcCode());
                row.add((String.valueOf(detail.getMoneyDeposit())));
                row.add(detail.getDate_transact());
                row.add(detail.getTime_transact());
                model2.addRow(row);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "SQL Error","Db problem",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); 
        } 
    }
}
