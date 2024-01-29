
package com.mycompany.randomnumbergame;

import java.awt.Color;
import java.awt.Window;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.UIManager;


public class Game extends javax.swing.JFrame {
    int val;
    static int attempts=1;
    

    public Game() {
        initComponents();
        Random r1=new Random();
        val = r1.nextInt(100) + 1;
        lblAttempt.setText("1");
        
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblGuessing = new javax.swing.JLabel();
        lblChecker = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();
        txtGuess = new javax.swing.JTextField();
        txtAns = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        btnRetry = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblAttempt = new javax.swing.JLabel();
        lblOver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 60)); // NOI18N
        jLabel1.setText("NUMBER_GAME");
        panelGame.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 545, -1));

        lblInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInfo.setText("ENTER A NUMBER BETWEEN 1-100");
        panelGame.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 313, 20));

        lblGuessing.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblGuessing.setText("GUESS R ?");
        panelGame.add(lblGuessing, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 207, -1));

        lblChecker.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblChecker.setText("#codeSoft Checker");
        panelGame.add(lblChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 360, -1));

        lblR.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        lblR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblR.setText("R");
        lblR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panelGame.add(lblR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 112, 96));

        txtGuess.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtGuess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGuess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panelGame.add(txtGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 94, 77));

        txtAns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panelGame.add(txtAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 290, 58));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/randomnumbergame/Images/codeSoft.png"))); // NOI18N
        panelGame.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        btnCheck.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCheck.setText("CHECK");
        btnCheck.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckMouseExited(evt);
            }
        });
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        panelGame.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 90, 40));

        btnRetry.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetry.setText("RETRY");
        btnRetry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnRetry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetryMouseExited(evt);
            }
        });
        btnRetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetryActionPerformed(evt);
            }
        });
        panelGame.add(btnRetry, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 80, 40));

        btnRestart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRestart.setText("RESTART");
        btnRestart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnRestart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestartMouseExited(evt);
            }
        });
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });
        panelGame.add(btnRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 370, 90, 40));

        btnQuit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuit.setText("QUIT");
        btnQuit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuitMouseExited(evt);
            }
        });
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        panelGame.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 80, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Attempts:");
        panelGame.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 80, 30));

        lblAttempt.setBackground(new java.awt.Color(255, 255, 255));
        lblAttempt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAttempt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAttempt.setText("0");
        lblAttempt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelGame.add(lblAttempt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 40, 30));

        lblOver.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lblOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelGame.add(lblOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 700, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Max Attempts:");
        panelGame.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("5");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelGame.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 40, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255,200));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg4.jpg"))); // NOI18N
        jLabel6.setOpaque(false);
        panelGame.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 700, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGame, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
     
        if(txtGuess.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Please Guess a number");
       }   
       else if(Integer.parseInt(txtGuess.getText())<1){
            JOptionPane.showMessageDialog(null,"Please enter a number between 1-100");
       }
       else if(Integer.parseInt(txtGuess.getText())>100){
            JOptionPane.showMessageDialog(null,"Please enter a number between 1-100");
       }
       else{
           
           if(Integer.parseInt(txtGuess.getText())==val){
               lblR.setText(Integer.toString(val));
               txtAns.setText("Congratulations!!! you have made it Right...");
                txtAns.setBackground(Color.GREEN);

           }
           else if( (Integer.parseInt(txtGuess.getText())>val && Integer.parseInt(txtGuess.getText())<val+10) || (Integer.parseInt(txtGuess.getText())<val && Integer.parseInt(txtGuess.getText())>val-10) ){
              lblR.setText(Integer.toString(val));
               txtAns.setText("TOO CLOSE....");
                txtAns.setBackground(Color.YELLOW);
           }
           else{
                lblR.setText(Integer.toString(val));
               txtAns.setText("OOPS!! That's Incorrect..Let's Try Again..");
                txtAns.setBackground(Color.RED);
           }
           
       }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnRetryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetryActionPerformed
      Game g1 = new Game();

    if (attempts >= 5) {
        g1.lblOver.setText("Game Over !!!");
       
        g1.lblGuessing.setVisible(false);
        g1.txtGuess.setVisible(false);
        g1.lblInfo.setVisible(false);
        g1.lblR.setVisible(false);
        g1.lblChecker.setVisible(false);
        g1.txtAns.setVisible(false);
        g1.btnCheck.setVisible(false);
        g1.btnRetry.setVisible(false);
        g1.lblOver.setOpaque(true);
        g1.lblOver.setBackground(Color.RED);
    } else {
        attempts++;
        g1.lblAttempt.setText(Integer.toString(attempts));
    }

    g1.setVisible(true);
     
    }//GEN-LAST:event_btnRetryActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
     int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);

    if (result == JOptionPane.OK_OPTION) {
        // Dispose of all open forms
        for (Window window : Window.getWindows()) {
            if (window instanceof Game) {
                ((Game) window).dispose();
            }
        }
    }




 
       
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        lblOver.setText("");
        attempts=1;
       
        lblGuessing.setVisible(true);
        txtGuess.setVisible(true);
        lblInfo.setVisible(true);
        lblR.setVisible(true);
        lblChecker.setVisible(true);
        txtAns.setVisible(true);
        btnCheck.setVisible(true);
        btnRetry.setVisible(true);
        lblOver.setOpaque(false);
        lblOver.setBackground(new Color(0, 0, 0, 0)); 
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnCheckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseEntered
      btnCheck.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnCheckMouseEntered

    private void btnCheckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseExited
       btnCheck.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnCheckMouseExited

    private void btnRetryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetryMouseEntered
        btnRetry.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnRetryMouseEntered

    private void btnRetryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetryMouseExited
        btnRetry.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnRetryMouseExited

    private void btnRestartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestartMouseEntered
        btnRestart.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnRestartMouseEntered

    private void btnRestartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestartMouseExited
       btnRestart.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnRestartMouseExited

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnQuitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseEntered
        btnQuit.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnQuitMouseEntered

    private void btnQuitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseExited
        btnQuit.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnQuitMouseExited

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnRetry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAttempt;
    private javax.swing.JLabel lblChecker;
    private javax.swing.JLabel lblGuessing;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblOver;
    private javax.swing.JLabel lblR;
    private javax.swing.JPanel panelGame;
    private javax.swing.JTextField txtAns;
    private javax.swing.JTextField txtGuess;
    // End of variables declaration//GEN-END:variables
}
