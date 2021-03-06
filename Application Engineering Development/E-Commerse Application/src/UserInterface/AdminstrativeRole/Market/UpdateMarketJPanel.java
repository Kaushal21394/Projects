/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminstrativeRole.Market;

import business.configuration.Business;
import business.market.Market;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chava
 */
public class UpdateMarketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateMarketJPanel
     */
    JPanel userProcessContainer;
    Business business;
    Market market;
    public UpdateMarketJPanel(JPanel userProcessContainer, Business business, Market market) {
        initComponents();
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        this.market= market;
        txtMarketId.setText(market.getMarketId());
        txtMarketName.setText(market.getMarketName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMarketName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMarketId = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("UPDATE MARKET");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 160, 30));

        jLabel3.setText("Market Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        txtMarketName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarketNameKeyPressed(evt);
            }
        });
        add(txtMarketName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, -1));

        btnCreate.setText("Update");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel6.setText("Market Id :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtMarketId.setEnabled(false);
        txtMarketId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarketIdActionPerformed(evt);
            }
        });
        txtMarketId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarketIdKeyPressed(evt);
            }
        });
        add(txtMarketId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarketNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarketNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') || (c==evt.VK_SPACE) || (c==evt.VK_CAPS_LOCK) || (c==evt.VK_SHIFT)||
            (c == evt.VK_BACK_SPACE) ||
            (c == evt.VK_DELETE))) {

        JOptionPane.showMessageDialog(null, "Enter Alphabets only");
        txtMarketName.setText("");
        }
    }//GEN-LAST:event_txtMarketNameKeyPressed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try{
            if(!txtMarketName.getText().isEmpty()){
                market.setMarketName(txtMarketName.getText());
                JOptionPane.showMessageDialog(null, "Updated successfully");
            }
            else{
                JOptionPane.showMessageDialog(null, "Please enter all values");
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence. Technical team is working on it.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageMarketJPanel jPanel = (ManageMarketJPanel) component;
        jPanel.populateMarketTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtMarketIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarketIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarketIdKeyPressed

    private void txtMarketIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarketIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarketIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtMarketId;
    private javax.swing.JTextField txtMarketName;
    // End of variables declaration//GEN-END:variables
}
