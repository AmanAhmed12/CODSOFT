
package com.mycompany.currencyconverter;

import javax.swing.JOptionPane;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import java.awt.Color;

import javax.swing.JOptionPane;

public class Converter extends javax.swing.JFrame {
  private Color defaultBackgroundColor;
    public Converter() {
        initComponents();
    }
 public void convertCurrency(double amount, String from, String to) {
        try {
            double exchangeRate = getExchangeRate(from, to);

            if (exchangeRate > 0) {
                double convertedAmount = amount * exchangeRate;
                lblConvertAmount.setOpaque(true);
                lblConvertAmount.setBackground(Color.GREEN);
                lblConvertAmount.setText(Double.toString(convertedAmount));
                
            } else {
                JOptionPane.showMessageDialog(null, "Failed to fetch exchange rate for " + from + " to " + to);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error converting currency: " + e.getMessage());
        }
    }
 
  private double getExchangeRate(String from, String to) {
        try {
            if ("LK".equals(from) && "INR".equals(to)) {
               
                String apiUrl = "https://api.exchangerate-api.com/v4/latest/LKR";
                JsonNode response = Unirest.get(apiUrl)
                        .header("accept", "application/json")
                        .asJson()
                        .getBody();

              
                double exchangeRate = response.getObject()
                        .getJSONObject("rates")
                        .getDouble("INR");
                lblCurrency.setText("(INR)");
                return exchangeRate;
            } else if ("INR".equals(from) && "LK".equals(to)) {
                
                String apiUrl = "https://api.exchangerate-api.com/v4/latest/INR";
                JsonNode response = Unirest.get(apiUrl)
                        .header("accept", "application/json")
                        .asJson()
                        .getBody();

                double exchangeRate = response.getObject()
                        .getJSONObject("rates")
                        .getDouble("LKR");
                 lblCurrency.setText("(LK)");
                return exchangeRate;
            }

          
            return -1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error fetching exchange rate: " + e.getMessage());
            return -1;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblConvertAmount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbFrom = new javax.swing.JComboBox<>();
        cmbTo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        lblCurrency = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Currency _Converter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 280, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Converted Currency");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        lblConvertAmount.setBackground(new java.awt.Color(204, 204, 204));
        lblConvertAmount.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblConvertAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConvertAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblConvertAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 43));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Amount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("From");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 37, -1));

        cmbFrom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "LK", "INR", " " }));
        cmbFrom.setBorder(null);
        jPanel1.add(cmbFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 110, 30));

        cmbTo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "LK", "INR", " " }));
        cmbTo.setBorder(null);
        cmbTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbToActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 340, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("To");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 37, -1));

        btnConvert.setBackground(new java.awt.Color(153, 153, 255));
        btnConvert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConvert.setText("Convert ");
        btnConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        btnConvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvertMouseExited(evt);
            }
        });
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 110, 40));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAmount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(153, 153, 255), null, null));
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 290, 45));

        lblCurrency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(lblCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 70, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 90, 90));

        btnClear.setBackground(new java.awt.Color(153, 153, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbToActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed

      try {
            double amount = Double.parseDouble(txtAmount.getText());
            String from = (String) cmbFrom.getSelectedItem();
            String to = (String) cmbTo.getSelectedItem();

            convertCurrency(amount, from, to);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please enter an amount to convert");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for the amount");
        }
      
     
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnConvertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertMouseEntered
      defaultBackgroundColor = btnConvert.getBackground();  
    btnConvert.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnConvertMouseEntered

    private void btnConvertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertMouseExited
         btnConvert.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnConvertMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
         defaultBackgroundColor = btnConvert.getBackground();  
    btnConvert.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
      btnConvert.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnClearMouseExited

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        lblCurrency.setText("");
        lblConvertAmount.setText("");
        txtAmount.setText("");
        cmbFrom.setSelectedIndex(0);
        cmbTo.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox<String> cmbFrom;
    private javax.swing.JComboBox<String> cmbTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConvertAmount;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
