
package com.mycompany.bank;

import javax.swing.JOptionPane;


public class Withdraw extends javax.swing.JFrame {
   private static UserAccount userAccount;
   
   
    public Withdraw(UserAccount account) {
        initComponents();
        userAccount=account;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Amount in Rupees:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHead.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        lblHead.setText("WELCOME TO CODSOFT ATM !!!");
        jPanel1.add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(204, 0, 0));
        lblInfo.setText("Please enter the  amount to be withdrawed...");
        jPanel1.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setText("Cash Withdrawal");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, -1));

        lblAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAmount.setText("Amount in Rupees:");
        jPanel2.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 144, -1));

        btnWithdraw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        jPanel2.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 350, 240));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setText("Thank you !!!  Come Again !!!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setText("Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        try{
            double withdrawAmount=Double.parseDouble(txtAmount.getText());
            userAccount.withdrawAmount(withdrawAmount);
            txtAmount.setText("");
           

        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please provide  Amount to Withdraw..");
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Amount Try Again ");
        }

    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnPrevActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new Withdraw(userAccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
