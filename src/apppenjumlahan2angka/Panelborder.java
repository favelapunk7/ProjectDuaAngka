/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppenjumlahan2angka;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Panelborder extends javax.swing.JPanel {

    /**
     * Creates new form Panelborder
     */
    public Panelborder() {
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
        jLabel1 = new javax.swing.JLabel();
        textangka2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textangka1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        texthasil = new javax.swing.JTextField();
        buttonjumlah = new javax.swing.JButton();
        buttonreset = new javax.swing.JButton();
        buttonkeluar = new javax.swing.JButton();
        buttonkali = new javax.swing.JButton();
        buttonkurang = new javax.swing.JButton();
        buttonbagi = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("APP PENJUMLAHAN ANGKA"));
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setText("Angka Kedua");

        textangka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textangka2ActionPerformed(evt);
            }
        });
        textangka2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textangka2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textangka2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textangka2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        jLabel2.setText("Angka Pertama");

        textangka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textangka1ActionPerformed(evt);
            }
        });
        textangka1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textangka1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textangka1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textangka1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));

        jLabel3.setText("Hasil");

        texthasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texthasilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texthasil, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texthasil)
                .addContainerGap())
        );

        buttonjumlah.setText("+");
        buttonjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonjumlahActionPerformed(evt);
            }
        });

        buttonreset.setText("Reset");
        buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonresetActionPerformed(evt);
            }
        });

        buttonkeluar.setText("Keluar");
        buttonkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkeluarActionPerformed(evt);
            }
        });

        buttonkali.setText("x");
        buttonkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkaliActionPerformed(evt);
            }
        });

        buttonkurang.setText("-");
        buttonkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkurangActionPerformed(evt);
            }
        });

        buttonbagi.setText(":");
        buttonbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbagiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonjumlah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonkurang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonkali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonbagi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonkeluar)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonjumlah)
                    .addComponent(buttonreset)
                    .addComponent(buttonkeluar)
                    .addComponent(buttonkali)
                    .addComponent(buttonkurang)
                    .addComponent(buttonbagi))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textangka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textangka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textangka2ActionPerformed

    private void textangka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textangka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textangka1ActionPerformed

    private void texthasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texthasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texthasilActionPerformed

    private void buttonjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonjumlahActionPerformed
        // TODO add your handling code here:
        prosestambah();
    }//GEN-LAST:event_buttonjumlahActionPerformed

    private void buttonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_buttonresetActionPerformed

    private void buttonkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkeluarActionPerformed
        // TODO add your handling code here:
        boolean alert=JOptionPane.showConfirmDialog(this, "Yakin mau keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION;
        if (alert){
            System.exit(0);
        }
    }//GEN-LAST:event_buttonkeluarActionPerformed
    
    private void buttonkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkaliActionPerformed
        // TODO add your handling code here:
        proseskali();
    }//GEN-LAST:event_buttonkaliActionPerformed

    private void buttonkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkurangActionPerformed
        // TODO add your handling code here:
        proseskurang();
    }//GEN-LAST:event_buttonkurangActionPerformed

    private void buttonbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbagiActionPerformed
        // TODO add your handling code here:
        prosesbagi();
    }//GEN-LAST:event_buttonbagiActionPerformed

    private void textangka1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textangka1KeyTyped
        // TODO add your handling code here:
        filterKeyTyped(evt);
    }//GEN-LAST:event_textangka1KeyTyped

    private void textangka2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textangka2KeyTyped
        // TODO add your handling code here:
        filterKeyTyped(evt);
    }//GEN-LAST:event_textangka2KeyTyped
    private void filterKeyTyped(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        if(!((Character.isDigit(c))||
                (c==KeyEvent.VK_BACK_SPACE)||
                (c==KeyEvent.VK_DELETE))){
            new JFrame().getToolkit().beep();
            JOptionPane.showMessageDialog(null, "masukkan hanya 0-9!");
            evt.consume();
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonbagi;
    private javax.swing.JButton buttonjumlah;
    private javax.swing.JButton buttonkali;
    private javax.swing.JButton buttonkeluar;
    private javax.swing.JButton buttonkurang;
    private javax.swing.JButton buttonreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textangka1;
    private javax.swing.JTextField textangka2;
    private javax.swing.JTextField texthasil;
    // End of variables declaration//GEN-END:variables

    private void prosestambah() {
        String strangka1=textangka1.getText();
        String strangka2=textangka2.getText();
        int angka1=Integer.valueOf(strangka1);
        int angka2=Integer.valueOf(strangka2);
        int hasil=angka1 + angka2;
        texthasil.setText(hasil + "");
    }

    private void reset() {
        textangka1.setText("");
        textangka2.setText("");
        textangka1.requestFocus();
    }

    private void proseskurang() {
        String strangka1=textangka1.getText();
        String strangka2=textangka2.getText();
        int angka1=Integer.valueOf(strangka1);
        int angka2=Integer.valueOf(strangka2);
        int hasil=angka1 - angka2;
        texthasil.setText(hasil + "");
    }

    private void prosesbagi() {
        String strangka1=textangka1.getText();
        String strangka2=textangka2.getText();
        int angka1=Integer.valueOf(strangka1);
        int angka2=Integer.valueOf(strangka2);
        int hasil=angka1 / angka2;
        texthasil.setText(hasil + "");
    }

    private void proseskali() {
        String strangka1=textangka1.getText();
        String strangka2=textangka2.getText();
        int angka1=Integer.valueOf(strangka1);
        int angka2=Integer.valueOf(strangka2);
        int hasil=angka1 * angka2;
        texthasil.setText(hasil + "");
    }

}
