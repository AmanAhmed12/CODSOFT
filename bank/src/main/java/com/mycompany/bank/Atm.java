
package com.mycompany.bank;


public class Atm extends javax.swing.JFrame {
private UserAccount userAccount;
    
    public Atm() {
        initComponents();
        userAccount=new UserAccount(500);
    }
    
   

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnBal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 590));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnWithdraw.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnWithdraw.setText("Withdrawal");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        jPanel1.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 210, -1));

        btnDeposit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnDeposit.setText("Cash Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, -1));

        btnBal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnBal.setText("Balance Inquiry");
        btnBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        jLabel1.setText("CODSOFT ATM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 110, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Choose an action below...");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/card.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 390, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.jpeg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        Deposit d1=new Deposit(userAccount);
        d1.setVisible(true);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalActionPerformed
     userAccount.BalanceInquiry();
    }//GEN-LAST:event_btnBalActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
       Withdraw w1=new Withdraw(userAccount);
        w1.setVisible(true);
    }//GEN-LAST:event_btnWithdrawActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBal;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
